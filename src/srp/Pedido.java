package srp;

/**
 * Representa um pedido realizado no sistema de delivery.
 * Armazena os dados básicos da transação como identificador, cliente, produto e valor total.
 */
public class Pedido {
    private int id;
    private String cliente;
    private String produto;
    private double valor;

    /**
     * Cria uma nova instância de pedido.
     *
     * @param id identificador único do pedido
     * @param cliente nome do cliente solicitante
     * @param produto descrição do item solicitado
     * @param valor valor monetário do pedido
     */
    public Pedido(int id, String cliente, String produto, double valor) {
        this.id = id;
        this.cliente = cliente;
        this.produto = produto;
        this.valor = valor;
    }

    /**
     * Retorna o identificador do pedido.
     *
     * @return identificador numérico
     */
    public int getId() {
        return id;
    }

    /**
     * Retorna o nome do cliente associado ao pedido.
     *
     * @return nome do cliente
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * Retorna a descrição do produto do pedido.
     *
     * @return nome ou descrição do produto
     */
    public String getProduto() {
        return produto;
    }

    /**
     * Retorna o valor do pedido.
     *
     * @return valor em reais
     */
    public double getValor() {
        return valor;
    }
}
