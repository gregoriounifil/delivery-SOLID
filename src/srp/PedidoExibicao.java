package srp;

public class PedidoExibicao {

    public void exibir(Pedido pedido) {
        System.out.println("ID: " + pedido.getId());
        System.out.println("Cliente: " + pedido.getCliente());
        System.out.println("Produto: " + pedido.getProduto());
        System.out.println("Valor: R$ " + pedido.getValor());
    }
}