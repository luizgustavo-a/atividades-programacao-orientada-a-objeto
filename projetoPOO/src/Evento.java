import java.time.LocalDateTime;
import java.util.List;

public class Evento {
    private static int geradorId;

    private int id;
    private LocalDateTime data;
    private int duracao;
    private String local;
    private List<Assunto> assuntos;
    private Tema tema;
    private Mediador mediador;
    private List<Convidado> convidados;

    public Evento(LocalDateTime data, int duracao, Tema tema) {
        this.id = geradorId;
        geradorId++;
        this.data = data;
        this.duracao = duracao;
        this.tema = tema;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getData() {
        return data;
    }

    public int getDuracao() {
        return duracao;
    }

    public String getLocal() {
        return local;
    }

    public List<Assunto> getAssuntos() {
        return assuntos;
    }

    public Tema getTema() {
        return tema;
    }

    public Mediador getMediador() {
        return mediador;
    }

    public List<Convidado> getConvidados() {
        return convidados;
    }

    public void informarLocal(String local) {
        this.local = local;
    }

    public boolean inserirAssunto(Assunto assunto) {
        return this.assuntos.add(assunto);
    }

    public boolean removerAssunto(Assunto assunto) {
        return this.assuntos.remove(assunto);
    }

    public void registrarMediador(Mediador mediador) {
        this.mediador = mediador;
    }

    public boolean inserirConvidado(Convidado convidado) {
        return this.convidados.add(convidado);
    }

    public boolean removerConvidado(Convidado convidado) {
        return this.convidados.remove(convidado);
    }
}

