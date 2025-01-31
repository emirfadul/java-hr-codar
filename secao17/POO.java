package secao17;

public class POO {

    public static void main(String[] args) {

        Carro fusca = new Carro();

        fusca.marca = "VW";
        fusca.modelo = "Fusca";
        fusca.ano = 1977;

        fusca.acelerar();
        fusca.exibirInfo();

        Carro carro2 = new Carro();

        carro2.marca = "fiat";
        carro2.modelo = "palio";

        //carro2.acelerar();
        carro2.exibirInfo();

        System.out.println(fusca == carro2);

        // METODO
        fusca.aumentarVelocidade(10.0);

        fusca.ligarMotor();

        fusca.aumentarVelocidade(30.0);
        fusca.aumentarVelocidade(40.0);

        System.out.println(fusca.motorLigado);

        Pessoa joao = new Pessoa();

        joao.setNome("joao");
        System.out.println("O nome do joão é: " + joao.getNome());

        joao.setIdade(33);

        System.out.println("A idade de joão é: " + joao.getIdade());

        // SETTERS
        ContaBancaria ContaDaAna = new ContaBancaria();
        ContaDaAna.setTitular("Ana");

        ContaDaAna.setSaldo(1000);

        ContaDaAna.exibirInfo();

        System.out.println("O nome titular é "+ContaDaAna.getTitular());
        System.out.println("O saldo é R$ "+ContaDaAna.getSaldo());

        Produto camisa = new Produto();

        camisa.setNome("Camisa regata");

        System.out.println("NOme da camisa é: "+camisa.getNome());

        camisa.setPreco(29.50);

        System.out.println("O valor da camisa está bom, custa "+camisa.getPreco());

        //metodo dentro de metodo

        System.out.println(camisa.getProdutoInfo());

        camisa.aplicarDesconto(10);
        System.out.println("---------------");
        camisa.aplicarDesconto(0);
        System.out.println("---------------------");

        // CONSTRUTORES
        Livro meuLivro = new Livro("Harry Potter", "J K Rowlling", 39.99);

        meuLivro.exibirInfo();

        Livro meuLivro2 = new Livro();

        meuLivro2.exibirInfo();


    }

}
