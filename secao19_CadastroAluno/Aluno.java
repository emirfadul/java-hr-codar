package secao19_CadastroAluno;

import java.util.Scanner;

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

    //adicionando notas ao array de notas
    public void adicionarNotas(Scanner scanner) {
        System.out.println("Digite as notas para o aluno " + nome + " : ");

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota " + (i + 1 + " : "));
            notas[i] = scanner.nextDouble();
        }
    }

    //calculando media
    public double calcularMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    //Mostrando se aluno aprovou
    public void exibirResultado() {
        double media = calcularMedia();

        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Media final: " + media);

        if (media >= 6) {
            System.out.println("Aluno aprovado!");

        } else {
            System.out.println("Aluno reprovado!");
        }
    }

}
