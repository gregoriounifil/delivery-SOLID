package srp;

import java.util.ArrayList;
import java.util.List;

/**
 * Repositório responsável pelo armazenamento e persistência em memória dos pedidos.
 * Separa o armazenamento de dados das regras de negócio e de apresentação (SRP).
 */
public class PedidoRepository {
    private List<Pedido> pedidos = new ArrayList<>();

    /**
     * Armazena um pedido na lista interna e exibe mensagem de confirmação.
     *
     * @param pedido instância de {@link Pedido} a ser armazenada
     */
    public void salvar(Pedido pedido) {
        pedidos.add(pedido);
        System.out.println("srp.Pedido salvo com sucesso!");
    }
}
