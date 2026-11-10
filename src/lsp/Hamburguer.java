package lsp;

public class Hamburguer extends Produto {

    public Hamburguer(double preco) {
        super("Hambúrguer", preco);
    }

    @Override
    public double calcularPreco() {
        return preco;
    }
}