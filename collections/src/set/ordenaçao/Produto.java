package set.ordenaçao;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto> {
    private Long codigo;
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(Long codigo, String nome, double preco, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public int compareTo(Produto produto) {
        return nome.compareToIgnoreCase(produto.getNome());
    }

    public Long getCodigo() {
        return codigo;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Objects.equals(codigo, produto.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    @Override
    public String toString() {
        return "Produto{\n" +
                "\tCódigo: " + codigo + "\n" +
                "\tNome: " + nome + "\n" +
                "\tPreço: " + preco + "\n" +
                "\tQuantidade: " + quantidade + "\n" +
                "}\n";
    }


}

class ComparatorPorPreco implements Comparator<Produto> {

    @Override
    public int compare(Produto o1, Produto o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}
