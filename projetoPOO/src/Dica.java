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

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public Convidado getConvidado() {
        return convidado;
    }

    public Topico getTopico() {
        return topico;
    }

    public void registrarDica(Convidado c, Topico t, String descricao) {
        this.convidado = c;
        this.topico = t;
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return  "Dica ID.................: " + this.id + "\n" +
                "- Descrição.............: " + this.descricao + "\n" +
                "- Convidado.............: ID: " + this.convidado.getId() + " | Nome: " + this.convidado.getNome() + "\n" +
                "- Tópico................: ID: " + this.topico.getId() + " | Descrição: " + this.topico.getDescricao() + "\n";
    }
}
