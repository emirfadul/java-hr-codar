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

        //Avançado Pattern e Matcher
        System.out.println("---------------------");

        regex = "\\d{3}";
        texto = "123ABC456";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);

        System.out.println("Correspondencias parciais lookingAt");

        if (matcher.lookingAt()) {
            System.out.println("Encontrado: "+matcher.group());
        }

        //Contando grupos com groupCount
        System.out.println("---------------------");

        regex = "(\\d{3})-(\\d{3})-(\\d{3})";
        texto = "123-456-789";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);

        System.out.println("Contando grupos: ");
        if (matcher.matches()) {

            System.out.println("total de grupos encontrados: "+matcher.groupCount());

            for (int i = 0; i <= matcher.groupCount(); i++) {
                System.out.println("Grupo "+i+" tem o valor de "+matcher.group(i));                
            }
        }

        //Start/end obter a posição das correspondencias na string
        System.out.println("---------------------");

        regex = "\\d{3}";
        texto = "O codigo é 123 e o segundo codigo é 456";

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(texto);

        System.out.println("Posição das correspondencias");

        while (matcher.find()) {
            
            System.out.println("Encontrado: "+matcher.group()+ ", começa em "+matcher.start()+" e termina em "+matcher.end());            
        }

        //quote para tratar caracteres literais
        System.out.println("---------------------");

        String literalRegex = Pattern.quote("1+1=2");
        texto = "A equação correta é 1+1=2 e é o resultado do exercicio";

        pattern = Pattern.compile(literalRegex);
        matcher = pattern.matcher(texto);

        System.out.println("Caracteres literais");
        if (matcher.find()) {
            System.out.println("Encontrado: "+matcher.group()+ ", começa em "+matcher.start()+" e termina em "+matcher.end());            
        }


        //Expressoes avançadas
        //lookahead positivo - sinaliza para tras      
        System.out.println("---------------------");

        String regexLookAhead = "\\d+(?=\\$)";
        texto = "Preços: 100$ 200$ $300 $400";

        pattern = Pattern.compile(regexLookAhead);
        matcher = pattern.matcher(texto);

        System.out.println("LookAhead positivo");

        while (matcher.find()) {            
            System.out.println("Encontrado: "+matcher.group());            
        }

        //lookBehind positivo - sinaliza para frente      
        System.out.println("---------------------");

        String regexLookBehind = "(?<=\\$)\\d+";
        texto = "Preços: 100$ 200$ $300 $400";

        pattern = Pattern.compile(regexLookBehind);
        matcher = pattern.matcher(texto);

        System.out.println("LookBehind positivo");

        while (matcher.find()) {            
            System.out.println("Encontrado: "+matcher.group());            
        }

        //lookahead negativo - sem ponto final      
        System.out.println("---------------------");

        String regexLookBehindNegativo = "(?<!#)\\b\\w+\\b";
        texto = "#java #javascript #php python";

        pattern = Pattern.compile(regexLookBehindNegativo);
        matcher = pattern.matcher(texto);

        System.out.println("LookBehind negativo");

        while (matcher.find()) {            
            System.out.println("Encontrado: "+matcher.group());            
        }

        //Validação data e hora
        String regexData = "^([0-2][0-9]|3[01])/(0[1-9]|1[0-2])/([0-9]{4})$";
        String[] datas = {"12/09/2010", "30/30/2000", "29/01/1999"};

        System.out.println("Validar data DD/MM/YYYY");
        for(String data : datas) {
            if(validarRegex(data, regexData)) {
                System.out.println("Data válida: " + data);
            } else {
                System.out.println("Data Inválida: " + data);
            }
        }

        //Validação de hora HH:MM:SS
        String regexHorario = "^([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]$";
        String[] horarios = {"12:52:33","15:56:41","10:33:32"};

        System.out.println("Validar horário HH:MM:SS");
        for(String hora : horarios) {
            if(validarRegex(hora, regexHorario)) {
                System.out.println("hora válida: " + hora);
            } else {
                System.out.println("hora Inválida: " + hora);
            }
        }   

        //Flags
        //case insentive - ignora maiusculas e minusculas              
        System.out.println("---------------------");
        
        regex = "java";
        texto = "Java é legal, JAVA é bom e jAvA é top.";

        pattern = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
        matcher = pattern.matcher(texto);

        while (matcher.find()) {            
            System.out.println("Encontrado: "+matcher.group());            
        }

        //Flags Multiline
        regex = "^\\d+";
        texto = "123 este é meu texto \nQue pula linha \n4321";

        pattern = Pattern.compile(regex,Pattern.MULTILINE);
        matcher = pattern.matcher(texto);

        while (matcher.find()) {            
            System.out.println("Encontrado: "+matcher.group());            
        }





        
    

    }

    public static boolean validarRegex(String texto, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        return matcher.matches();
    }
    
}
