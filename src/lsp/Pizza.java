package lsp;

public class Pizza extends Produto {

    public Pizza(double preco) {
        super("Pizza", preco);
    }

    @Override
    public double calcularPreco() {
        return preco;
    }
}