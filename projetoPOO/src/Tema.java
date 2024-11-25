public class Tema {
    private static int geradorId;

    public int id;
    private String titulo;
    private String subTitulo;

    public Tema(String titulo, String subTitulo) {
        this.id = geradorId;
        geradorId++;
        this.titulo = titulo;
        this.subTitulo = subTitulo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getSubTitulo() {
        return subTitulo;
    }

    @Override
    public String toString() {
        return  "Tema ID.................: " + this.id + "\n" +
                "- Título................: " + this.titulo + "\n" +
                "- SubTítulo.............: " + this.subTitulo + "\n";
    }
}
