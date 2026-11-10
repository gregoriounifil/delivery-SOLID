package lsp;

public class Bebida extends Produto {

    public Bebida(double preco) {
        super("lsp.Bebida", preco);
    }

    @Override
    public double calcularPreco() {
        return preco;
    }
}