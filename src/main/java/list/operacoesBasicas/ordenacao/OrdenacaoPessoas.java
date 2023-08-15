package main.java.list.operacoesBasicas.ordenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPelaIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPelaAltura() {
        List<Pessoa> pessoasPelaAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPelaAltura, new ComparePelaAltura());
        return pessoasPelaAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adicionarPessoa("Claudio", 32, 1.78);
        ordenacaoPessoas.adicionarPessoa("Luiz", 34, 1.85);
        ordenacaoPessoas.adicionarPessoa("Maria", 28, 1.65);
        ordenacaoPessoas.adicionarPessoa("João", 43, 1.69);

        System.out.println(ordenacaoPessoas.ordenarPelaIdade());
        System.out.println(ordenacaoPessoas.ordenarPelaAltura());
    }

}
