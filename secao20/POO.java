package secao20;

public class POO {

    public static void main(String[] args) {

        //Object Composition
        Motor motor1 = new Motor("v8", 450);

        Carro carro1 = new Carro("Ford", "Mustang", motor1);

        carro1.exibirInfo();
        //carro1.motor.exibirInfo();
    }

}
