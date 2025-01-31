package secao17;

public class Exercicios {

    public static void main(String[] args) {

        Celular iphone = new Celular();

        iphone.marca = "Apple";
        iphone.modelo = "Iphone 15";

        iphone.ligar();
        iphone.desligar();
        iphone.usar(10);

        System.out.println("-----------------");

        Celular s10 = new Celular();

        s10.marca = "samsung";
        s10.modelo = "S10";

        s10.ligar();
        s10.desligar();
        s10.usar(10);

        System.out.println("-----------------");

        Aluno pedro = new Aluno("pedro", 1234, 60.50);
        System.out.println("Antes do trabalho.");
        System.out.println("O aluno: " + pedro.getNome());
        System.out.println("Obteve nota: " + pedro.getNotaFinal());

        System.out.println("Apos do trabalho.");

        pedro.setNome("Pedro alves");
        pedro.setNotaFinal(84.50);

        pedro.exibirInfo();
        System.out.println("-----------------");

        Aluno maria = new Aluno("maria", 5522, 68.50);
        maria.exibirInfo();

        //exercicio 4
        System.out.println("-----------------");

        ProdutoEletronico microondas = new ProdutoEletronico("microondas", 600.00, 6);

        microondas.aplicarDesconto(15);
        microondas.exibirInfo();

        microondas.setNome("fogao");
        microondas.setPreco(900.00);
        microondas.setGarantia(9);

        microondas.exibirInfo();

        System.out.println("-----------------");

        // exercicio 5
        LivroBiblioteca livro1 = new LivroBiblioteca();

        livro1.setTitulo("Java como programar.");

        livro1.devolver();
        livro1.pegarEmprestado();
        livro1.pegarEmprestado();
        livro1.devolver();

    }

}
