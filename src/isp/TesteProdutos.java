package isp;

import lsp.Bebida;
import lsp.Hamburguer;
import lsp.Pizza;
import lsp.Produto;

class TesteProdutos {
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