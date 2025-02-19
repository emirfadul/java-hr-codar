package secao23;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
        
        //Wildcards
        System.out.println("------ Wildcard -------");

        List<Integer> numero2 = List.of(1,2,3);
        List<String> palavras2 = List.of("teste", "java", "ola");

        //aceita qualquer tipo de lista(?)
        imprimirLista(numero2);
        imprimirLista(palavras2);  
        
        //aceita listas Numericas (? extends Number)
        System.out.println(somarNumeros(numero2));

        // aceita apenas tipos numericos especificos
        List<Number> numeros3 = new ArrayList<>();

        adicionarNumeros(numeros3);

        for (Number numero : numeros3) {
            System.out.println(numero);    
        }

        //generics colletions
        System.out.println("----- Generics Colletions-------");
        List<Integer> listaInteiros = new ArrayList<>();

        listaInteiros.add(10);
        listaInteiros.add(20);
        listaInteiros.add(30);
        listaInteiros.add(40);

        for (Number numero : listaInteiros) {
            System.out.print(numero); 
            System.out.print(", ");             
        }
        System.out.println();

        Set<String> conjuntoDePalavras = new HashSet<>();

        conjuntoDePalavras.add("emir");
        conjuntoDePalavras.add("joao");
        conjuntoDePalavras.add("carlos");
        conjuntoDePalavras.add("maria");

        for (String palavras : conjuntoDePalavras) {
            System.out.print(palavras); 
            System.out.print(", ");             
        }
        System.out.println();

        Map<String, Integer> mapaDeIdade = new HashMap<>();

        mapaDeIdade.put("emir", 53);
        mapaDeIdade.put("joao", 25);
        mapaDeIdade.put("carlos", 32);
        mapaDeIdade.put("marcio", 41);

        for(Map.Entry<String, Integer> entrada : mapaDeIdade.entrySet()){
            System.out.println(entrada.getKey()+" tem "+entrada.getValue()+" anos.");
        }

        //restrição multiplas de tipos
        System.out.println("----- Restrição Multiplas Tipos -------");

        Pato pato = new Pato();
        
        CriaturaGenerica<Pato> criatuPato = new CriaturaGenerica<>(pato);

        criatuPato.usarHabilidades();
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

    public static void imprimirLista(List<?> lista){
        for (Object elemento : lista) {
            System.out.println(elemento);            
        }
    }

    public static double somarNumeros(List<? extends Number> lista){
        double soma = 0;

        for (Number numero : lista) {
            soma += numero.doubleValue();
        }
        return soma;
    }

    public static void adicionarNumeros(List<? super Integer> lista){
        for (int i = 0; i <= 5; i++) {
            lista.add(i);            
        }
    }

}
