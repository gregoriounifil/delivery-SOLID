package dip;

public class TesteNotificacao {

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