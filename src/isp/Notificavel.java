package isp;

/**
 * Interface segregada para envio de notificações aos clientes ou equipe.
 * Atende ao ISP ao isolar a funcionalidade de avisos das demais operações do sistema.
 */
public interface Notificavel {

    /**
     * Envia uma mensagem de notificação.
     *
     * @param mensagem conteúdo textual do aviso
     */
    void enviarNotificacao(String mensagem);
}
