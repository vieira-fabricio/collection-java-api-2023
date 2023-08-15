package main.java.list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livrosList;

    public CatalogoLivros() {
        this.livrosList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livrosList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquuisarPeloAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livrosList.isEmpty()) {
            for (Livro livro : livrosList) {
                if(livro.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(livro);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisaPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if(!livrosList.isEmpty()) {
            for (Livro livro : livrosList) {
                if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(livro);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPeloTitulo(String titulo) {
        Livro livrosPorTitulo = null;
        if(!livrosList.isEmpty()) {
            for (Livro livro : livrosList) {
                if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                    livrosPorTitulo = livro;
                    break;
                }
            }
        }
        return livrosPorTitulo;
    }


    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2015);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 1", 2016);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 2", 2017);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 2", 2018);

        System.out.println(catalogoLivros.pesquuisarPeloAutor("Autor 1"));

        System.out.println(catalogoLivros.pesquisaPorIntervaloAnos(2015, 2016));

        System.out.println(catalogoLivros.pesquisarPeloTitulo("Livro 3"));

    }

}
