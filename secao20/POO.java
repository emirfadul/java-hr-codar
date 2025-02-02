package secao20;

public class POO {

    public static void main(String[] args) {

        System.out.println("---OBJECT COMPOSITION----");
        //Object Composition
        Motor motor1 = new Motor("v8", 450);

        Carro carro1 = new Carro("Ford", "Mustang", motor1);

        carro1.exibirInfo();

        System.out.println("----- HERANÇA-------");
        //Herança
        Cachorro turca = new Cachorro("Turca");

        turca.latir();
        turca.emitirSom();

        Animal leao = new Animal("Shark");

        leao.emitirSom();

        //a subclasse tem acesso a tudo da classe superclasse
        //e a superclasse NAO tem acesso a classe filha
        // Classe Object
        Pessoa mateus = new Pessoa("mateus", 33);
        Pessoa pedro = new Pessoa("pedro", 25);

        System.out.println(mateus.toString());
        System.out.println(mateus.equals(pedro));
        System.out.println(mateus.hashCode());

        System.out.println("----- OVERRIDE-------");

        //OVERRIDE
        Quadrado q1 = new Quadrado(4);
        Circulo c1 = new Circulo(3.2);

        System.out.println(q1.calcularArea());
        System.out.println(c1.calcularArea());

        //super
        Funcionario funcionario = new Funcionario("carlos", 3000);
        Gerente gerente = new Gerente("pedro", 5000, 1000);

        funcionario.exibirDetalhes();
        gerente.exibirDetalhes();

        System.out.println(funcionario.calcularBonus());
        System.out.println(gerente.calcularBonus());

    }

}
