public abstract class Colaborador implements IColaborador {
    private static int geradorMatricula;

    private int matricula;
    private String nome;
    private char tipo;
    protected double valorContribuicao;

    public Colaborador(String nome, char tipo) {
        this.matricula = geradorMatricula;
        geradorMatricula++;
        this.nome = nome;
        this.tipo = tipo;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public char getTipo() {
        return tipo;
    }

    public double getValorContribuicao() {
        return valorContribuicao;
    }
}
