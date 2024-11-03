public class Impressao {
    private static int contadorId;

    private int id;
    private String nomeArquivo;
    private boolean status;

    public Impressao(String nomeArquivo) {
        this.id = contadorId;
        contadorId++;
        this.nomeArquivo = nomeArquivo;
        this.status = false;
    }

    public int getId() {
        return id;
    }

    public String getNomeArquivo() {
        return nomeArquivo;
    }

    public boolean isStatus() {
        return status;
    }

    public void registraInicio() {
        this.status = true;
    }
}
