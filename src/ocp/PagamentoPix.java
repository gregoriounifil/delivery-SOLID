package ocp;

public class PagamentoPix implements Pagamento {

    @Override
    public void pagar(double valor) {
        System.out.println("ocp.Pagamento de R$ " + valor + " realizado via PIX.");
    }
}