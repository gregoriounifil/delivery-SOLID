package srp;

/**
 * Responsável exclusivamente pela exibição dos detalhes de um pedido na saída padrão.
 * Isola a camada de apresentação do modelo e da persistência (SRP).
 */
public class PedidoExibicao {

    /**
     * Exibe os dados formatados do pedido no console.
     *
     * @param pedido instância de {@link Pedido} a ser exibida
     */
    public void exibir(Pedido pedido) {
        System.out.println("ID: " + pedido.getId());
        System.out.println("Cliente: " + pedido.getCliente());
        System.out.println("Produto: " + pedido.getProduto());
        System.out.println("Valor: R$ " + pedido.getValor());
    }
}
