package secao23;

public class Caixa <T>{

    private T conteudo;   

    public void adicionar(T conteudo) {
        this.conteudo = conteudo;
    }

    public T obter(){
        return conteudo;
    }





    
}
