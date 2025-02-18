package secao23;

public class Generics {

    public static void main(String[] args) {

        //classe generica
        System.out.println("------ Classe Generica-------");
        Caixa<Integer> caixaInteira = new Caixa<>();

        caixaInteira.adicionar(100);
        System.out.println(caixaInteira.obter());

        Caixa<String> caixaStr = new Caixa<>();

        caixaStr.adicionar("Emir");
        System.out.println(caixaStr.obter());        

        // metodos genericos
        System.out.println("------ Metodos Genericos-------");

        System.out.println("Maior valor entre 5 e 10: "+obterMaior(5, 10));
        System.out.println("Maior valor entre Java e Python: "+obterMaior("Java", "Python"));

        String[] letras = {"a", "b", "c", "d"};

        Integer[] numeros = {12,44,123,999};

        Boolean[] bools = {true, false, true, false};

        imprimirArray(letras);
        imprimirArray(numeros);
        imprimirArray(bools);

        // bounded Types
        System.out.println("------ Bounded Types -------");

        Comparador<Integer> comparadorInteiros = new Comparador<>();

        System.out.println("Maior numero entre 20 e 10: "+comparadorInteiros.obterMaior(20, 10));        
        
    }

    public static <T extends Comparable<T>> T obterMaior(T valor1, T valor2){
            return(valor2.compareTo(valor2) > 0) ? valor1 : valor2;
    }

    public static <T> void imprimirArray(T[] array){
        for (T elemento : array) {
            System.out.print(elemento+", ");                        
        }
        System.out.println(" ");

    }
}
