import java.text.SimpleDateFormat;
import java.util.Date;

public class Participacao {
    private Date data;
    private Evento evento;
    private Participante participante;

    public Participacao(Date data) {
        this.data = data;
    }

    public void inserirParticipante(Participante p, Evento e) {
        this.participante = p;
        this.evento = e;
    }

    public Date getData() {
        return data;
    }

    public Evento getEvento() {
        return evento;
    }

    public Participante getParticipante() {
        return participante;
    }

    @Override
    public String toString() {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        return  "Participação............: \n" +
                "- Data..................: " + df.format(this.data) + "\n" +
                "- Participante..........: ID: " + this.participante.getId() + " | Nome: " + this.participante.getNome() + "\n" +
                "- Evento................: ID: " + this.evento.getId() + " | Tema: " + this.evento.getTema().getTitulo() + " - " + this.evento.getTema().getSubTitulo() + "\n";

    }
}