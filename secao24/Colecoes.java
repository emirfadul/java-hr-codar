package secao24;

import java.util.*;

public class Colecoes {

    public static void main(String[] args) {
        
        //ArrayList adidionando
        System.out.println("------ LIST -----");
        List<String> listaDeNomes = new ArrayList<>();

        listaDeNomes.add("maria");
        listaDeNomes.add("joao");
        listaDeNomes.add("pedro");
        System.out.println("O array atual é: "+listaDeNomes.toString());
        System.out.println("-----------");


        //resgatar
        System.out.println("O primeiro indice é: "+listaDeNomes.get(0));
        System.out.println("O segundo indice é: "+listaDeNomes.get(1));
        System.out.println("O terceiro indice é: "+listaDeNomes.get(2));
        System.out.println("-----------");

        //alterar
        System.out.println("Alterado o segundo indice para Ana");
        listaDeNomes.set(1, "ana");
        System.out.println("O array apos a mudança é: "+listaDeNomes.toString());
        System.out.println("-----------");
        

        //remover elemento
        System.out.println("Removendo o terceiro indice 2");
        listaDeNomes.remove(2);
        System.out.println("O array apos a mudança é: "+listaDeNomes.toString());
        System.out.println("-----------");

        //adicionando itens
        System.out.println("Incluindo 2 itens: carlos e emir");
        listaDeNomes.add("carlos");
        listaDeNomes.add("emir");
        System.out.println("O array apos a mudança é: "+listaDeNomes.toString());
        System.out.println("-----------");

        //pesquisando no array
        System.out.println("Existe o nome ANA: "+listaDeNomes.contains("ana"));

        //linkedlist
        System.out.println("----- LINKEDLIST ------");
        List<Integer> numeros = new LinkedList<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);

        System.out.println("O Linkedlist é "+numeros.toString());
        System.out.println("O segundo indice é: "+numeros.get(2));

        //Set - HashSet (ordena os numeros)
        System.out.println("----- Set com HashSet------");

        Set<String> conjunto = new HashSet<>();

        conjunto.add("python");
        conjunto.add("PHP");
        conjunto.add("JAVA");
        conjunto.add("HTML");

        System.out.println(conjunto);

        //LinkedHashSet
        System.out.println("----- LinkedHashSet ------");

        Set<Integer> numeros2 = new LinkedHashSet<>();

        numeros2.add(10);
        numeros2.add(50);
        numeros2.add(30);
        numeros2.add(20);

        System.out.println(numeros2);

        //TreeSet - ordena os itens
        System.out.println("----- TreeSet ------");

        Set<String> nomes = new TreeSet<>();

        nomes.add("emir");
        nomes.add("joao");
        nomes.add("viana");
        nomes.add("alan");

        System.out.println(nomes);

        //Map
        System.out.println("----- Map ------");

        Map<String, Integer> idadeMap = new HashMap<>();

        idadeMap.put("joao", 30);
        idadeMap.put("marcos", 31);
        idadeMap.put("camila", 19);
        idadeMap.put("maria", 21);

        System.out.println(idadeMap);

        idadeMap.put("maria", 24);

        System.out.println("Alterando a idade de maria para 24, com uso do PUT");
        System.out.println(idadeMap);

        System.out.println("Contem chave com nome joão: "+idadeMap.containsKey("joao"));
        System.out.println("Contem valor 19: "+idadeMap.containsValue(19));

        System.out.println("Imprimindo Array com toString(): "+idadeMap.toString());
        System.out.println("Imprimindo Array com entrySet(): "+idadeMap.entrySet());
        System.out.println("Imprimindo Array sem nada: "+idadeMap);

        //LinkedHashMap
        System.out.println("----- LinkedHashMap ------");

        Map<String, String> capitalMap = new LinkedHashMap<>();

        capitalMap.put("brasil", "brasilia");
        capitalMap.put("argentina", "buenos aires");
        capitalMap.put("colombia", "bogota");

        System.out.println(capitalMap);      
        System.out.println(capitalMap.entrySet()); 
        System.out.println(capitalMap.containsKey("colombia"));

         //TreeMap
         
         System.out.println("----- TreeMap ------");

         Map<String, Double> produtoPrecoMap = new TreeMap<>();

         produtoPrecoMap.put("maça" , 3.50);
         produtoPrecoMap.put("pera", 8.50);
         produtoPrecoMap.put("uva", 13.50);
         produtoPrecoMap.put("mamao", 5.50);

         System.out.println(produtoPrecoMap);
         System.out.println(produtoPrecoMap.entrySet());





    }
    
}
