package dip;

/**
 * Abstração comum para mecanismos de notificação.
 * Permite a inversão de dependência (DIP), desacoplando a camada de serviço
 * das implementações concretas de envio.
 */
public interface Notificacao {

    /**
     * Envia o texto da mensagem pelo canal correspondente.
     *
     * @param mensagem conteúdo textual a ser enviado
     */
    void enviar(String mensagem);
}
