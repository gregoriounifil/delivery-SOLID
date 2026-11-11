package dip;

/**
 * Serviço de alto nível responsável por disparar notificações aos usuários.
 * Aplica o Princípio da Inversão de Dependência (DIP) ao depender exclusivamente
 * da abstração {@link Notificacao}, injetada via construtor.
 */
public class ServicoNotificacao {

    private Notificacao notificacao;

    /**
     * Construtor que recebe a abstração do meio de notificação por injeção de dependência.
     *
     * @param notificacao implementação concreta da interface {@link Notificacao}
     */
    public ServicoNotificacao(Notificacao notificacao) {
        this.notificacao = notificacao;
    }

    /**
     * Envia uma notificação delegando para o mecanismo injetado.
     *
     * @param mensagem conteúdo textual da notificação
     */
    public void notificar(String mensagem) {
        notificacao.enviar(mensagem);
    }
}
