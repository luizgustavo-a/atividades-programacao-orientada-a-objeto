public class Mediador extends Pessoa {
    private String telefone;

    public Mediador(String nome, String telefone) {
        super(nome);
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    @Override
    public String toString() {
        return  "Mediador ID.............: " + super.getId() + "\n" +
                "- Nome..................: " + super.getNome() + "\n" +
                "- Telefone..............: " + this.getTelefone() + "\n";
    }
}
