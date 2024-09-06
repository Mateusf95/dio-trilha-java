import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contaList;

    public Banco() {
        this.contaList = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    protected void adicionarConta(Conta conta){
        this.contaList.add(conta);
    }

    protected List<Cliente> getClientes(){
        return contaList.stream()
                .map(Conta::getCliente)
                .toList();
    }
}
