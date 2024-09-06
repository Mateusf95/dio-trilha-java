public interface iConta {
    boolean sacar(double valor);

    void depositar(double valor);

    void transferir(Conta contaDestino, double valor);
    void imprimirExtrato();
}
