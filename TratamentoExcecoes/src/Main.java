import java.text.NumberFormat;
import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        tryCatch();
        hierarquiaExcecoes();
    }

    private static void tryCatch() {
        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.print("Digite seu nome: ");
            String nome = scanner.next();

            System.out.print("Digite seu sobrenome: ");
            String sobrenome = scanner.next();

            scanner.nextLine();
            System.out.print("Digite sua idade: ");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura: ");
            double altura = scanner.nextDouble();

            System.out.println("Olá me chamo "+ nome.toUpperCase()+ " "+ sobrenome);
            System.out.println("Tenho "+ idade + " anos ");
            System.out.println("Minha altura é "+ altura +" cm");

        }catch (InputMismatchException e){
            System.out.println("Os campos idade e altura precisam ser numericos");
        }

    }

    private static void hierarquiaExcecoes() {

//        try {
//            Number valor = NumberFormat.getInstance().parse("a1.75");
//            System.out.println(valor);
//        } catch (ParseException e) {
//            throw new RuntimeException(e);
//        }

        try {
            String cepFormatado = formatarCep("23765064");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O cep não corresponde com as regras de negocio.");
        }
    }

    private static String formatarCep(String i) throws CepInvalidoException {
        if(i.length() != 8){
            throw new CepInvalidoException();
        }
        return "23.765-064";
    }
}