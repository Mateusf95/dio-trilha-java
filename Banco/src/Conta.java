public abstract class Conta implements iConta {
    private int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    private int agencia;
    private int numConta;
    private double saldo;

    private Cliente cliente;

    public Conta(Cliente cliente, Banco banco) {
        this.agencia = AGENCIA_PADRAO;
        this.numConta = SEQUENCIAL++;
        this.cliente = cliente;
        banco.adicionarConta(this);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumConta() {
        return numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public boolean sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            System.out.println("Saldo insuficiente!");
        }
        return false;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(Conta contaDestino, double valor) {
        if (this.sacar(valor)) {
            contaDestino.saldo = valor;
        } else {
            System.out.println("Transferencia não realizada!");
        }

    }

    protected void infoContaComum() {
        System.out.println(String.format("Titular: %s", getCliente().getNome()));
        System.out.println(String.format("Agencia: %d", getAgencia()));
        System.out.println(String.format("Conta: %d", getNumConta()));
        System.out.println(String.format("Saldo: R$%.2f", getSaldo()));
    }
}
