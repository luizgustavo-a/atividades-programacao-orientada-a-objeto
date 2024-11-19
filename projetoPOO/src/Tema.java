public class Tema {
    private static int geradorId;

    private int id;
    private String descricao;

    public Tema(String descricao) {
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
}
