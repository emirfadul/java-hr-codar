package secao22;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

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
 
        //Serialização de Objetos
        System.out.println("------- Serialização de Objetos ------");

        Pessoa pessoa = new Pessoa("Emir", 53);

        System.out.println("Nome: "+pessoa.getNome());
        System.out.println("Idade: "+pessoa.getIdade());

        //Serialização (output)
        System.out.println("------- Serialização ------");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(currentDir+"pessoa.ser"))) {
            
            oos.writeObject(pessoa);

            System.out.println("Objeto serializado com sucesso!");
             
        } catch (Exception e) {
            System.out.println("Erro ao serializar objeto: "+e.getMessage());
        }

        //Deserialização (input)
        System.out.println("------- Deserialização ------");

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(currentDir+"pessoa.ser"))) {

            Pessoa pessoa2 = (Pessoa) ois.readObject();

            System.out.println("Nome: "+pessoa2.getNome());
            System.out.println("Idade: "+pessoa2.getIdade());
            
        } catch (Exception e) {
            System.out.println("Erro ao Deserializar objeto: "+e.getMessage());
        }

        //Manipulação de binarios
        System.out.println("------- Manipulação de binarios ------");

        try (
            FileInputStream fis = new FileInputStream(currentDir+"imagem.jpg");
            FileInputStream fos = new FileInputStream(currentDir+"copia_imagem.jpg");    
        ) {           

            int byteData;

            while ((byteData = fis.read()) != -1){
              //  fos.write(byteData);                 
            }

            System.out.println("Arquivo copiado com sucesso");
            
        } catch (Exception e) {
            System.out.println("Erro ao copiar arquivo: "+e.getMessage());
        }


        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(currentDir+"video.mkv"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(currentDir+"copia_video.mkv"));         
        ) {

            byte[] buffer = new byte[1024];
            int bytesLidos;

            while ((bytesLidos = bis.read(buffer)) != -1) {
                bos.write(buffer,0,bytesLidos);                
            }

            System.out.println("Video copiado com sucesso.");

        } catch (Exception e) {
            System.out.println("Erro ao copiar arquivo: "+e.getMessage());
        }


        





    }
    
}
