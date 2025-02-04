package secao20;

abstract class InstrumentoMusical {

    protected String nome;

    public InstrumentoMusical(String nome) {
        this.nome = nome;
    }

    //abstrato: implementado na subclasse
    public abstract void tocar();

    //concreto: herdado, normal
    public void exibirDetalhes() {
        System.out.println("Instrumento: " + nome);
    }

}
