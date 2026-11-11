package ocp;

/**
 * Implementação de pagamento via cartão de crédito ou débito.
 */
public class PagamentoCartao implements Pagamento {

    /**
     * Realiza o pagamento utilizando cartão.
     *
     * @param valor quantia em reais a ser paga
     */
    @Override
    public void pagar(double valor) {
        System.out.println("ocp.Pagamento de R$ " + valor + " realizado via cartão.");
    }
}
