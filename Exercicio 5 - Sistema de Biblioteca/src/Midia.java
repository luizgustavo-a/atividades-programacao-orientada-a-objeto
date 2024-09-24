public class Midia {
    private int idMidia;
    private String descricao;

    public Midia(int idMidia, String descricao) {
        this.idMidia = idMidia;
        this.descricao = descricao;
    }

    public int getIdMidia() {
        return idMidia;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
