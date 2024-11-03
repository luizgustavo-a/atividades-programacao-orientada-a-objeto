import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AulasApp {
    private static List<Recurso> listaRecursos = new ArrayList<>();
    private static List<Aula> listaAulas = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        listaRecursos.add(new Recurso("Projetor", 'D'));
        listaRecursos.add(new Recurso("Computador", 'D'));
        listaRecursos.add(new Recurso("Microscópio", 'F'));

        Aula aula = new Aula(LocalDate.of(2024, 10, 20), "Aula de Biologia Molecular");
        listaAulas.add(aula);
        mostrarDadosAula(aula);

        for (Recurso recurso : listaRecursos) {
            aula.adicionarRecurso(recurso);
        }

        System.out.println("Dados da aula com os recursos registrados:");
        mostrarDadosAula(aula);

        Recurso recursoParaExcluir = listaRecursos.get(1);
        aula.removerRecurso(recursoParaExcluir);

        System.out.println("Dados da aula após excluir o segundo recurso:");
        mostrarDadosAula(aula);

        System.out.println("Lista de todos os recursos cadastrados:");
        mostrarTodosRecursos();
    }

    private static void mostrarDadosAula(Aula aula) {
        System.out.println("ID: " + aula.getId() + ", Data: " + aula.getData() + ", Objetivo: " + aula.getObjetivo());
        System.out.println("Recursos na aula:");
        for (Recurso recurso : aula.getRecursos()) {
            System.out.println(" - " + recurso.getDescricao() + " (" + recurso.getTipo() + ")");
        }
        System.out.println();
    }

    private static void mostrarTodosRecursos() {
        if (listaRecursos.isEmpty()) {
            System.out.println("Nenhum recurso cadastrado.");
        } else {
            for (Recurso recurso : listaRecursos) {
                System.out.println("ID: " + recurso.getId() + ", Descrição: " + recurso.getDescricao() + ", Tipo: " + recurso.getTipo());
            }
        }
        System.out.println();
    }
}
