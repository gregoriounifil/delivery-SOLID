package isp;

public class SistemaNotificacao implements Notificavel {

    @Override
    public void enviarNotificacao(String mensagem) {
        System.out.println("Notificação: " + mensagem);
    }
}