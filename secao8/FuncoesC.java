package secao8;

import java.util.Arrays;
import java.util.List;

public class FuncoesC {

    public static void main(String[] args) {

        //FUNÇÃO RECURSIVA
        int soma = somaRecursiva(10);

        //soma
        System.out.println(soma(2, 4));
        System.out.println(soma(2, 4, 6));
        System.out.println(soma(2.2, 4.4));

        //FUNÇÕES ANONIMAS
        Runnable tarefa = () -> System.out.println("Minha função anononima");
        tarefa.run();

        Runnable nume = () -> System.out.println(8);
        nume.run();

        // (arg1, arg2) -> {}
        List<String> nomes = Arrays.asList("pedro", "ana", "paulo");
        nomes.forEach(nome -> System.out.println(nome));

    }

    public static int somaRecursiva(int n) {

        if (n == 1) {

            return 1;

        } else {

            return n + somaRecursiva(n - 1);
        }

    }

    public static int soma(int a, int b) {

        return a + b;
    }

    public static int soma(int a, int b, int c) {

        return a + b + c;
    }

    public static double soma(double a, double b) {

        return a + b;
    }

}
