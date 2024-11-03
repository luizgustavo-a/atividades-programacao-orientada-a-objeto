public class Recurso {
    private static int contadorId = 1001;

    private int id;
    private String descricao;
    private char tipo;

    public Recurso(String descricao, char tipo) {
        this.id = contadorId;
        contadorId++;
        this.descricao = descricao;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public char getTipo() {
        return tipo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }
}
