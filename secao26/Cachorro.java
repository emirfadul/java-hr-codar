package secao26;

public class Cachorro extends Animal{

    //warning nao para a compilação

    @Override
    public void emitirSom(){
        System.out.println("O cachorro está latindo.");
    }

    @SuppressWarnings("deprecation")
    public void testeMover(){
        mover();
    }
    
}
