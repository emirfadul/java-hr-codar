package secao17;

public class Carro {

    //ATRIBUTOS OU PROPRIEDADES
    String marca;
    String modelo;
    int ano;

    double velocidadeAtual = 0;
    boolean motorLigado = false;

    //METODOS
    void acelerar() {
        System.out.println("Estamos acelerando o carro.");
    }

    void exibirInfo() {
        System.out.println("O veiculo tem marca " + marca + ", modelo " + modelo + " e ano " + ano);
    }
    // metodos outros  

    void ligarMotor() {

        if (!motorLigado) {
            motorLigado = true;
            System.out.println("Ligando motor....");
        } else {
            System.out.println("Motor ja está ligado.");
        }
    }

    void aumentarVelocidade(double incremento) {

        if (motorLigado) {
            velocidadeAtual += incremento;
            System.out.println("A velocidade atual é: " + velocidadeAtual);
        } else {
            System.out.println("Primeiro precisa ligar o motor");
        }
    }

}
