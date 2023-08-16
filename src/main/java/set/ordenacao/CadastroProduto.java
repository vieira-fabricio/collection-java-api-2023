package main.java.set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {

    private Set<Produto> produtoSet;

    public CadastroProduto() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(codigo, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPeloNome() {
        Set<Produto> produtoPorNome = new TreeSet<>(produtoSet);
        return produtoPorNome;
    }

    public Set<Produto> exibirProdutosPeloPreco() {
        Set<Produto> produtoPorPreco = new TreeSet<>(new comparatorPorPreco());
        produtoPorPreco.addAll(produtoSet);
        return produtoPorPreco;
    }

    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();

        cadastroProduto.adicionarProduto(1, "produto 1", 5.90d, 10);
        cadastroProduto.adicionarProduto(2, "produto 0", 6.90d, 10);
        cadastroProduto.adicionarProduto(3, "produto 3", 7.90d, 10);
        cadastroProduto.adicionarProduto(4, "produto 2", 8.90d, 10);
        System.out.println(cadastroProduto.produtoSet);

        System.out.println(cadastroProduto.exibirProdutosPeloNome());

        System.out.println(cadastroProduto.exibirProdutosPeloPreco());
    }

}
