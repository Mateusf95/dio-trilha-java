package set.operacoesbasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigo){
        convidadoSet.add(new Convidado(nome, codigo));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        convidadoSet.removeIf(item -> item.getCodigoConvite() == codigoConvite);
    }

    public void contarConvidados(){
        System.out.println(convidadoSet.size());
    }
    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados convidados = new ConjuntoConvidados();
        convidados.adicionarConvidado("Convidado 1", 1);
        convidados.adicionarConvidado("Convidado 2", 2);
        convidados.adicionarConvidado("Convidado 3", 3);
        convidados.adicionarConvidado("Convidado 4", 4);
        convidados.adicionarConvidado("Convidado 5", 5);

        convidados.contarConvidados();
        convidados.exibirConvidados();
        convidados.removerConvidadoPorCodigoConvite(2);
        convidados.exibirConvidados();
    }
}
