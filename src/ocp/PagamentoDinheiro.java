package ocp;

public class PagamentoDinheiro implements Pagamento {

    @Override
    public void pagar(double valor) {
        System.out.println("ocp.Pagamento de R$ " + valor + " realizado em dinheiro.");
    }
}