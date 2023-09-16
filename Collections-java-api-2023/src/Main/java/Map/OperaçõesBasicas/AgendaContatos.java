package Main.java.Map.OperaçõesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContadoMap;

    public AgendaContatos() {
        this.agendaContadoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContadoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContadoMap.isEmpty()) {
            agendaContadoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContadoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContadoMap.isEmpty()) {
            numeroPorNome = agendaContadoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("Camila", 3456);
        agendaContatos.adicionarContato("Camila Cavalcante", 11111111);
        agendaContatos.adicionarContato("Camila DIO", 65456);
        agendaContatos.adicionarContato("Maria Silva", 11111111);
        agendaContatos.adicionarContato("Camila", 4444);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Maria Silva");

        agendaContatos.exibirContatos();

        System.out.println("O número é: " +
                agendaContatos.pesquisarPorNome("Camila DIO"));

    }

}
