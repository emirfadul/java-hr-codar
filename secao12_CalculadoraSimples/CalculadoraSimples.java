package secao12_CalculadoraSimples;

import java.util.Scanner;

public class CalculadoraSimples {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("==== CALCULADORA SIMPLES ====");

        System.out.println("Escolha 2 numeros.");
        System.out.print("Numero 1: ");
        int numero1 = scanner.nextInt();

        System.out.print("Numero 2: ");
        int numero2 = scanner.nextInt();

        System.out.println("=== OPERAÇÕES MATEMÁTICAS ===");
        System.out.print("(1)SOMA  ");
        System.out.print("(2)SUBTRAÇÃO  ");
        System.out.print("(3)MULTIPLICAÇÃO  ");
        System.out.println("(4)DIVISÃO  ");
        System.out.print("Escolha uma opção acima: ");

        int opcao = scanner.nextInt();

        if (opcao == 1) {
            int resultado = numero1 + numero2;
            System.out.println("O resultado da soma é: " + resultado);
        } else if (opcao == 2) {
            int resultado = numero1 - numero2;
            System.out.println("O resultado da subtração é: " + resultado);
        } else if (opcao == 3) {
            int resultado = numero1 * numero2;
            System.out.println("O resultado da multiplicação é: " + resultado);
        } else if (opcao == 4) {

            if (numero2 != 0) {
                int resultado = numero1 / numero2;
                System.out.println("O resultado da divisão é: " + resultado);
            } else {
                System.out.println("Numero invalido.");
            }

        } else {
            System.out.println("Opção inválida.");
        }

        scanner.close();

    }
}
