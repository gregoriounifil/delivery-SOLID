package dip;

/**
 * Canal de notificação por mensagens instantâneas via WhatsApp.
 * Implementa a abstração {@link Notificacao}.
 */
public class WhatsApp implements Notificacao {

    /**
     * Envia mensagem via WhatsApp.
     *
     * @param mensagem conteúdo da mensagem
     */
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando dip.WhatsApp: " + mensagem);
    }
}
