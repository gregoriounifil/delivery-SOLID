package ocp;

public class PagamentoCartao implements Pagamento {

    @Override
    public void pagar(double valor) {
        System.out.println("ocp.Pagamento de R$ " + valor + " realizado via cartão.");
    }
}