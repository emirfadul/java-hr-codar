package secao26;

import java.lang.reflect.Field;

public class Anotacoes {
    
    public static void main(String[] args) {
        
        //anotation pre definidas

        Cachorro cachorro = new Cachorro();

        cachorro.emitirSom();
        cachorro.testeMover();
        //cachorro.mover();

        //Annotation customizada
        System.out.println("---------------");
        Exemplo exemplo = new Exemplo();

        //loop em cada um dos metodos
        for (var metodo : exemplo.getClass().getDeclaredMethods()) {
            System.out.println(metodo);   
            
            //verifica se anotação esta presente no metodo
            if (metodo.isAnnotationPresent(Executar.class)) {

                Executar anotacao = metodo.getAnnotation(Executar.class);
                
                // loop vezes
                for (int i = 0; i < anotacao.vezes(); i++) {

                    //invocar metodo
                    try {
                        metodo.invoke(exemplo);  
                    } catch (Exception e) {
                        System.out.println("Erro: "+e.getMessage());
                    }                     
                }               
                
            }
        }

        //Anottation validar campo
        Usuario usuario = new Usuario("", "emir@email.com");

        validarCampos(usuario);

        Usuario usuario2 = new Usuario("", "");

        validarCampos(usuario2);

    }

    //funcao para validar campos anotados
    public static void validarCampos(Object objeto) throws IllegalArgumentException{

        //Pegar a classe, pegar os campos, verificar se eles tem anottation
        Class<?> classe = objeto.getClass();

        for (Field campo : classe.getDeclaredFields()) {

            if (campo.isAnnotationPresent(NotEmpty.class)) {

                //saber o valor de message de cada campo
                NotEmpty anotacao = campo.getAnnotation(NotEmpty.class);

                //ativar a acessibilidade do campo privado
                campo.setAccessible(true);

                try {
                    Object valor = campo.get(objeto);     

                    //validar o campo
                    if (valor == null || valor.toString().isEmpty()) {
                        System.out.println(anotacao.message());                    
                    }
                    
                } catch (Exception e) {
                    System.out.println("Erro: "+e.getMessage());
                }              
                
            }            
        }
    }
}    
