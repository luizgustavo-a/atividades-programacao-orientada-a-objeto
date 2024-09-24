public class Livro {
    private int idLivro;
    private String titulo;
    private String assunto;

    public Livro(int idLivro, String titulo, String assunto) {
        this.idLivro = idLivro;
        this.titulo = titulo;
        this.assunto = assunto;
    }

    public int getIdLivro() {
        return idLivro;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
