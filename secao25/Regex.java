package secao25;

import java.util.regex.*;

public class Regex {

    public static void main(String[] args) {
        
        //Quantificadores
        //expressao regular, texto, verificação

        String regex = "a*";
        String texto = "b aaab aa ba";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("Correspondencias para a*");
        while (matcher.find()) {
            System.out.println("'"+matcher.group()+"'");    
        }     

        System.out.println("---------------------");

        regex = "a+";
        texto = "b aaab aa ba";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);

        System.out.println("Correspondencias para a+");
        while (matcher.find()) {
            System.out.println("'"+matcher.group()+"'");    
        }

        System.out.println("---------------------");

        regex = "a{2,4}";
        texto = "b aaab aa ba";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);

        System.out.println("Correspondencias para a{2,4}");
        while (matcher.find()) {
            System.out.println("'"+matcher.group()+"'");    
        }

        System.out.println("---------------------");

        regex = "a{2}";
        texto = "b aaab aa ba";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);

        System.out.println("Correspondencias para a{2}");
        while (matcher.find()) {
            System.out.println("'"+matcher.group()+"'");    
        }

        System.out.println("---------------------");
        //Ancoras e Fronteiras
        regex = "^c";
        texto = "  carro casa cadeira";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);

        System.out.println("Correspondencias para ^c");

        while (matcher.find()) {
            System.out.println("Encontrada: "+matcher.group());            
        }

        System.out.println("---------------------");
        regex = "a$";
        texto = "carro casa cadeira";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);

        System.out.println("Correspondencias para a$");

        while (matcher.find()) {
            System.out.println("Encontrada: "+matcher.group());            
        }

        //fronteira \b - apenas o que esta dentro do "\b"
        System.out.println("---------------------");
        regex = "\\bpalavra\\b";
        texto = "palavra compalavra palavras";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);

        System.out.println("Correspondencias para \\bpalavra\\b");

        while (matcher.find()) {
            System.out.println("Encontrada: "+matcher.group());            
        }

        //fronteira \B - apenas o que esta dentro do "\B"
        System.out.println("---------------------");
        regex = "\\Bpalavra";
        texto = "bpalavra compalavra apalavras";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);

        System.out.println("Correspondencias para \\Bpalavra");

        while (matcher.find()) {
            System.out.println("Encontrada: "+matcher.group());            
        }

        //grupos e captura
        System.out.println("---------------------");
        regex = "(\\d{2})-(\\d{2})-(\\d{4})";
        texto = "A data de hoje é 23-09-2024 e a data de ontem foi 22-09-2024";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);

        System.out.println("Correspondencias de grupo");

        while (matcher.find()) {
            System.out.println("Dia: "+matcher.group(1));     
            System.out.println("Mês: "+matcher.group(2));            
            System.out.println("Ano: "+matcher.group(3));       
            System.out.println("Todos os grupos: "+matcher.group(0));    
        }

        //backreference para substituição
        //$1 grupo1, $2 grupo2, $3 grupo3
        System.out.println("---------------------");
        String textoSubstituido = texto.replaceAll("(\\d{2})-(\\d{2})-(\\d{4})" , "$1/$2/$3");   

        System.out.println("Texto original: "+texto);

        System.out.println("Texto substituido: "+textoSubstituido);
        
        










    }
    
}
