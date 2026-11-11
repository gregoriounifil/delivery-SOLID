package isp;

/**
 * Interface com foco restrito às operações de transporte e entrega de pedidos.
 * Assegura que clientes desta interface não precisem implementar rotinas de pedidos ou notificações (ISP).
 */
public interface GerenciadorEntregas {

    /**
     * Inicia o transporte do pedido para o endereço do cliente.
     */
    void iniciarEntrega();

    /**
     * Conclui e registra a finalização da entrega do pedido.
     */
    void finalizarEntrega();
}
