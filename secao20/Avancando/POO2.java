package secao20.Avancando;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.text.DateFormat.Field;

public class POO2 {

    public static void main(String[] args) {
        
        //classes com final
        System.out.println("----- Classes com Final--------");
        ContaBancaria conta = new ContaBancaria(500);

        System.out.println("Seu saldo é R$ "+conta.getSaldo());

        Veiculo gol = new Veiculo();
        gol.ligarMotor();

        // metodo "final" nao pode ser herdado nem sobreescrito

        //Reflection API
        System.out.println("----- Reflection API --------");
        try {
            Class<?> classePessoa = Class.forName("secao20.Avancado.Pessoa");

            Constructor<?> construtor = classePessoa.getConstructor(String.class,int.class);

            Object pessoa = construtor.newInstance("joao",25);            

            Method metodoDizerOla = classePessoa.getMethod("dizerOla");

            metodoDizerOla.invoke(pessoa);

            Field campoNome = classePessoa.getDeclaredField("nome");
            
            campoNome.setAccessible(true);
            
            

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
    
}
