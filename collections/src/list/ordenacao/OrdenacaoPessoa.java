package list.ordenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adidionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorIdade);
        return pessoaPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorAltura, new ComparePorAltura());
        return pessoaPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adidionarPessoa("Nome 1", 20, 1.56);
        ordenacaoPessoa.adidionarPessoa("Nome 2", 30, 1.80);
        ordenacaoPessoa.adidionarPessoa("Nome 3", 25, 1.70);
        ordenacaoPessoa.adidionarPessoa("Nome 4", 17, 1.56);

        System.out.println("Ordenar pessoas por idade: \n"+ ordenacaoPessoa.ordenarPorIdade());
        System.out.println("Ordenar pessoas por altura: \n"+ ordenacaoPessoa.ordenarPorAltura());
    }
}
