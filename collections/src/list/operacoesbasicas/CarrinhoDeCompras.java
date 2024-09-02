package list.operacoesbasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> carrinho;

    public CarrinhoDeCompras() {
        this.carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        carrinho.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        carrinho.removeIf(item -> item.getNome().equals(nome));
    }
    public double calcularValorTotal(){
        double total = 0;
        for (Item item : carrinho) {
            total += item.getPreco();
        }
        return total;
    }

    public void exibirItens() {
        System.out.println(carrinho.toString());
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Item 1", 25.90, 2);
        carrinho.adicionarItem("Item 2", 15.00, 1);

        carrinho.exibirItens();
        System.out.println("O valor total do carrinho é de R$"+carrinho.calcularValorTotal());


        carrinho.removerItem("Item 1");
        carrinho.exibirItens();
        System.out.println("O valor total do carrinho é de R$"+carrinho.calcularValorTotal());

    }
}
