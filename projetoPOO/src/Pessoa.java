public abstract class Pessoa {
    private static int geradorId;

    private int id;
    private String nome;

    public Pessoa(String nome) {
        this.id = geradorId;
        geradorId++;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}
