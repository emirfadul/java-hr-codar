package secao20;

interface Pagamento {

    //metodos abastratos
    void processarPagamento(double valor);

    // metodos default
    default void exibirRecibo(double valor) {
        System.out.println("Recibo do pagamento, com valor de R$ " + valor);

    }
}
