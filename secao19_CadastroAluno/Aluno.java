package secao19_CadastroAluno;

public class Aluno {

    //CRIAR AS PROPRIEDADES
    private String nome;
    private String matricula;
    private double[] notas;

    //construtor
    public Aluno(String nome, String matricula, int numeroDeNotas) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = new double[numeroDeNotas];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

}
