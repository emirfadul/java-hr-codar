package secao21;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Erros {

    public static void main(String[] args) {
        // try catch
        System.out.println("------- Try Catch --------");
        try {
            int a = 0;
            int b = 10;
            int resultado = b/a;
        } catch (Exception e) {
            System.out.println("[Error]: Divisão por zero não existe!");           
        }

        try {
            int[] numeros = {1,2,3,4};
            System.out.println(numeros[4]);
        } catch (Exception e) {       
            System.out.println("[Error]: "+e.getMessage());
        }

        //Finally
        System.out.println("------- Finally --------");

        try {
            int[] numeros = {1,2,3,4};
            System.out.println(numeros[4]);
        } catch (ArrayIndexOutOfBoundsException e) {       
            System.out.println("[Error]: "+e.getMessage());
        } finally{
            System.out.println("Executou o finally");
        }

        try {
            int[] numeros = {1,2,3,4};
            System.out.println(numeros[3]);
        } catch (ArrayIndexOutOfBoundsException e) {       
            System.out.println("[Error]: "+e.getMessage());
        } finally{
            System.out.println("Executou o finally");
        }

        //verificadas 
        System.out.println("---- Verificadas  --------");
        try {            
            BufferedReader reader = new BufferedReader(new FileReader("secao21/arquivo.txt"));
            String linha = reader.readLine();
            System.out.println(linha);

        } catch (Exception e) {
            System.out.println("Erro ao ler arquivo: "+e.getMessage());
        }

        //Não verificadas 
        System.out.println("---- Não Verificadas  --------");

        String texto = null;

        //Excessoes  com Throw 
        System.out.println("---- Throw --------");

        try {
            validarIdade(20);//idade valida 
            validarIdade(10);// idade não valida
        } catch (Exception e) {
            System.out.println("[Error]:"+e.getMessage());
        }    

        //Exceções Customizadas 
        System.out.println("---- Exceções Customizadas --------");

        Banco minhaConta = new Banco(5000);

        try {
            minhaConta.sacar(6000);
        } catch (Exception e) {
            System.out.println("Erro: "+e.getMessage());
        }

        try {
            processarArquivo("/var/www/arquivo.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Erro: "+ e.getMessage());
        }catch(IOException e){
            System.out.println("Erro: "+ e.getMessage());
        }

        //Encademanto de exceções
        System.out.println("---- Encadeamento de Exceções ------");

        try {
            abrirArquivo(null);
            
        } catch (Exception e) {
            System.out.println("Mensagem:  "+e.getMessage());
            System.out.println("Causa original : "+e.getCause());
        }

        //Multicatch
        System.out.println("---- Multicatch ------");

        try {            
            processarArquivo("asd");

        } catch (NullPointerException | IOException e) {
            System.out.println("Erro multicatch: "+e.getMessage());
        }

        // Relançar Exceção
        System.out.println("---- Relançar Exceção ------");

        try {
            
            processarDados(null);

        } catch (Exception e) {

            System.out.println("Outra coisa.....");
            System.out.println("[Msg]: "+e.getMessage());
            System.out.println("PIlha de execução: "+e.getStackTrace());         

        }

    }

    public static void validarIdade(int idade){
        if (idade < 18) {
            throw new IllegalArgumentException("idade deve ser maior que 18.");                
        }
        System.out.println("idade valida: "+idade);
    }

    public static void processarArquivo(String caminho) throws FileNotFoundException, IOException{
        if (caminho == null || caminho.isEmpty()) {
            throw new IOException("Caminho invalido.");            
        }

        File arquivo = new File(caminho);

        if (!arquivo.exists()) {
            throw new FileNotFoundException("Arquivo nao encontrado");            
        }
        System.out.println("Arquivo encontrado com sucesso.");
    }

    public static void abrirArquivo(String caminho){

        try {            
            if(caminho == null){
                //throw new NullPointerException("CAminho nuno.");            
            }

            throw new FileNotFoundException("Arquivo nao encontrado.");

        } catch (FileNotFoundException e) {

            NullPointerException npe = new NullPointerException("Erro ao processar arquivo");

            npe.initCause(e);

            throw npe;            
        }
    }
    
    public static void processarDados(String dados) throws Exception{
        try {
            if(dados == null){
                throw new NullPointerException("Os dados são nulos.");
            }

        } catch (Exception e) {
            
            System.out.println("Tratamento, criação de log, .....");

            throw e;
        }
    }
}
