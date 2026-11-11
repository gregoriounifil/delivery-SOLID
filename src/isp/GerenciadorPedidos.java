package isp;

/**
 * Interface com foco restrito às operações do ciclo de vida de pedidos.
 * Assegura que clientes desta interface não dependam de regras de entregas ou relatórios (ISP).
 */
public interface GerenciadorPedidos {

    /**
     * Registra a abertura de um novo pedido.
     */
    void criarPedido();

    /**
     * Cancela um pedido existente.
     */
    void cancelarPedido();
}
