package main.java.list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    List<Item> listaItens;

    public CarrinhoDeCompras() {
        this.listaItens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        this.listaItens.add(item);
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        if(!listaItens.isEmpty()) {
            for (Item i : listaItens) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(i);
                }
            }
            listaItens.removeAll(itensParaRemover);
            System.out.println("item removido com sucesso!");
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public double calcularValorTotal() {
        double valorTotal = 0f;
        if(!listaItens.isEmpty()) {
            for(Item item: listaItens) {
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirItens() {
        if(!listaItens.isEmpty()) {
            System.out.println(this.listaItens);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "listaItens=" + listaItens +
                '}';
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem("carrinho", 20, 1);
        carrinho.adicionarItem("carrinho", 20, 1);
        carrinho.adicionarItem("boneca", 30, 15);
        carrinho.adicionarItem("Baralho", 15, 20);
        carrinho.exibirItens();

        System.out.println("----------------------------------------------------");

        carrinho.removerItem("carrinho");
        carrinho.exibirItens();

        System.out.println("O valor total da compra é igual: " + carrinho.calcularValorTotal());

        System.out.println("----------------------------------------------------");

        carrinho.adicionarItem("carrinho", 20, 1);
        carrinho.exibirItens();
        System.out.println("O valor total da compra é igual: " + carrinho.calcularValorTotal());





    }
}
