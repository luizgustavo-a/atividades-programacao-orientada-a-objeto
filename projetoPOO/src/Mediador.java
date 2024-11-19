public class Mediador extends Pessoa {
    private String telefone;

    public Mediador(String nome, String telefone) {
        super(nome);
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }
}
