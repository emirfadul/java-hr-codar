package secao17;

public class Livro {

    private String titulo;
    private String autor;
    private double preco;

    
    //FALLBACK
    public Livro() {
        this.titulo = "Titulo";
        this.autor = "autor";
        this.preco = 17.99;
    }

    //OVERIDE
    public Livro(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }



    public void exibirInfo(){
        System.out.println("Titulo: "+titulo+", Autor: "+autor+", Preço R$ "+preco);
    }
    
    
}
