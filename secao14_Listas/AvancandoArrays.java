package secao14_Listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class AvancandoArrays {

    public static void main(String[] args) {

        int[] numbers = {10, 90, 40, 70, 30, 80, 70, 50};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        System.out.println("---------------");

        // ORDENAÇÃO COM COMPARATOR
        String[] name = {"joao", "artur", "jose", "cristina"};
        Arrays.sort(name);
        System.out.println(Arrays.toString(name));

        Arrays.sort(name, Comparator.reverseOrder());
        System.out.println(Arrays.toString(name));

        System.out.println("---------------");

        //ORDENAÇÃO DE MATRIZ
        int[][] matriz = {
            {3, 1, 2},
            {7, 6, 8},
            {8, 9, 7}
        };
        Arrays.sort(matriz, Comparator.comparingInt(a -> a[0]));
        for (int[] linha : matriz) {
            System.out.println(Arrays.toString(linha));
        }
        System.out.println(Arrays.deepToString(matriz));
        System.out.println("------------");

        //MANIPULAÇÃO ARRAY AVANÇADA
        int[] original = {1, 2, 3, 4};
        System.out.println("Array original: " + Arrays.toString(original));

        int[] copia = Arrays.copyOf(original, 3);
        System.out.println("Array copia com 3 elementos: " + Arrays.toString(copia));
        System.out.println("----------------");

        // FILL PREENCHIMENTO
        int[] numeros = new int[5];
        System.out.println(Arrays.toString(numeros));

        Arrays.fill(numeros, 5);
        System.out.println(Arrays.toString(numeros));
        System.out.println("----------------");

        //TRANSFORMAÇÃO DE ARRAY PARA STREAM
        int[] values = {1, 2, 3, 4, 5};
        System.out.println("O array é: " + Arrays.toString(values));

        int sum = Arrays.stream(values).sum(); //FAz a soma dos elementos do Array
        System.out.println("A soma do array acima é: " + sum);
        System.out.println("----------------");

        //ARRAY DINAMICO
        ArrayList<String> frutas = new ArrayList<>();
        System.out.println("Array vazio: " + frutas);

        frutas.add("Maçã");
        frutas.add("Uva");
        frutas.add("Pera");
        frutas.add("Mamao");
        System.out.println("Array com adição de elementos: " + frutas);

        for (String fruta : frutas) {
            System.out.println("Elementos seprados: " + fruta);
        }

        frutas.remove("Uva");
        System.out.println("Retirando elementos do Array (Uva): " + frutas);

        frutas.remove(0);
        System.out.println("Retirando elementos do Array (Uva e Maçã): " + frutas);

    }

}
