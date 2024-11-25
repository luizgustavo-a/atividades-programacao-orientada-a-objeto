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

    public void registrarDica(Convidado convidado, Topico topico, String descricao) {
        this.convidado = convidado;
        this.topico = topico;
        this.descricao = descricao;
    }

    public Topico getTopico() {
        return topico;
    }

    public Convidado getConvidado() {
        return convidado;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return  "Dica ID.................: " + this.id + "\n" +
                "- Descrição.............: " + this.descricao + "\n" +
                "- Convidado.............: ID: " + this.convidado.getId() + " | Nome: " + this.convidado.getNome() + "\n" +
                "- Tópico................: ID: " + this.topico.getId() + " | Descrição: " + this.topico.getDescricao() + "\n";
    }
}