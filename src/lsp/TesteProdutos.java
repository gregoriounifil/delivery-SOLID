package lsp;

/**
 * Demonstração prática do Princípio de Substituição de Liskov (LSP).
 * Instancia classes derivadas (Pizza, Hambúrguer, Bebida) manipuladas
 * pela referência da classe base {@link Produto}.
 */
public class TesteProdutos {

    /**
     * Ponto de entrada para execução do teste de substituição e cálculo de produtos.
     *
     * @param args argumentos da linha de comando
     */
    public static void main(String[] args) {

        Produto[] produtos = {
                new Pizza(45.00),
                new Hamburguer(25.00),
                new Bebida(8.00)
        };

        for (Produto produto : produtos) {
            produto.exibir();
        }
    }
}
