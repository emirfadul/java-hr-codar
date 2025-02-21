package secao24;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

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







        
        

             



        
    }
    
}
