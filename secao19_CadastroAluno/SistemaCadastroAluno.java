package secao19_CadastroAluno;

import java.util.Scanner;

public class SistemaCadastroAluno {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //solicitar nr de alunos a serem cadastrados
        System.out.println("Quantos alunos deseja cadastrar? ");
        int numeroDeAlunos = scanner.nextInt();

        //criação de array de alunos
        Aluno[] alunos = new Aluno[numeroDeAlunos];

        //loop cadasgtrar alunos
        for (int i = 0; i < numeroDeAlunos; i++) {

            System.out.println("Cadastro de aluno " + (i + 1) + " : ");

            System.out.print("Nome: ");
            String nome = scanner.next();

            System.out.print("Matricula: ");
            String matricula = scanner.next();

            System.out.print("Quantidade de provas: ");
            int numeroDeNotas = scanner.nextInt();
            scanner.nextLine();

            Aluno aluno = new Aluno(nome, matricula, numeroDeNotas);

            //adicionar as notas
            //armazenar o aluno no array
            alunos[i] = aluno;
        }

        System.out.println("O aluno é " + alunos[0].getNome());

        scanner.close();

    }

}
