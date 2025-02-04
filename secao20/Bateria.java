package secao20;

public class Bateria extends InstrumentoMusical {

    public Bateria(String nome) {
        super(nome);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void tocar() {
        System.out.println("Tocando os tambores da " + nome);

    }

}
