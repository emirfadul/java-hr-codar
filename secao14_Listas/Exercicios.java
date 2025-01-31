package secao14_Listas;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercicios {

    public static void main(String[] args) {

        //EXERCICIO 1 criar um array original e um invertido
        int[] arrayOriginal = {1, 2, 3, 4, 5};
        int[] arrayInvertido = new int[arrayOriginal.length];

        for (int i = 0; i < arrayOriginal.length; i++) {
            arrayInvertido[i] = arrayOriginal[arrayOriginal.length - 1 - i];
        }
        System.out.println(Arrays.toString(arrayOriginal));
        System.out.println(Arrays.toString(arrayInvertido));
        System.out.println("-----------------");
        //EXERCICIO 2
        int[] arrayInteiros = {1, 2, 2, 3, 3, 4, 4, 4, 5, 6, 6, 7, 7, 7};
        int maisFrequente = arrayInteiros[0];
        int maxContagem = 1;

        for (int i = 0; i < arrayInteiros.length; i++) {
            int contagem = 0;

            for (int j = 0; j < arrayInteiros.length; j++) {
                if (arrayInteiros[j] == arrayInteiros[i]) {
                    contagem++;
                }
            }

            if (contagem > maxContagem) {
                maxContagem = contagem;
                maisFrequente = arrayInteiros[i];
            }
        }
        System.out.println("O Array é: " + Arrays.toString(arrayInteiros));
        System.out.println("O mais frequente é: " + maisFrequente);
        System.out.println("---------------");
        //EXERCICIO 3 troca de matriz transposta
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrizTransposta = new int[matriz[0].length][matriz.length];

        for (int[] linha : matriz) {
            System.out.println(Arrays.toString(linha));
        }
        System.out.println("----------------");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matrizTransposta[j][i] = matriz[i][j];
            }
        }

        for (int[] linha : matrizTransposta) {
            System.out.println(Arrays.toString(linha));
        }
        System.out.println("-------------");
        //EXERCICIO 4 SUBISTITUIR VALORES EM ARRAY COM CONDIÇÃO
        int[] arrayComNegativos = {1, -2, 3, -4, 5, -6};

        System.out.println(Arrays.toString(arrayComNegativos));

        for (int i = 0; i < arrayComNegativos.length; i++) {

            if (arrayComNegativos[i] < 0) {
                arrayComNegativos[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arrayComNegativos));
        System.out.println("---------------");

        //EXERCICIO 5 REMOVER ELEMENTOS DO ARRAY DUPLICADOS
        int[] arrayComDuplicados = {1, 1, 2, 2, 3, 3, 4, 4};

        ArrayList<Integer> arraySemDuplicados = new ArrayList<>(); //ArrayList sem elementos definidos
        System.out.println(Arrays.toString(arrayComDuplicados));

        for (int numero : arrayComDuplicados) {
            if (!arraySemDuplicados.contains(numero)) {
                arraySemDuplicados.add(numero);
            }
        }
        System.out.println(arraySemDuplicados);
        System.out.println("----------------");

    }
}
