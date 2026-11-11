package srp;

/**
 * Serviço responsável pela criação e instanciação de pedidos.
 * Centraliza a lógica de construção de pedidos no sistema (SRP).
 */
public class PedidoService {

    /**
     * Instancia um novo pedido com os dados fornecidos.
     *
     * @param id identificador único do pedido
     * @param cliente nome do cliente
     * @param produto nome do produto
     * @param valor valor monetário do pedido
     * @return nova instância de {@link Pedido}
     */
    public Pedido criarPedido(int id, String cliente, String produto, double valor) {
        return new Pedido(id, cliente, produto, valor);
    }
}
