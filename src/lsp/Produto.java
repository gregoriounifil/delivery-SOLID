package lsp;

public class Produto {
    protected String nome;
    protected double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double calcularPreco() {
        return preco;
    }

    public void exibir() {
        System.out.println(nome + " - R$ " + calcularPreco());
    }
}