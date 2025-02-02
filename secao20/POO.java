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
    }

}
