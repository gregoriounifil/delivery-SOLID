package isp;

/**
 * Interface segregada para geração de relatórios administrativos ou operacionais.
 * Evita o acoplamento desnecessário com funcionalidades de pedidos ou entregas (ISP).
 */
public interface Relatorio {

    /**
     * Gera o relatório consolidado do sistema.
     */
    void gerarRelatorio();
}
