package dip;

/**
 * Canal de notificação por mensagens de texto curtas (SMS).
 * Implementa a abstração {@link Notificacao}.
 */
public class SMS implements Notificacao {

    /**
     * Envia mensagem via SMS.
     *
     * @param mensagem conteúdo da mensagem
     */
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando dip.SMS: " + mensagem);
    }
}
