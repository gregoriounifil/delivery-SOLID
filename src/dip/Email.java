package dip;

/**
 * Canal de notificação por correio eletrônico (E-mail).
 * Implementa a abstração {@link Notificacao}.
 */
public class Email implements Notificacao {

    /**
     * Envia mensagem via e-mail.
     *
     * @param mensagem conteúdo da mensagem
     */
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando dip.Email: " + mensagem);
    }
}
