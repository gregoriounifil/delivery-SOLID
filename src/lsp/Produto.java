package lsp;

/**
 * Classe base que representa um produto do restaurante.
 * Define atributos e comportamentos comuns que podem ser estendidos por subclasses
 * sem quebrar as regras de substituição do princípio de Liskov (LSP).
 */
public class Produto {
    protected String nome;
    protected double preco;

    /**
     * Inicializa um novo produto.
     *
     * @param nome descrição ou título do produto
     * @param preco preço base do produto
     */
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    /**
     * Calcula o preço final do produto.
     *
     * @return valor numérico do preço
     */
    public double calcularPreco() {
        return preco;
    }

    /**
     * Exibe o nome e o preço calculado do produto na saída padrão.
     */
    public void exibir() {
        System.out.println(nome + " - R$ " + calcularPreco());
    }
}
