package secao22;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

import javax.imageio.ImageIO;

public class Arquivo {

    public static void main(String[] args) {

        //Leitura arquivo
        System.out.println("------- Leitura Arquivo ------");

        String currentDir = System.getProperty("user.dir")+"/secao22/";

        System.out.println(currentDir+"arquivo.txt");
        System.out.println("/home/emir/java/hora_de_codar/secao22");

        //FileReader
        System.out.println("------- FileReader ------");

        try (FileReader reader = new FileReader(currentDir+"arquivo.txt")) {

            int caracter;

            while ((caracter = reader.read()) != -1) {

                System.out.print((char) caracter);                    
            }
            System.out.println("\n");            
            
        } catch (Exception e) {
            System.out.println("Erro ao ler arquivo: "+e.getMessage());
        }

        //BufferedReader
        System.out.println("------- BufferedReader ------");

        try (BufferedReader reader = new BufferedReader(new FileReader(currentDir+"arquivo.txt"))) {

            String linha;

            while ((linha = reader.readLine()) != null) {

                System.out.println(linha);                
            }
            
        } catch (Exception e) {
            System.out.println("Erro ao ler arquivo: "+e.getMessage());
        }        

        //FileWriter (escrever em arquivo)
        System.out.println("------- FileWriter ------");

        try (FileWriter writer = new FileWriter(currentDir+"saida.txt")) {
            
            writer.write("escrevendo em arquivo\n");
            writer.write("escrevendo em arquivo novamente");
            
        } catch (Exception e) {
            System.out.println("Erro ao escrever arquivo: "+e.getMessage());
        }

        //BufferedWriter (escrever em arquivo)
        System.out.println("------- BufferedWriter ------");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(currentDir+"saida2.txt"))) {
            
            writer.write("escrevendo em arquivo com Buffered");
            writer.newLine(); //acrescentar uma linha.
            writer.write("escrevendo em arquivo novamente com Buffered");
            writer.newLine(); //acrescentar uma linha.

            
        } catch (Exception e) {
            System.out.println("Erro ao escrever arquivo: "+e.getMessage());
        }

        //BufferedWriter (escrever em arquivo com apend)
        System.out.println("------- BufferedWriter c/ apend------");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(currentDir+"saida2.txt", true))) {
            
            writer.append("acrescentando uma linha ao texto existente.");
            
        } catch (Exception e) {
            System.out.println("Erro ao escrever arquivo: "+e.getMessage());
        }

        //Serialização de Objetos
        System.out.println("------- Serialização de Objetos ------");

        Pessoa pessoa = new Pessoa("Emir", 53);

        System.out.println("Nome: "+pessoa.getNome());
        System.out.println("Idade: "+pessoa.getIdade());

        //Serialização (output)
        System.out.println("------- Serialização ------");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(currentDir+"pessoa.ser"))) {
            
            oos.writeObject(pessoa);

            System.out.println("Objeto serializado com sucesso!");
            
        } catch (Exception e) {
            System.out.println("Erro ao serializar objeto: "+e.getMessage());
        }

        //Deserialização (input)
        System.out.println("------- Deserialização ------");

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(currentDir+"pessoa.ser"))) {

            Pessoa pessoa2 = (Pessoa) ois.readObject();

            System.out.println("Nome: "+pessoa2.getNome());
            System.out.println("Idade: "+pessoa2.getIdade());
            
        } catch (Exception e) {
            System.out.println("Erro ao Deserializar objeto: "+e.getMessage());
        }

        //Manipulação de binarios
        System.out.println("------- Manipulação de binarios ------");

        try (
            FileInputStream fis = new FileInputStream(currentDir+"imagem.jpg");
            FileInputStream fos = new FileInputStream(currentDir+"copia_imagem.jpg");    
        ) {           

            int byteData;

            while ((byteData = fis.read()) != -1){
            //  fos.write(byteData);                 
            }

            System.out.println("Arquivo copiado com sucesso");
            
        } catch (Exception e) {
            System.out.println("Erro ao copiar arquivo: "+e.getMessage());
        }


        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(currentDir+"video.mkv"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(currentDir+"copia_video.mkv"));         
        ) {

            byte[] buffer = new byte[1024];
            int bytesLidos;

            while ((bytesLidos = bis.read(buffer)) != -1) {
                bos.write(buffer,0,bytesLidos);                
            }

            System.out.println("Video copiado com sucesso.");

        } catch (Exception e) {
            System.out.println("Erro ao copiar arquivo: "+e.getMessage());
        }


        //Manipulação de imagem
        System.out.println("------- Manipulação de imagem ------");

        try {
        BufferedImage imagem = ImageIO.read(new File(currentDir+"imagem.jpg"));

            if (imagem == null) {
                System.out.println("A imagem não pode ser carregada");                
            }

            Graphics2D g2d = imagem.createGraphics();

            g2d.setFont(new Font("Arial",Font.BOLD, 50));

            FontMetrics fm = g2d.getFontMetrics();

            String texto = "Texto no Centro";

            //centralizar imagem
            int larguraTexto = fm.stringWidth(texto);
            int alturaTexto = fm.getHeight();

            //posicionamento
            int x = (imagem.getWidth() - larguraTexto) / 2;
            int y = (imagem.getHeight() - alturaTexto) / 2 + fm.getAscent();

            //desenhar retangulo ao fundo texto
            g2d.setColor(Color.BLACK);
            g2d.fillRect(x - 10, y - fm.getAscent(), larguraTexto + 20, alturaTexto);

            //desenhar texto em cima do retangulo
            g2d.setColor(Color.RED);
            g2d.drawString(texto, x, y);

            //liberaçao recursos
            g2d.dispose();

            //salvar imagem
            File outputFile = new File(currentDir+"imagemtexto.jpg");

            ImageIO.write(imagem, "png'", outputFile);

            System.out.println("Gerou o texto na imagem com sucesso");

        } catch (Exception e) {
            System.out.println("Erro ao processar imagem: "+e.getMessage());
        }

        //Manipulação Arquivos 
        System.out.println("------- Manipulação de Arquivos ------");

        Path caminhoDiretorio = Paths.get(currentDir+"diretorioNovo");

        try {

            if (!Files.exists(caminhoDiretorio)) {
                Files.createDirectories(caminhoDiretorio);
                System.out.println("Diretorio criado com sucesso: "+caminhoDiretorio.toString());                
            }else{
                System.out.println("Diretorio ja existe.");
            }
        
        } catch (Exception e) {
            System.out.println("Erro ao criar diretorio: "+e.getMessage());
        }

        //Manipulação Arquivos, criar, copiar e mover 
        System.out.println("------- Manipulação de Arquivos criar copiar mover------");
        
        Path caminhhoArquivoOriginal = Paths.get(currentDir+"arquivo_criado.txt");
        Path caminhhoArquivoCopia = Paths.get(currentDir+"arquivo_criado_copia.txt");
        Path caminhhoArquivoMovido = Paths.get(currentDir+"diretorioNovo","arquivo_movido.txt");

        try {
                //criar
            if (!Files.exists(caminhhoArquivoOriginal)) {
                Files.createFile(caminhhoArquivoOriginal);   
                System.out.println("Arquivo criado.");             
            }
            //copiar
            if (!Files.exists(caminhhoArquivoCopia)) {
                Files.copy(caminhhoArquivoOriginal, caminhhoArquivoCopia);                
            }
                //mover
            Files.move(caminhhoArquivoCopia, caminhhoArquivoMovido);
        
        } catch (Exception e) {
            System.out.println("Erro ao manipular arquivos: "+e.getMessage());
        }

        //Arquivos temporários 
        System.out.println("------- Arquivos Temporários ------");

        try {

            Path arquivoTemporario = Files.createTempFile("meuTempFile", ".txt");
            System.out.println("Arquivo criado em : "+arquivoTemporario.toAbsolutePath());

            Files.writeString(arquivoTemporario, "Texto Conteudo TEmporário");

            String conteudo = Files.readString(arquivoTemporario);

            System.out.println("Conteudo: "+conteudo);

            Files.deleteIfExists(arquivoTemporario);
            
        } catch (Exception e) {
            System.out.println("Erro ao criar arquivo temporário: "+e.getMessage());
        }

        //Arquivos Zip comprimir 
        System.out.println("------- Arquivos Zip comprimir ------");

        Path arquivoOriginal = Paths.get(currentDir+"arquivo.txt");
        Path arquivoZip = Paths.get(currentDir+"arquivo_comprimido.zip");

        try (
            ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(arquivoZip.toFile()));
            FileInputStream fis = new FileInputStream(arquivoOriginal.toFile());
            ) {

            //cria uma entrada zip para o arquivo
            ZipEntry zipEntry = new ZipEntry(arquivoOriginal.getFileName().toString());

            zos.putNextEntry(zipEntry);

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
            zos.write(buffer, 0, bytesRead);               
            }

            zos.closeEntry();
            System.out.println("Arquivo compactado com sucesso.");
        
        } catch (Exception e) {
            System.out.println("Erro ao zipar os arquivos: "+e.getMessage());
        }

        //Arquivos Zip descomprimir 
        System.out.println("------- Arquivos Zip descomprimir ------");

        Path arquivoZipado = Paths.get(currentDir+"arquivo_comprimido.zip");
        Path destino = Paths.get(currentDir+"descompatado");

        try (
            ZipInputStream zis = new ZipInputStream(new FileInputStream(arquivoZipado.toFile()))
        ) {
            ZipEntry zipEntry;

            //criar diretorio
            if (!Files.exists(destino)) {
                Files.createDirectories(destino);
            }

            //iterar em cada arquivo zip
            while ((zipEntry = zis.getNextEntry()) != null) {

                Path caminhoDestino = destino.resolve(zipEntry.getName());

                try (FileOutputStream fos = new FileOutputStream(caminhoDestino.toFile())) {
                    
                    byte[] buffer = new byte[1024];
                    int bytesRead;

                    while ((bytesRead = zis.read(buffer)) != -1) {
                        fos.write(buffer, 0, bytesRead);               
                    }

                System.out.println("Arquivo descompatado: "+caminhoDestino);

                zis.closeEntry();
                    
                }               
            }
            
        } catch (Exception e) {
            System.out.println("Erro ao descompactar os arquivos: "+e.getMessage());
        }  

        //Manipulação CSV leitura
        System.out.println("------- Manipulação CSV leitura------");

        String arquivoCSV = currentDir + "dados.csv";
        String linha;
        String separador = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(arquivoCSV))) {

            while ((linha = br.readLine()) != null) {

                //dividir a string ou explodir a string em array
                String[] dados = linha.split(separador);

                System.out.println("Nome: "+dados[0]+", idade: "+dados[1]+", cidade: "+dados[2]);                
            }            
            
        } catch (Exception e) {
            System.out.println("Erro ao ler CSV: "+e.getMessage());
        }

        //Manipulação CSV escrita
        System.out.println("------- Manipulação CSV escrita------");

        String arquivoEscritaCSV = currentDir + "dadosEscrita.csv";
        
        try (FileWriter writer = new FileWriter(arquivoEscritaCSV)) {

            //inserção de linha a linha, respeitando o separador e quebrando linha no final
            writer.append("Nome, idade, cidade\n");
            writer.append("emir, 53, Manaus\n");
            writer.append("joao, 42, Autazes\n");
            writer.append("carlos, 48, Iranduba\n");

            System.out.println("Conteudo gravado no CSV com sucesso.");
            
        } catch (Exception e) {
            System.out.println("Erro ao escrever CSV: "+e.getMessage());
        }

    }
    
}