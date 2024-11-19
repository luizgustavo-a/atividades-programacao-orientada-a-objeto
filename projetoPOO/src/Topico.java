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
}
