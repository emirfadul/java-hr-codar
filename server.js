const express = require('express');
const mongoose = require('mongoose');
const multer = require('multer');
const cors = require('cors');
const fs = require('fs');
const path = require('path');

const app = express();
const PORT = 3000;

// Configuração do CORS
app.use(cors());
app.use(express.json());

// Conectar ao MongoDB
mongoose.connect('mongodb://localhost:27017/drive_clone', {
    useNewUrlParser: true,
    useUnifiedTopology: true
}).then(() => console.log('MongoDB Conectado!'))
  .catch(err => console.error('Erro ao conectar ao MongoDB:', err));

// Definir schema do arquivo
const fileSchema = new mongoose.Schema({
    filename: String,
    path: String,
    size: Number,
    uploadedAt: { type: Date, default: Date.now }
});
const File = mongoose.model('File', fileSchema);

// Configuração do Multer para armazenar arquivos
const storage = multer.diskStorage({
    destination: (req, file, cb) => {
        const uploadDir = 'uploads/';
        if (!fs.existsSync(uploadDir)) fs.mkdirSync(uploadDir);
        cb(null, uploadDir);
    },
    filename: (req, file, cb) => {
        cb(null, Date.now() + path.extname(file.originalname));
    }
});
const upload = multer({ storage });

// Rota para upload de arquivos
app.post('/upload', upload.single('file'), async (req, res) => {
    try {
        const newFile = new File({
            filename: req.file.filename,
            path: req.file.path,
            size: req.file.size
        });
        await newFile.save();
        res.json({ success: true, message: 'Arquivo enviado!', file: newFile });
    } catch (error) {
        res.status(500).json({ success: false, message: 'Erro ao salvar o arquivo.' });
    }
});

// Rota para listar arquivos
app.get('/files', async (req, res) => {
    try {
        const files = await File.find();
        res.json({ success: true, files });
    } catch (error) {
        res.status(500).json({ success: false, message: 'Erro ao buscar arquivos.' });
    }
});

// Rota para deletar arquivo
app.delete('/files/:id', async (req, res) => {
    try {
        const file = await File.findById(req.params.id);
        if (!file) return res.status(404).json({ success: false, message: 'Arquivo não encontrado.' });
        
        fs.unlinkSync(file.path); // Deleta o arquivo do diretório
        await file.deleteOne(); // Remove do MongoDB
        res.json({ success: true, message: 'Arquivo deletado!' });
    } catch (error) {
        res.status(500).json({ success: false, message: 'Erro ao deletar arquivo.' });
    }
});

// Iniciar o servidor
app.listen(PORT, () => console.log(`Servidor rodando na porta ${PORT}`));
