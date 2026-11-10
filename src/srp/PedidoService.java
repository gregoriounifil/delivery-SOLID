package srp;

public class PedidoService {

    public Pedido criarPedido(int id, String cliente, String produto, double valor) {
        return new Pedido(id, cliente, produto, valor);
    }
}