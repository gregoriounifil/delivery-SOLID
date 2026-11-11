package isp;

/**
 * Implementação concreta de geração de relatórios.
 * Implementa unicamente a interface {@link Relatorio}, respeitando o princípio
 * de segregação de interfaces (ISP).
 */
public class SistemaRelatorio implements Relatorio {

    /**
     * Gera o relatório do sistema e imprime mensagem de confirmação.
     */
    @Override
    public void gerarRelatorio() {
        System.out.println("Relatório gerado!");
    }
}
