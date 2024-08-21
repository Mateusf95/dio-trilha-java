public class Main {
    public static void main(String[] args) {
        repeticaoFor();
        repeticaoWhile();
        repeticaoDoWhile();
    }

    private static void repeticaoFor() {
        System.out.println("Uma maneira de usar o for!");
        for (int carneirinho = 1; carneirinho <= 20; carneirinho++){
            System.out.println("Contando carneirinhos "+ carneirinho);
        }

        System.out.println("\nOutra maneira de usar o for com um Array!");
        String alunos[] = {"FELIPE, JONAS, JULIA, MARCOS"};
        for (String aluno : alunos) {
            System.out.println("O nome do aluno é: "+aluno);
        }

        System.out.println("Usando palavras reservadas para interromper ou continuar o laço!");
        System.out.println("Usando o break!");
        for (int i = 1; i <=5; i++) {
            if( i == 3){
                break;
            }
            System.out.println(i);
        }
        System.out.println("Usando o continue");
        for (int i = 1; i <= 5; i++) {
            if(i == 3){
                continue;
            }
            System.out.println(i);
        }
    }

    private static void repeticaoWhile() {
        System.out.println("Laço de repetição usando o while!");
        int i = 1;
        while (i <= 10){
            System.out.println(i);
            i++;
        }
    }

    private static void repeticaoDoWhile() {
        System.out.println("Laço de repetição do-while!");
        System.out.println("Conte até 10 e depois vá nos procurar!");
        int i = 1;
        do {
            System.out.println("Númeoro "+i);
            i++;
        }while (i <= 10);
        System.out.println("Lá vou eu procurar vocês!");
    }
}