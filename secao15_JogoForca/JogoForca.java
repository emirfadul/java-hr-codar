package secao15_JogoForca;

import java.util.Arrays;
import java.util.Scanner;

public class JogoForca {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // DEFINIR PALAVRA A SER ADIVINHADA
        String palavraSecreta = "JAVA";

        char[] palavraOculta = new char[palavraSecreta.length()];

        for (int i = 0; i < palavraSecreta.length(); i++) {
            palavraOculta[i] = '_';
        }
        System.out.println(Arrays.toString(palavraOculta));

        //NUMERO MAXIMO TENTATIVAS
        int tentativas = 6;
        boolean venceu = false;

        //LOOP SOLICITA LETRAS
        while (tentativas > 0) {
            System.out.println("Palavra: " + String.valueOf(palavraOculta));
            System.out.println("Tentativas restantes: " + tentativas);

            System.out.println("Digite uma letra: ");
            char letra = scanner.next().toUpperCase().charAt(0);

            System.out.println("A letra digitada foi: " + letra);

            boolean acertou = false;

            for (int i = 0; i < palavraSecreta.length(); i++) {
                if (palavraSecreta.charAt(i) == letra) {
                    palavraOculta[i] = letra;
                    acertou = true;
                }
            }

            // DEDUÇÃO DE TENTATIVAS
            if (!acertou) {
                tentativas--;
                System.out.println("Letra incorreta.");
            } else {
                System.out.println("Letra correta.");
            }

            if (String.valueOf(palavraOculta).equals(palavraSecreta)) {
                venceu = true;
                break;
            }
        }

        // CONDIÇÃO DE VITORIA
        if (venceu) {
            System.out.println("Parabens, voce venceu e ainda restavam" + tentativas + " tentativas.");
        } else {
            System.out.println("Você perdeu.");
        }
        System.out.println("A palavra secreta era: " + palavraSecreta);

        scanner.close();
    }
}
