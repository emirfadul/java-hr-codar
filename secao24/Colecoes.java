package secao24;

import java.util.ArrayList;
import java.util.List;

public class Colecoes {

    public static void main(String[] args) {
        
        //List adidionando
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
             



        
    }
    
}
