package ocp;

/**
 * Implementação de pagamento instantâneo via PIX.
 */
public class PagamentoPix implements Pagamento {

    /**
     * Realiza o pagamento utilizando PIX.
     *
     * @param valor quantia em reais a ser paga
     */
    @Override
    public void pagar(double valor) {
        System.out.println("ocp.Pagamento de R$ " + valor + " realizado via PIX.");
    }
}
