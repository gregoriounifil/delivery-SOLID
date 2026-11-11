package dip;

/**
 * Demonstração prática do Princípio da Inversão de Dependência (DIP).
 * Instancia o serviço de notificação injetando diferentes canais (Email, SMS, WhatsApp)
 * sem necessidade de alterar o código de {@link ServicoNotificacao}.
 */
public class TesteNotificacao {

    /**
     * Ponto de entrada para execução dos testes de injeção de canais de notificação.
     *
     * @param args argumentos de linha de comando
     */
    public static void main(String[] args) {

        ServicoNotificacao email =
                new ServicoNotificacao(new Email());

        ServicoNotificacao sms =
                new ServicoNotificacao(new SMS());

        ServicoNotificacao whatsapp =
                new ServicoNotificacao(new WhatsApp());

        email.notificar("Seu pedido foi recebido!");
        sms.notificar("Seu pedido saiu para entrega!");
        whatsapp.notificar("Seu pedido foi entregue!");
    }
}
