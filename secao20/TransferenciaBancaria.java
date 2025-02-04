package secao20;

public class TransferenciaBancaria implements Pagamento {

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagameto de R$ " + valor + ", via transferencia bancária.");
    }

    @Override
    public void exibirRecibo(double valor) {
        System.out.println("Pagameto de R$ " + valor + ", foi transferido pelo banco.");
    }

}
