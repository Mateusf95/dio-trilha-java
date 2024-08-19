import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Criando os objetos
        Scanner scanner = new Scanner(System.in);
        ContaTerminal conta = new ContaTerminal();

        //Inserindo dados no objeto
        criarConta(conta, scanner);

        //Mensagem final
        System.out.println(conta.toString());
    }

    private static void criarConta(ContaTerminal conta, Scanner scanner) {
        System.out.print("Digite seu Nome: ");
        conta.setNomeCliente(scanner.nextLine());

        System.out.print("Digite o número da Conta: ");
        conta.setNumero(scanner.nextInt());

        //Limpando buffer de teclado.
        scanner.nextLine();

        System.out.print("Digite a agência: ");
        conta.setAgencia(scanner.nextLine());

        System.out.print("Digite seu saldo inicial R$");
        conta.setSaldo(scanner.nextDouble());
    }
}