package list.pesquisa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CatalgoLivros {
    private List<Livro> livroList;

    public CatalgoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivros(String titulo, String autor, int ano){
        livroList.add(new Livro(titulo, autor, ano));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for (Livro livro : livroList) {
                if(livro.getAutor().equals(autor)){
                    livrosPorAutor.add(livro);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloDeAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloDeAnos = new ArrayList<>();
        if(!livroList.isEmpty()){
            for (Livro livro : livroList) {
                if(livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloDeAnos.add(livro);
                }
            }
        }
        return livrosPorIntervaloDeAnos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livro = null;
        for (Livro l : livroList) {
            if(l.getTitulo().equals(titulo)){
                livro = l;
                break;
            }
        }
        return livro;
    }

    public static void main(String[] args) {
        CatalgoLivros catalgoLivros = new CatalgoLivros();
        catalgoLivros.adicionarLivros("Livro 1", "Autor 1", 2020);
        catalgoLivros.adicionarLivros("Livro 1", "Autor 2", 2021);
        catalgoLivros.adicionarLivros("Livro 2", "Autor 2", 2022);
        catalgoLivros.adicionarLivros("Livro 3", "Autor 3", 2023);
        catalgoLivros.adicionarLivros("Livro 4", "Autor 4", 1994);

        System.out.println("Livros por Autor: \n"+catalgoLivros.pesquisarPorAutor("Autor 2"));
        System.out.println("Livros por intervaldo de anos: \n" +catalgoLivros.pesquisarPorIntervaloDeAnos(2020, 2022));
        System.out.println("Livros por titulo: \n"+catalgoLivros.pesquisarPorTitulo("Livro 1"));
    }
}
