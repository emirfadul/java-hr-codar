package secao18_Loteria;

import java.util.ArrayList;
import java.util.Scanner;

public class SimuladorLoteria {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Bilhete> bilhetes = new ArrayList<>();

        //SOLICITANDO BILHERES USUARIOS
        while (true) {

            System.out.println("Digite 6 numeros para seu bilhete(entre 1 e 60): ");

            int[] numerosEscolhidos = new int[6];

            // USUARIO ESCOLHE NUMEROS
            for (int i = 0; i < numerosEscolhidos.length; i++) {
                System.out.println("Digite o numero: " + (i + 1) + ":");
                numerosEscolhidos[i] = scanner.nextInt();

            }

            //CRIAMOS O BILHETE COM OS NUMEROS ESCOLHIDOS
            Bilhete bilhete = new Bilhete(numerosEscolhidos, numerosEscolhidos);

            bilhetes.add(bilhete);

            //PERGUNTA SE USUÁRIO DESEJA CONTINUAR
            System.out.println("Deseja registrar outro bilhete?(s / n)");

            String resposta = scanner.next();

            if (resposta.equals("n")) {
                break;
            }
        }

        // REALIZAR SORTEIO
        System.out.println("Realizando sorteio.....");

        for (Bilhete bilhete : bilhetes) {
            bilhete.realizarSorteio();
            bilhete.exibirResultados();
        }
        scanner.close();
    }

}
