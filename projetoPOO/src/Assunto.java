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
        this.eventos= new ArrayList<>();
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

    public boolean removerEvento(Evento evento) {
        return eventos.remove(evento);
    }

    @Override
    public String toString() {
        return  "Assunto ID..............: " + this.id + "\n" +
                "- Descrição.............: " + this.descricao + "\n";
    }
}
