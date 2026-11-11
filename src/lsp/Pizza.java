package lsp;

/**
 * Representa um produto do tipo Pizza.
 * Subclasse de {@link Produto}, em conformidade com o princípio de substituição de Liskov.
 */
public class Pizza extends Produto {

    /**
     * Cria uma nova pizza com o preço especificado.
     *
     * @param preco valor base da pizza
     */
    public Pizza(double preco) {
        super("Pizza", preco);
    }

    /**
     * Retorna o preço da pizza.
     *
     * @return valor em reais
     */
    @Override
    public double calcularPreco() {
        return preco;
    }
}
