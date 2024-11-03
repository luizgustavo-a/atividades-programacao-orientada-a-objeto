import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Aula {
    private static int contadorId;

    private int id;
    private LocalDate data;
    private String objetivo;
    private List<Recurso> recursos;

    public Aula(LocalDate data, String objetivo) {
        this.id = contadorId;
        contadorId++;
        this.data = data;
        this.objetivo = objetivo;
        this.recursos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public List<Recurso> getRecursos() {
        return recursos;
    }

    public boolean adicionarRecurso(Recurso recurso) {
        if (!recursos.contains(recurso)) {
            recursos.add(recurso);
            return true;
        }
        return false;
    }

    public boolean removerRecurso(Recurso recurso) {
        return recursos.remove(recurso);
    }
}
