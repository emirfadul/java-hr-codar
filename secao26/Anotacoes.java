package secao26;

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


    }
}
