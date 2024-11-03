import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AulasAppExtra {
    private static List<Recurso> listaRecursos = new ArrayList<>();
    private static List<Aula> listaAulas = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);
    private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void main(String[] args) {
        boolean sair = false;
        while (!sair) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Cadastrar Recurso");
            System.out.println("2. Cadastrar Aula");
            System.out.println("3. Registrar Recurso em Aula");
            System.out.println("4. Remover Recurso de Aula");
            System.out.println("5. Consultar Aula");
            System.out.println("6. Excluir Aula");
            System.out.println("7. Listar Aulas");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch (opcao) {
                case 1:
                    cadastrarRecurso();
                    break;
                case 2:
                    cadastrarAula();
                    break;
                case 3:
                    registrarRecursoAula();
                    break;
                case 4:
                    removerRecursoAula();
                    break;
                case 5:
                    consultarAula();
                    break;
                case 6:
                    excluirAula();
                    break;
                case 7:
                    listarAulas();
                    break;
                case 0:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private static void cadastrarRecurso() {
        System.out.println("CADASTRO DE RECURSO");

        System.out.print("Digite a descrição do recurso: ");
        String descricao = sc.nextLine();

        System.out.print("Digite o tipo do recurso (D - Digital, F - Físico): ");
        char tipo = sc.nextLine().toUpperCase().charAt(0);

        Recurso recurso = new Recurso(descricao, tipo);
        listaRecursos.add(recurso);

        System.out.println("Recurso cadastrado com sucesso.");
        mostrarDadosRecurso(recurso);
    }

    private static void cadastrarAula() {
        System.out.println("CADASTRO DE AULA");

        System.out.print("Digite a data da aula (dd/mm/aaaa): ");
        LocalDate data = LocalDate.parse(sc.nextLine(), dtf);

        System.out.print("Digite o objetivo da aula: ");
        String objetivo = sc.nextLine();

        Aula aula = new Aula(data, objetivo);
        listaAulas.add(aula);

        System.out.println("Aula cadastrada com sucesso.");
        mostrarDadosAula(aula);
    }

    private static void registrarRecursoAula() {
        System.out.println("REGISTRAR RECURSO EM AULA");

        System.out.print("Digite o ID da aula: ");
        int idAula = sc.nextInt();
        sc.nextLine();
        Aula aula = buscarAulaPorId(idAula);

        if (aula != null) {
            System.out.print("Digite o ID do recurso: ");
            int idRecurso = sc.nextInt();
            sc.nextLine();
            Recurso recurso = buscarRecursoPorId(idRecurso);

            if (recurso != null) {
                if (aula.adicionarRecurso(recurso)) {
                    System.out.println("Recurso adicionado com sucesso à aula!");
                } else {
                    System.out.println("Este recurso já foi adicionado à aula.");
                }
                mostrarDadosAula(aula);
            } else {
                System.out.println("Recurso não encontrado.");
            }
        } else {
            System.out.println("Aula não encontrada.");
        }
    }

    private static void removerRecursoAula() {
        System.out.println("REMOVER RECURSO EM AULA");

        System.out.print("Digite o ID da aula: ");
        int idAula = sc.nextInt();
        sc.nextLine();
        Aula aula = buscarAulaPorId(idAula);

        if (aula != null) {
            System.out.print("Digite o ID do recurso a ser removido: ");
            int idRecurso = sc.nextInt();
            Recurso recurso = buscarRecursoPorId(idRecurso);

            if (recurso != null) {
                if (aula.removerRecurso(recurso)) {
                    System.out.println("Recurso removido com sucesso da aula!");
                } else {
                    System.out.println("Este recurso não está associado à aula.");
                }
                mostrarDadosAula(aula);
            } else {
                System.out.println("Recurso não encontrado.");
            }
        } else {
            System.out.println("Aula não encontrada.");
        }
    }

    private static void consultarAula() {
        System.out.println("CONSULTAR AULA");

        System.out.print("Digite o ID da aula: ");
        int idAula = sc.nextInt();
        sc.nextLine();
        Aula aula = buscarAulaPorId(idAula);

        if (aula != null) {
            mostrarDadosAula(aula);
        } else {
            System.out.println("Aula não encontrada.");
        }
    }

    private static void excluirAula() {
        System.out.println("EXCLUIR AULA");

        System.out.print("Digite o ID da aula a ser excluída: ");
        int idAula = sc.nextInt();
        sc.nextLine();
        Aula aula = buscarAulaPorId(idAula);

        if (aula != null) {
            listaAulas.remove(aula);
            System.out.println("Aula excluída com sucesso!");
        } else {
            System.out.println("Aula não encontrada.");
        }
    }

    private static void listarAulas() {
        System.out.println("LISTAR AULAS");

        if (listaAulas.isEmpty()) {
            System.out.println("Nenhuma aula cadastrada.");
        } else {
            System.out.println("--- Lista de Aulas ---");
            for (Aula aula : listaAulas) {
                System.out.println("ID: " + aula.getId() + ", Data: " + aula.getData() + ", Objetivo: " + aula.getObjetivo());
            }
        }
    }

    private static Aula buscarAulaPorId(int id) {
        for (Aula aula : listaAulas) {
            if (aula.getId() == id) {
                return aula;
            }
        }
        return null;
    }

    private static Recurso buscarRecursoPorId(int id) {
        for (Recurso recurso : listaRecursos) {
            if (recurso.getId() == id) {
                return recurso;
            }
        }
        return null;
    }

    private static void mostrarDadosAula(Aula aula) {
        System.out.println("ID: " + aula.getId() + ", Data: " + dtf.format(aula.getData()) + ", Objetivo: " + aula.getObjetivo());
        System.out.println("Recursos na aula:");
        for (Recurso recurso : aula.getRecursos()) {
            System.out.println(" - " + recurso.getDescricao() + " (" + recurso.getTipo() + ")");
        }
        System.out.println();
    }

    private static void mostrarDadosRecurso(Recurso recurso) {
        System.out.println("ID: " + recurso.getId() + ", Descrição: " + recurso.getDescricao() + ", Tipo: " +
                ((recurso.getTipo() == 'D') ? "Digital" : "Físico"));
        System.out.println();
    }

}
