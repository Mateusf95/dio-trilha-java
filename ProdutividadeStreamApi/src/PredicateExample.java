import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//Predicate<T>: Representa uma função que aceita um argumento do tipo T e retorna um valor booleano (verdadeiro ou falso).
// É comumente usada para filtrar os elementos do Stream com base em alguma condição.
public class PredicateExample {
    public static void main(String[] args) {
        // Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> linguagens = Arrays.asList("Java", "JavaScript", "Phyton", "TypeScript", "Golang");

        // Usar o Predicate com expressão lambda para filtrar números pares
        Predicate<Integer> isPar = numero -> numero % 2 == 0;
        Predicate<String> linguagensComMaisDeCincoLetras = linguagen -> linguagen.length() > 5;

        // Usar o predicado para filtrar números pares no Stream e armazená-los em outra lista
        List<Integer> numerosPares = numeros.stream()
                .filter(isPar)
                .toList();

        List<String> maiorQuePalavra = linguagens.stream()
                .filter(linguagensComMaisDeCincoLetras)
                .toList();

        List<String> outraManeira = linguagens.stream()
                .filter(palavra -> palavra.length() > 5)
                .toList();


        // Imprimir a lista de números pares
        numerosPares.forEach(System.out::println);
        maiorQuePalavra.forEach(System.out::println);
        outraManeira.forEach(System.out::println);
    }
}