public class Topico {
    private static int geradorId;

    private int id;
    private String descricao;
    private Assunto assunto;
    private Evento evento;

    public Topico(String descricao, Assunto assunto, Evento evento) {
        this.id = geradorId;
        geradorId++;
        this.descricao = descricao;
        this.assunto = assunto;
        this.evento = evento;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public Assunto getAssunto() {
        return assunto;
    }

    public Evento getEvento() {
        return evento;
    }

    @Override
    public String toString() {
        return  "Tópico ID...............: " + this.id + "\n" +
                "- Descrição.............: " + this.descricao + "\n" +
                "- Assunto...............: ID: " + this.assunto.getId() + " | Descrição: " + this.assunto.getDescricao() + "\n" +
                "- Evento................: ID: " + this.evento.getId() + " | Tema: " + this.evento.getTema().getTitulo() + " - " + this.evento.getTema().getSubTitulo() + "\n";
    }
}
