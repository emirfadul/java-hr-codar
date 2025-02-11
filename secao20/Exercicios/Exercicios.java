package secao20.Exercicios;

public class Exercicios {

    public static void main(String[] args) {

        //exercicio 1
        System.out.println("--- Exercicio 1 -------");
        Endereco endereco = new Endereco("Rua teste", 123, "Manaus");
        Pessoa pessoa = new Pessoa("Emir", 53, endereco);

        pessoa.exibirInfo();

        //exercicio 2
        System.out.println("--- Exercicio 2 -------");
        Carro carro = new Carro();
        Moto moto  = new Moto();

        carro.acelerar();
        moto.acelerar();

        //exercicio 3
        System.out.println("--- Exercicio 3 -------");
        Cachorro cachorro = new Cachorro("Hulk", "latido", "Doberman");

        cachorro.exibirDetalhes();
    }
    
}
