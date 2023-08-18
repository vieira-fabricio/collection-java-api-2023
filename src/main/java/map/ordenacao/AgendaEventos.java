package main.java.map.ordenacao;

import main.java.map.operacoesBasicas.AgendaContatos;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

    private Map<LocalDate, Eventos> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEventos(LocalDate data, String nome, String atracao) {
        //Eventos novoEvento = new Eventos(nome, atracao);
        eventosMap.put(data, new Eventos(nome, atracao));
    }

    public void exibirAgenda() {
        Map<LocalDate, Eventos> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento() {
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Eventos proximoEvento = null;

        Map<LocalDate, Eventos> eventosTreeMap = new TreeMap<>(eventosMap);
        for (Map.Entry<LocalDate, Eventos> entry : eventosTreeMap.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento " +proximoEvento+ " acontecerá na data: " +proximaData);
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.exibirAgenda();

        agendaEventos.adicionarEventos(LocalDate.of(2023, Month.NOVEMBER, 02), "Evento 1", "Dia de finados");
        agendaEventos.adicionarEventos(LocalDate.of(2023, Month.NOVEMBER, 03), "Evento 2", "Aniversário");
        agendaEventos.adicionarEventos(LocalDate.of(2023, Month.NOVEMBER, 15), "Evento 3", "Procramação de republica");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();
    }
}
