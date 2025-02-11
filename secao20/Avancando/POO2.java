package secao20.Avancando;

public class POO2 {

    public static void main(String[] args) {
        
        //classes com final
        System.out.println("----- Classes com Final--------");
        ContaBancaria conta = new ContaBancaria(500);

        System.out.println("Seu saldo é R$ "+conta.getSaldo());

        Veiculo gol = new Veiculo();
        gol.ligarMotor();

        // metodo "final" nao pode ser herdado nem sobreescrito



    }
    
}
