package ocp;

/**
 * Implementação de pagamento em dinheiro físico (espécie).
 */
public class PagamentoDinheiro implements Pagamento {

    /**
     * Realiza o pagamento em dinheiro físico.
     *
     * @param valor quantia em reais a ser paga
     */
    @Override
    public void pagar(double valor) {
        System.out.println("ocp.Pagamento de R$ " + valor + " realizado em dinheiro.");
    }
}
