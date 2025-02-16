package secao22;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Arquivo {

    public static void main(String[] args) {

        //Leitura arquivo
        System.out.println("------- Leitura Arquivo ------");

        String currentDir = System.getProperty("user.dir")+"/secao22/";

        System.out.println(currentDir+"arquivo.txt");
        System.out.println("/home/emir/java/hora_de_codar/secao22");

        //FileReader
        System.out.println("------- FileReader ------");

        try (FileReader reader = new FileReader(currentDir+"arquivo.txt")) {

            int caracter;

            while ((caracter = reader.read()) != -1) {

                System.out.print((char) caracter);                    
            }
            System.out.println("\n");            
            
        } catch (Exception e) {
            System.out.println("Erro ao ler arquivo: "+e.getMessage());
        }

        //BufferedReader
        System.out.println("------- BufferedReader ------");

        try (BufferedReader reader = new BufferedReader(new FileReader(currentDir+"arquivo.txt"))) {

            String linha;

            while ((linha = reader.readLine()) != null) {

                System.out.println(linha);                
            }
            
        } catch (Exception e) {
            System.out.println("Erro ao ler arquivo: "+e.getMessage());
        }        

        //FileWriter (escrever em arquivo)
        System.out.println("------- FileWriter ------");

        try (FileWriter writer = new FileWriter(currentDir+"saida.txt")) {
            
            writer.write("escrevendo em arquivo\n");
            writer.write("escrevendo em arquivo novamente");
            
        } catch (Exception e) {
            System.out.println("Erro ao escrever arquivo: "+e.getMessage());
        }

        //BufferedWriter (escrever em arquivo)
        System.out.println("------- BufferedWriter ------");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(currentDir+"saida2.txt"))) {
            
            writer.write("escrevendo em arquivo com Buffered");
            writer.newLine(); //acrescentar uma linha.
            writer.write("escrevendo em arquivo novamente com Buffered");
            writer.newLine(); //acrescentar uma linha.

            
        } catch (Exception e) {
            System.out.println("Erro ao escrever arquivo: "+e.getMessage());
        }

        //BufferedWriter (escrever em arquivo com apend)
        System.out.println("------- BufferedWriter c/ apend------");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(currentDir+"saida2.txt", true))) {
            
            writer.append("acrescentando uma linha ao texto existente.");
            
        } catch (Exception e) {
            System.out.println("Erro ao escrever arquivo: "+e.getMessage());
        }

    }
    
}
