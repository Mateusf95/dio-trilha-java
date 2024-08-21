//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        condicionalSimples();
        condicionalComposta();
        condicionaisEncadeadas();
        condicaoTernaria();
        condicaoMultipla();
    }

    private static void condicionalSimples() {
        System.out.println("------------------ Condição Simples --------------");
        double saldo = 25.0;
        double valorSolicitado = 17.0;

        if(valorSolicitado < saldo) {
            saldo -= valorSolicitado;
            System.out.println("Saque realizado com sucesso!");
        }
        System.out.println(saldo);

        System.out.println("--------------------------------------------------");

    }

    private static void condicionalComposta() {
        System.out.println("------------------ Condição Composta --------------");

        double nota = 6.3;

        if(nota >= 7) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }
        System.out.println("--------------------------------------------------");
    }

    private static void condicionaisEncadeadas() {
        System.out.println("------------------ Condição encadeada --------------");

        double nota = 6.3;

        if(nota >= 7) {
            System.out.println("Aprovado!");
        } else if(nota > 5 && nota < 7 ){
            System.out.println("Recuperação!");
        } else {
            System.out.println("Reprovado!");
        }
        System.out.println("--------------------------------------------------");
    }

    private static void condicaoTernaria() {
        System.out.println("------------------ Condição Ternária --------------");

        int nota = 7;
        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);
        System.out.println("--------------------------------------------------");

    }

    private static void condicaoMultipla() {
        System.out.println("------------------ Condição Multipla --------------");
        String sigla = "M";
        switch (sigla){
            case "P":
                System.out.println("Pequeno");
                break;
            case "M":
                System.out.println("Médio");
                break;
            case "G":
                System.out.println("Grande");
                break;
            default:
                System.out.println("Indefinido");
        }
        System.out.println("--------------------------------------------------");

    }
}