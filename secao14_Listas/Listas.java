package secao14_Listas;

import java.util.ArrayList;
import java.util.Arrays;

public class Listas {

    public static void main(String[] args) {

        // SINTAXE
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("Acessando o primeiro elemento " + numeros[0]);

        // TAMANHO FIXO, VAZIO
        String[] frutas = new String[3];
        frutas[0] = "Maça";
        frutas[1] = "Uva";
        frutas[2] = "Melão";
        System.out.println("frutas posição 2 " + frutas[1]);

        // SINTAXE COM DOUBLE
        double[] precos = {1.99, 2.55, 5.00, 8.25};
        System.out.println("posição 2 antes é " + precos[2]);

        // MUDANDO VALOR NA LISTA
        precos[2] = 10;
        System.out.println("posição 2 atual é " + precos[2]);

        // LOOPS EM ARRAY(LISTAS)
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        System.out.println("A soma dos elementos: " + soma);

        // FOR EACH
        for (String fruta : frutas) {
            System.out.println("A fruta da vez é: " + fruta);
        }

        // ENCONTRAR MAIOR VALOR DE UMA LISTA ARRAY
        int[] valores = {10, 25, 8, 22, 1, 60};
        int maiorValor = valores[0];
        int j = 0;

        while (j < valores.length) {
            if (valores[j] > maiorValor) {
                maiorValor = valores[j];
            }
            j++;
        }
        System.out.println("O maior valor é: " + maiorValor);

        // FOR EACH ARRAY LISTA
        for (int numero : numeros) {
            System.out.println("O numero é: " + numero);
        }

        // CONCATENAR ELEMENTOS DE UMA LISTA ARRAY
        String[] palavras = {"java", "é", "bom"};
        String frase = "";

        for (String palavra : palavras) {
            frase += palavra + " ";
        }
        System.out.println(frase);

        // VERIFICAR SE VALOR ESTA NO ARRAY LISTA
        char[] letras = {'a', 'e', 'i', 'o', 'u'};

        char letraProcurada = 'i';
        for (char letra : letras) {

            if (letra == letraProcurada) {
                System.out.println("Encontramos a letra : " + letra);
                break;
            }
        }

        // LOOPS COM IF
        int somaPares = 0;

        for (int numero : numeros) {

            if (numero % 2 == 0) {
                somaPares += numero;
            }
        }
        System.out.println("Soma dos numeros pares é: " + somaPares);

        // EXIBIR VALORES MAIORES QUE DETERMINADOS VALORES
        int[] nums = {12, 6, 18, 24, 48, 5};
        int limite = 10;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > limite) {
                System.out.println("Numero maior encontrado: " + nums[i]);
            }
        }

        String[] linguagens = {"java", "C", "Python", "PHP"};
        String linguagemAlvo = "Python";

        for (String linguagem : linguagens) {

            if (linguagemAlvo == linguagem) {
                System.out.println("Linguagem encontrada! Parando o loop");
                break;
            } else {
                System.out.println("Linguagem ainda nao encontrada!");
            }
        }

        // ATUALIZAR VALORES ARRAYS LISTAS
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] *= 2;
        }
        System.out.println(numeros[1]);

        for (int numero : numeros) {
            System.out.println("numeros dobrados é: " + numero);
        }
        numeros[5] = 1;
        System.out.println(numeros[5]);

        for (int i = 0; i < frutas.length; i++) {
            if (frutas[i].equals("Maça")) {
                frutas[i] = "Abacate";
            }
        }
        System.out.println(frutas[0]);

        // METODO ToSTRING
        String dadosNumericos = Arrays.toString(numeros);
        System.out.println(dadosNumericos);
        System.out.println(numeros);

        String dadosFrutas = Arrays.toString(frutas);

        System.out.println(dadosFrutas);

        int[] teste = new int[5];

        System.out.println(Arrays.toString(teste));

        // ADICIONANDO ITENS NAS LISTAS ARRAYS
        int[] novoArray = new int[numeros.length + 1];

        for (int i = 0; i < numeros.length; i++) {
            novoArray[i] = numeros[i];
        }
        System.out.println("Array antes: " + Arrays.toString(novoArray));
        novoArray[novoArray.length - 2] = 12;
        System.out.println("Array depois: " + Arrays.toString(novoArray));

        // UTILIZANDO O ARRAYCOPY
        String[] novoFrutas = new String[frutas.length + 1];

        System.arraycopy(frutas, 0, novoFrutas, 0, frutas.length);

        novoFrutas[novoFrutas.length - 1] = "Manga";

        System.out.println(Arrays.toString(novoFrutas));

        //ARRAYLIST
        ArrayList<String> listaFrutas = new ArrayList<>(Arrays.asList("Maça", "Banana", "Laranja"));

        System.out.println(listaFrutas);

        listaFrutas.add("Manga");

        System.out.println(listaFrutas);

        // REFERENCIA TRAP
        int[] arrayOriginal = {1, 2, 3};
        int[] arrayCopia = arrayOriginal;

        arrayCopia[0] = 10;
        System.out.println("Antes do arraycopy" + Arrays.toString(arrayOriginal));
        System.out.println("Depois do arraycopy" + Arrays.toString(arrayCopia));

        // COMO EVITAR O TRAP
        int[] arrayClone = arrayOriginal.clone();

        arrayClone[0] = 55;

        System.out.println("Antes do arraycopy" + Arrays.toString(arrayOriginal));
        System.out.println("Depois do arraycopy" + Arrays.toString(arrayClone));

        //ARRAY 2D
        int[][] matriz = {
            {1, 2, 3},
            {5, 6, 7},
            {10, 9, 8}
        };
        System.out.println(matriz[0][2]);

        //CRIANDO ARRAY 2D VAZIO E PREENCHENDO
        int[][] tabela = new int[3][3];

        tabela[0][0] = 10;
        tabela[1][1] = 20;
        tabela[2][2] = 30;

        for (int[] linha : tabela) {
            System.out.println(Arrays.toString(linha));
        }

        // ARRAY COM LOOP ANINHADO
        int[][] grade = new int[4][5];

        for (int m = 0; m < grade.length; m++) {
            for (int n = 0; n < grade[m].length; n++) {
                grade[m][n] = m * n;
            }
        }
        for (int[] linha : grade) {
            System.out.println(Arrays.toString(linha));
        }

    }
}
