package secao23;

public class ArmazenamentoNumeros implements Armazenamento<Integer> {

    public Integer numero;

    @Override
    
    public void salvar(Integer item){
        this.numero = item;
    }

    public Integer recuperar(){
        return numero;
    }
    
}
