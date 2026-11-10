package dip;

public class WhatsApp implements Notificacao {

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando dip.WhatsApp: " + mensagem);
    }
}