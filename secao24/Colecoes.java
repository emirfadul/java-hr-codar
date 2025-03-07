package secao24;

import java.util.*;
import java.util.stream.*;
import java.util.stream.Collectors;

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

        //Iterando
        System.out.println("----- Iterator ------");

        for (String nome : nomes) {
            System.out.println(nome);            
        }

        //Iterator
        Iterator<String> nomesIterator = nomes.iterator();

        //removento elemento
        while (nomesIterator.hasNext() ) {
            String nome = nomesIterator.next();

            if (nome.equals("emir")) {
            nomesIterator.remove();                
            }            
        }
        System.out.println(nomes);

        //ListIterator
        ListIterator<String> listIteratorNomes = listaDeNomes.listIterator();
        
        while (listIteratorNomes.hasNext()) {
            System.out.println("Nome: "+listIteratorNomes.next());            
        }

        while (listIteratorNomes.hasPrevious()) {
            System.out.println("Nome: "+listIteratorNomes.previous());            
        }

        //Collections imultavel
        System.out.println("----- collections imultavel ------");
        
        List<String> listaMutavel = new ArrayList<>();

        listaMutavel.add("suzuki");
        listaMutavel.add("honda");
        listaMutavel.add("triumph");

        List<String> listaImutavel = Collections.unmodifiableList(listaMutavel);

        System.out.println(listaImutavel);

        //listaImutavel.add("yamaha"); //não pode adicionar nem tirar elementos

        //List of
        List<String> listaImultavel2 = List.of("item1","item2","item3");
        System.out.println(listaImultavel2);

        Set<Integer> listaImultavelSet = Set.of(7,2,3,4);

        System.out.println(listaImultavelSet);
        //listaImultavelSet.add(5);

        //filter
        System.out.println("----- Filter ------");
        
        List<Integer> numerosFiltrados = numeros.stream().filter(numero -> numero > 3).collect(Collectors.toList());

        System.out.println(numeros);
        
        System.out.println(numerosFiltrados);

        //busca
        System.out.println("----- Busca ------");

        int numeroParaEncontrar = 4;

        boolean encontrou = false;
        
        for (Integer numero : numeros) {
            if (numero == numeroParaEncontrar) {
                encontrou = true;                
            }            
        }
        System.out.println("A lista é "+numeros);
        System.out.println("Existe o numero "+numeroParaEncontrar+" ? "+encontrou);
        System.out.println("");

        //contains
        String nomeBuscado = "viana";
        boolean encontrou2 = nomes.contains(nomeBuscado);

        System.out.println("A lista é "+nomes);
        System.out.println("Existe o nome "+nomeBuscado+" ? "+encontrou2);

        //FindAny
        Optional<Integer> qualquerNumero = numeros.stream().findAny();
        System.out.println(qualquerNumero);

        Optional<Integer> primeiroNumero = numeros.stream().findFirst();
        System.out.println(primeiroNumero);

        Optional<Integer> primeiroPar = numeros.stream().filter(num -> num %2 == 0).findFirst();
        System.out.println(primeiroPar);

        //MAP modificam collectons
        List<Integer> quadrados = numeros.stream().map(n -> n * n).collect(Collectors.toList());
        
        System.out.println("collections "+numeros);                                    
        System.out.println("aproveitando a mesma collections ao quarado "+quadrados);

        List<String> nomesMaiusculas = nomes.stream().map(String::toUpperCase).collect(Collectors.toList());

        System.out.println(nomes);
        System.out.println(nomesMaiusculas);

        //MODIFICAÇÃO
        numeros.add(50);
        System.out.println(numeros);

        //remove elementos
        numeros.remove(Integer.valueOf(2));
        System.out.println(numeros);

        numeros.add(3);
        System.out.println(numeros);

        //alterar todos elementos
        numeros.replaceAll(numero -> numero * 2);
        System.out.println(numeros);

        numeros.add(201);
        numeros.add(300);
        numeros.add(400);
        System.out.println(numeros);

        //remoção em condicional         
        numeros.removeIf(numero -> numero > 200);
        System.out.println(numeros);


        //REDUCE
        int soma = numeros.stream().reduce(0, (acumulador, numero) -> acumulador + numero);
        System.out.println("Soma de todos os numeros é: "+soma);

        String frase = nomes.stream().reduce(nomeBuscado, (concatenador, nome) -> concatenador + " "+ nome);
        System.out.println(frase);

        // COMPARATOR
        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Pessoa("Pedro", 33));
        pessoas.add(new Pessoa("Ana", 25));
        pessoas.add(new Pessoa("João", 67));
        pessoas.add(new Pessoa("Maria", 18));
        pessoas.add(new Pessoa("Rodrigo", 40));

        //ordenar nomes
        pessoas.sort(Comparator.comparing(Pessoa::getNome));


         











    }
    
}
