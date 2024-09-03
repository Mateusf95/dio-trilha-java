package map.operacoesbasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarCOntato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerCOntato(String nome) {
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }
    public void exibriContato(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisaPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarCOntato("Mateus", 123456);
        agendaContatos.adicionarCOntato("Mateus", 5656);
        agendaContatos.adicionarCOntato("Mateus Ferreira", 65498);
        agendaContatos.adicionarCOntato("Maria", 11111111);
        agendaContatos.adicionarCOntato("Jonas", 44444444);

        agendaContatos.exibriContato();

        agendaContatos.removerCOntato("Maria");
        agendaContatos.exibriContato();

        System.out.println("O número é: "+agendaContatos.pesquisaPorNome("Mateus Ferreira"));
    }
}
