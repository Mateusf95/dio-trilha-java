package set.ordenaçao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {
    private Set<Produto> produtoSet;

    public CadastroProduto() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProdutos(Long cod, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutoPorNome() {
        Set<Produto> produtoPorNome = new TreeSet<>(produtoSet);
        return produtoPorNome;
    }

    public Set<Produto> exibirPorPreco() {
        Set<Produto> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtoPorPreco.addAll(produtoSet);
        return produtoPorPreco;
    }

    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();
        cadastroProduto.adicionarProdutos(1l,"Produto 5", 15d, 5);
        cadastroProduto.adicionarProdutos(2l,"Produto 0", 20d, 10);
        cadastroProduto.adicionarProdutos(1l,"Produto 3", 10d, 2);
        cadastroProduto.adicionarProdutos(9l,"Produto 9", 2d, 2);

        System.out.println(cadastroProduto.produtoSet);
        System.out.println("\nProduto por nome!\n");
        System.out.println(cadastroProduto.exibirProdutoPorNome());
        System.out.println("\nProduto por preço!\n");
        System.out.println(cadastroProduto.exibirPorPreco());
    }
}
