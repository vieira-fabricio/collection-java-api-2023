package main.java.set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet =  new HashSet<>();
    }

    public void adicionarUmConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPeloCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for (Convidado convidado : convidadoSet) {
            if (convidado.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = convidado;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }


    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados()+ " convidados dentro do Set de convidados!");

        conjuntoConvidados.adicionarUmConvidado("Carol", 12345);
        conjuntoConvidados.adicionarUmConvidado("Cristiano", 12345);
        conjuntoConvidados.adicionarUmConvidado("Marcelo", 6789);
        conjuntoConvidados.adicionarUmConvidado("Julia", 9876);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados()+ " convidados dentro do Set de convidados!");
        conjuntoConvidados.exibirConvidados();

        conjuntoConvidados.removerConvidadoPeloCodigoConvite(12345);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados()+ " convidados dentro do Set de convidados!");

        conjuntoConvidados.exibirConvidados();
    }
}
