package secao20;

public class Circulo extends Forma {

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override // sobrescrita respeita retorno, nome e argumentos do metodo
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

}
