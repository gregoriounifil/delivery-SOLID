package lsp;

/**
 * Representa um produto do tipo Hambúrguer.
 * Subclasse de {@link Produto}, em conformidade com o princípio de substituição de Liskov.
 */
public class Hamburguer extends Produto {

    /**
     * Cria um novo hambúrguer com o preço especificado.
     *
     * @param preco valor base do hambúrguer
     */
    public Hamburguer(double preco) {
        super("Hambúrguer", preco);
    }

    /**
     * Retorna o preço do hambúrguer.
     *
     * @return valor em reais
     */
    @Override
    public double calcularPreco() {
        return preco;
    }
}
