public class Dica {
    private static int geradorId;

    private int id;
    private String descricao;
    private Convidado convidado;
    private Topico topico;

    public Dica() {
        this.id = geradorId;
        geradorId++;
    }

    public void registrarDica(Convidado c, Topico t, String descricao) {
        this.convidado = c;
        this.topico = t;
        this.descricao = descricao;
    }
}
