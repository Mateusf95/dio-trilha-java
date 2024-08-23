import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Entrada de dados!
        System.out.print("Digite o primeiro número: ");
        int number1 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite o segundo número: ");
        int number2 = scanner.nextInt();

        try{
            contar(number1, number2);
        }catch (ParametrosInvalidosException e){
            System.out.println("O primeiro número não pode ser maior do que o segundo número!");
        }
    }

    private static void contar(int number1, int number2) throws ParametrosInvalidosException{
        if (number1 > number2){
            throw new ParametrosInvalidosException();
        }
        int contagens = number2 - number1;
        System.out.println("\nO contador irá contar até " + contagens);
        System.out.println("\n");
        for (int i = 1; i <= contagens; i++) {
            System.out.println("\tImprimindo o número: "+ i);
        }
    }
}