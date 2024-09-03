package map.ordenacao;

public class Evento {

    public String nome;
    public String atracao;

    public Evento(String nome, String atracao) {
        this.nome = nome;
        this.atracao = atracao;
    }

    public String getNome() {
        return nome;
    }

    public String getAtracao() {
        return atracao;
    }

    @Override
    public String toString() {
        return "Evento{\n" +
                "\tNome: " + nome + "\n" +
                "\tAtração: " + atracao + "\n" +
                "}\n";
    }
}
