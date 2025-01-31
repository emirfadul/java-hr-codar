package secao17;

import java.util.Arrays;

public class POO2 {

    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario("emir", 2000.00, "teste123");

        funcionario1.exibirDados();

        funcionario1.nome = "fadul";
        funcionario1.salario = 5000;
        //funcionario1.senha = "280571";

        funcionario1.exibirDados();

        System.out.println("--------------");

        Funcionario funcionario2 = new Funcionario("joao", 5000.00, "13456");
        funcionario2.exibirDados();

        funcionario2.nome = "carlos";
        funcionario2.salario = 15000;
        //funcionario2.senha = "280571";

        funcionario2.exibirDados();

        funcionario1.aumentarSalario(10);
        funcionario2.aumentarSalario(30);

        if (funcionario1.autenticar("teste123")) {
            System.out.println("Usuario entrou no sistema.");
        }

        // CLASSE IMUTAVEL
        System.out.println("----CLASSE IMUTAVEL----------");

        PessoaImutavel joaquim = new PessoaImutavel("joaqim", 23);

        System.out.println(joaquim.getIdade());
        System.out.println(joaquim.getNome());

        // ENCAPSULAMENTO ARRAYS        
        System.out.println("-----ENCAPSULAMENTO ARRAYS---------");

        String[] meusAlunos = {"mateus", "joao", "maria"};

        Turma novaTurma = new Turma(meusAlunos);

        System.out.println(Arrays.toString(novaTurma.getAlunos()));

        String[] outrosAlunos = {"Aluno1", "Aluno2"};

        novaTurma.setAlunos(outrosAlunos);

        System.out.println(Arrays.toString(novaTurma.getAlunos()));

    }

}
