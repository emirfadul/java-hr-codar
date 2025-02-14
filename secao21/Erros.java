package secao21;

import java.io.BufferedReader;
import java.io.FileReader;

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
    }

    public static void validarIdade(int idade){
        if (idade < 18) {
            throw new IllegalArgumentException("idade deve ser maior que 18.");                
        }
        System.out.println("idade valida: "+idade);
    }
    
}
