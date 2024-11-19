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
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean inserirEvento(Evento evento) {
        return eventos.add(evento);
    }

    public boolean removerrEvento(Evento evento) {
        return eventos.remove(evento);
    }
}
