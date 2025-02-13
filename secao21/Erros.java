package secao21;

public class Erros {

    public static void main(String[] args) {
        
        try {
            int a = 0;
            int b = 10;
            int resultado = b/a;
        } catch (Exception e) {
            System.out.println("Divisão por zero não existe!");           
        }

        try {
            int[] numeros = {1,2,3};
            System.out.println(numeros[3]);
        } catch (Exception e) {
            System.out.println("Erro generico!");
            System.out.println("ou");
            System.out.println("[Error]: "+e.getMessage());
        }
    }
    
}
