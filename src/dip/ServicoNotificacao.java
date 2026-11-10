package dip;

public class ServicoNotificacao {

    private Notificacao notificacao;

    public ServicoNotificacao(Notificacao notificacao) {
        this.notificacao = notificacao;
    }

    public void notificar(String mensagem) {
        notificacao.enviar(mensagem);
    }
}