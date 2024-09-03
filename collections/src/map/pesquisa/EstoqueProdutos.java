package map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoquePordutosMap;

    public EstoqueProdutos() {
        this.estoquePordutosMap = new HashMap<>();
    }

    public void adicionarProduto(Long cod, String nome, double preco, int quantidade) {
        estoquePordutosMap.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirPordutos() {
        System.out.println(estoquePordutosMap);
    }

    public double calcularValorTotalEstoque() {
            double total = 0;
        if(!estoquePordutosMap.isEmpty()){
            for(Produto produto : estoquePordutosMap.values()){
                total += produto.getQuantidade() * produto.getPreco();
            }
        }
        return total;
    }

    public Produto obterPordutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!estoquePordutosMap.isEmpty()){
            for(Produto produto : estoquePordutosMap.values()){
                if(produto.getPreco() > maiorPreco) {
                    produtoMaisCaro = produto;
                    maiorPreco = produto.getPreco();
                }
            }

        }
        return produtoMaisCaro;
    }
    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if (!estoquePordutosMap.isEmpty()) {
            for (Produto produto : estoquePordutosMap.values()) {
                if (produto.getPreco() < menorPreco) {
                    produtoMaisBarato = produto;
                    menorPreco = produto.getPreco();
                }
            }
        }

        return produtoMaisBarato;
    }


    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto(1l, "Produto A", 5d, 10);
        estoqueProdutos.adicionarProduto(2l, "Produto B", 10d, 5);
        estoqueProdutos.adicionarProduto(3l, "Produto C", 15d, 2);
        estoqueProdutos.adicionarProduto(4l, "Produto D", 20d, 2);

        estoqueProdutos.exibirPordutos();

        System.out.println("Valor total do estoque: R$" + estoqueProdutos.calcularValorTotalEstoque());
        System.out.println("Produto mais caro: " + estoqueProdutos.obterPordutoMaisCaro());
        System.out.println("Produto mais barato: " + estoqueProdutos.obterProdutoMaisBarato());

    }
}
