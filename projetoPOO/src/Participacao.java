import java.util.Date;

public class Participacao {
    private Date data;
    private Participante participante;
    private Evento evento;

    public Participacao(Date data) {
        this.data = data;
    }

    public void inserirParticipante(Participante p, Evento e) {
        this.participante = p;
        this.evento = e;
    }
}
