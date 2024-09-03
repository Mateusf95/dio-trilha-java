package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }
    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }
    public void exibirContatos(){
        System.out.println(contatoSet);
    }
    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatos = new HashSet<>();
        for (Contato contato : contatoSet) {
            if(contato.getNome().startsWith(nome)){
                contatos.add(contato);
            }
        }
        return contatos;
    }

    public Contato atualizarNumeroDeContato(String nome, int numero){
        Contato contatoAtualizado = null;
        for (Contato contato : contatoSet) {
            if(contato.getNome().equalsIgnoreCase(nome)){
                contato.setNumero(numero);
                contatoAtualizado = contato;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos contato = new AgendaContatos();
        contato.adicionarContato("Contato 1", 123456);
        contato.adicionarContato("Contato", 456789);
        contato.adicionarContato("Contato 1", 789123);
        contato.adicionarContato("Contato 4", 132789);
        contato.adicionarContato("Contato 5", 741258);

        System.out.println(contato.pesquisarPorNome("Contato 1"));
        System.out.println("\n--------------------\n");
        contato.exibirContatos();
        contato.atualizarNumeroDeContato("Contato 5", 963214);
        System.out.println("\n--------------------\n");
        contato.exibirContatos();
        System.out.println("\n--------------------\n");

    }
}
