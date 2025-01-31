package secao11;

import java.util.Scanner;

public class Exercicios {

    public static void main(String[] args) {


        //SOMATORIO COM FOR
        // int somatorio = 0;

        // for (int i = 1; i <= 100; i++) {
        //     somatorio += i;
        // }
        // System.out.println("O somatorio de 1 a 100 é: " + somatorio);

        // //SOMATORIO COM WHILE
        // int numero = 1;
        // while (numero <= 20) {
        //     if (numero % 2 == 0) {
        //         System.out.println("Numero par: " + numero);
        //     }
        //     numero++;
        // }

        // // NUMERO PRIMO
        // System.out.println("Digite um numero: ");
        // int numPrimo = scanner.nextInt();
        // boolean ePrimo = true;

        // for (int i = 2; i < numPrimo; i++) {

        //     if (numPrimo % i == 0) {
        //         ePrimo = false;
        //         break;
        //     }
        // }
        // if (ePrimo) {
        //     System.out.println("O numero " + numPrimo + " é primo.");
        // } else {
        //     System.out.println("O numero " + numPrimo + " não é primo.");
        // }

        //MENU INTERATIVO (DO-WHILE)        
    
        // int menu /* = scanner.nextInt()*/;
        // do{
        //     System.out.println("Escolha uma opçao abaixo:");
        //     System.out.println("(1) KAWASAKI");
        //     System.out.println("(2) SUZUKI");
        //     System.out.println("(3) B M W");
        //     System.out.println("(4) SAIR");

        //     menu = (int)(Math.random() * 5);

        //     System.out.println("A opção escolhida foi: "+menu);
        // }while(menu != 4); 

        // FATORIAL COM LOOP FOR

        // System.out.println("Digite um numero: ");
        // int num = scanner.nextInt();
        // int fatorial = 1;

        // for (int i = 1; i <= num; i++) {

        //     fatorial *= i;            
        // }
        // System.out.println("O fatorial de "+num+" é = "+fatorial);

        //CONTAGEM NUMEROS COM WHILE
        //Scanner scanner = new Scanner(System.in);
        int numCont = 101010 /*scanner.nextInt()*/;
        int contr = 0;

        while (numCont != 0 ) {
            numCont = numCont / 10;
            contr++;
        }
        System.out.println("O numero de digitos é: "+contr);



    }

}
