import aparelho.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone1 = new Iphone();
        System.out.println("Páginas no iphone!\n");
        iphone1.exibirPagina();
        iphone1.adicionarNovaAba();
        iphone1.atualizarPagina();

        System.out.println("\nLigação no iphone!\n");
        iphone1.ligar();
        iphone1.atender();
        iphone1.iniciarCorreioDeVoz();

        System.out.println("\nMúsicas no iphone!\n");
        iphone1.selecionarMusica();
        iphone1.tocar();
        iphone1.pausar();
    }
}