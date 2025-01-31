package secao11;

public class Loops {
    public static void main(String[] args) {
        
        int numero = 0;

        do{

            numero = (int)(Math.random() * 10);

            System.out.println("Numero aleatorio: "+numero);

        }while(numero != 5 );
    }
}
