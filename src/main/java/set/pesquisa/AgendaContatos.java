package main.java.set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatosSet;

    public AgendaContatos() {
        this.contatosSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatosSet.add(new Contato(nome, numero));
    }

    public void exibirContato() {
        System.out.println(contatosSet);
    }

    public Set<Contato> pesquisarPeloNome(String nome) {
        Set<Contato> contatoPorNome = new HashSet<>();
        for (Contato contato : contatosSet) {
            if (contato.getNome().startsWith(nome)) {
                contatoPorNome.add(contato);
            }
        }
        return contatoPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato contato : contatosSet) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contato.setNumero(novoNumero);
                contatoAtualizado = contato;
                break;
            }
        }
        return contatoAtualizado;
    }


    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("João", 11111111);
        agendaContatos.adicionarContato("José", 22221111);
        agendaContatos.adicionarContato("Maria", 11112222);
        agendaContatos.adicionarContato("João", 12121111);

        agendaContatos.exibirContato();

        System.out.println(agendaContatos.pesquisarPeloNome("Maria"));

        System.out.println(agendaContatos.atualizarNumeroContato("João", 12341234));

        agendaContatos.exibirContato();

    }
}
