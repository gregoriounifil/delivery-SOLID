package isp;

/**
 * Implementação concreta de envio de notificações.
 * Implementa unicamente a interface {@link Notificavel}, sem carregar métodos
 * não utilizados de entregas, pedidos ou relatórios (ISP).
 */
public class SistemaNotificacao implements Notificavel {

    /**
     * Exibe o texto da notificação na saída padrão.
     *
     * @param mensagem conteúdo textual da notificação
     */
    @Override
    public void enviarNotificacao(String mensagem) {
        System.out.println("Notificação: " + mensagem);
    }
}
