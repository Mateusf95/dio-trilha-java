//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        Cliente cliente = new Cliente();
        cliente.setNome("Mateus");

        Conta cc = new ContaCorrente(cliente, banco);
        Conta cp = new ContaPoupanca(cliente, banco);

        cc.depositar(100);
        cc.transferir(cp, 40);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        System.out.println(banco.getClientes().toString());
    }
}