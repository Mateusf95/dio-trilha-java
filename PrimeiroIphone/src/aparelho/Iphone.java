package aparelho;

import funcionalidade.AparelhoTelefonico;
import funcionalidade.NavegacaoInternet;
import funcionalidade.ReproducaoMusical;

public class Iphone implements ReproducaoMusical, AparelhoTelefonico, NavegacaoInternet {

    @Override
    public void ligar() {
        System.out.println("LIGANDO DO IPHONE!");
    }

    @Override
    public void atender() {
        System.out.println("ATENDENDO O IPHONE!");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("CORREIO DE VOZ DO IPHONE!");
    }

    @Override
    public void exibirPagina() {
        System.out.println("EXIBINDO PÁGINA DO IPHONE!");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO UMA NOVA ABA NO IPHONE!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO A PÁGINA NO IPHONE!");
    }

    @Override
    public void tocar() {
        System.out.println("TOCANDO MÚSICA NO IPHONE!");
    }

    @Override
    public void pausar() {
        System.out.println("PAUSANDO UMA MÚSICA NO IPHONE!");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("SELECIONANDO UMA MÚSICA NO IPHONE!");
    }
}
