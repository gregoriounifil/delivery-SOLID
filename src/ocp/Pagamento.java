package ocp;

/**
 * Interface que define a operação de pagamento no sistema.
 * Permite a adição de novas formas de pagamento sem alterar as classes existentes (OCP).
 */
public interface Pagamento {

    /**
     * Processa o pagamento do valor informado.
     *
     * @param valor quantia em reais a ser paga
     */
    void pagar(double valor);
}
