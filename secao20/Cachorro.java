package secao20;

public class Cachorro extends Animal {

    //Obrigado a usar as propriedades da classe pai
    public Cachorro(String nome) {
        super(nome);
    }

    public void latir() {
        System.out.println(nome + " está latindo.");
    }

}
