package secao13_jogoAdvinhacao;

import java.util.Random;
import java.util.Scanner;

public class JogoAdvinhacao {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1;

        int palpite = 0;
        int tentativas = 0;

        System.out.println("=== ADVINHE O NUMERO (0 a 100) ===");

        while (palpite != numeroSecreto) {

            System.out.println("Digite seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite < numeroSecreto) {
                System.out.println("O numero é maior que " + palpite);

            } else if (palpite > numeroSecreto) {
                System.out.println("O numero é menor que " + palpite);

            } else {
                System.out.println("Parabens você ganhou !");
            }

        }

        scanner.close();

    }

}
