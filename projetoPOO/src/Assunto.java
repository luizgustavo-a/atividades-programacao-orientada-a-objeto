import java.util.ArrayList;
import java.util.List;
public class Assunto {
    private static int geradorId;

    private int id;
    private String descricao;
    private List<Evento> eventos;

    public Assunto(String descricao) {
        this.id = geradorId;
        geradorId++;
        this.descricao = descricao;
        this.eventos = new ArrayList<>(); // Inicializa a lista de eventos
    }
    public boolean inserirEvento(Evento evento){
        if (!eventos.contains(evento)) {  //verifica se o evento já está presente na lista eventos.
            return eventos.add(evento); // Adição bem-sucedida
        }
        return false; // Evento já está associado

        /* Se eventos.contains(evento) retornar true (o evento já existe na lista), a condição !eventos.contains(evento)
        será false, e o bloco interno será ignorado.

        Se eventos.contains(evento) retornar false (o evento não está na lista), a condição será true, e o código dentro
        do bloco será executado.

         */
    }
    public boolean removerEvento(Evento evento){
        return eventos.remove(evento); // Remove se existir, retorna true ou false
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public List<Evento> getEventos() {
        return eventos;
    }


    @Override
    public String toString() {
        return  "Assunto ID..............: " + this.id + "\n" +
                "- Descrição.............: " + this.descricao + "\n";
    }
}

