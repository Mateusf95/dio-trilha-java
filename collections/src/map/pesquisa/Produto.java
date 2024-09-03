package map.pesquisa;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Produto{\n" +
                "\tNome: '" + nome + "\n" +
                "\tPreço: " + preco + "\n" +
                "\tQuantidade: " + quantidade + "\n" +
                "}\n";
    }
}
