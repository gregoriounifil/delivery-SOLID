package lsp;

/**
 * Representa um produto do tipo Bebida.
 * Subclasse de {@link Produto}, em conformidade com o princípio de substituição de Liskov.
 */
public class Bebida extends Produto {

    /**
     * Cria uma nova bebida com o preço especificado.
     *
     * @param preco valor base da bebida
     */
    public Bebida(double preco) {
        super("Bebida", preco);
    }

    /**
     * Retorna o preço da bebida.
     *
     * @return valor em reais
     */
    @Override
    public double calcularPreco() {
        return preco;
    }
}
