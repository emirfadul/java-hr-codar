package secao17;

public class ContaBancaria {

    private String titular;
    private double saldo;

    public void setTitular(String titular) {

        if (titular != null && !titular.isEmpty()) {
            this.titular = titular;
            System.out.println("Titular correto!"); //Apenas para confirmar que leu a condição
        } else {
            System.out.println("O nome do titular é inválido!");
        }
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
            System.out.println("Saldo positivo."); //Apenas para confirmar que leu a condição
        } else {
            System.out.println("O valor precisa ser positivo.");
        }
    }

    public void exibirInfo() {
        System.out.println("Titular é: " + titular + ", saldo R$ " + saldo);
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    

}
