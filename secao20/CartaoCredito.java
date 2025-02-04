package secao20;

public class CartaoCredito implements Pagamento {

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagameto de R$ " + valor + ", via cartao de credito.");
    }

}
