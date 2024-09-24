package aula05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExameApp {

    public static Scanner sc = new Scanner(System.in);
    public static List<Exame> exames = new ArrayList<>();

    public static void main(String[] args) {
        int opcao = 0;
        do {
            System.out.println("""
                    1 - Inserir exame
                    2 - Consultar exame
                    3 - Alterar nível de glicose
                    4 - Excluir exame
                    5 - Listar exames
                    0 - Finalizar
                    """);
            System.out.print("\nOpção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    inserirExame();
                    break;
                case 2:
                    consultarExame();
                    break;
                case 3:
                    alterarNivelGlicose();
                    break;
                case 4:
                    excluirExame();
                    break;
                case 5:
                    listarExames();
                    break;
                case 0:
                    System.out.println("\n--- PROGRAMA FINALIZADO");
                    break;
                default:
                    System.out.println("\nOpção incorreta");
            }

        } while (true);
    }

    private static void inserirExame() {
        do {
            System.out.println("\n*** INSERIR EXAME ***\n");

            System.out.println("\nCódigo do exame para cadastro ou [0] para retornar:");
            int codigo = sc.nextInt();

            if(codigo == 0) {
                return;
            }

            if(pesquisarExamePorCodigo(codigo)!= null){
                System.out.println("\n-- Código já cadastrado --\n");
                continue;
            }

            System.out.println("Nível de glicose (mg/dl):");
            int nivelGlicose = sc.nextInt();

            Exame exame = new Exame(codigo, nivelGlicose);
            exames.add(exame);
            System.out.println("\n-- Exame cadastrado --\n");

            mostrarExame(exame);
        } while (true);
    }

    private static void consultarExame() {
        do {
            System.out.println("\n*** CONSULTAR EXAME ***\n");

            System.out.println("\nCódigo do exame para consulta ou [0] para retornar:");
            int codigo = sc.nextInt();

            if(codigo == 0) {
                return;
            }

            Exame exameEncontrado = pesquisarExamePorCodigo(codigo);

            if (exameEncontrado == null ) {
                System.out.println("\n-- Código não cadastrado --\n");
                continue;
            }

            mostrarExame(exameEncontrado);
        } while (true);
    }

    private static void alterarNivelGlicose() {
        System.out.println("\n*** ALTERAR NÍVEL DE GLICOSE ***\n");

        System.out.println("\nCódigo do exame para alteração ou [0] para retornar:");
        int codigo = sc.nextInt();

        if(codigo == 0) {
            return;
        }

        Exame exameEncontrado = pesquisarExamePorCodigo(codigo);

        if (exameEncontrado == null ) {
            System.out.println("\n-- Código não cadastrado --\n");
            return;
        }

        System.out.println("\nDigite o novo nível de glicose (mg/dl):");
        int novoNivelGlicose = sc.nextInt();

        exameEncontrado.alteraNivelGlicose(novoNivelGlicose);

        mostrarExame(exameEncontrado);
    }

    private static void excluirExame() {
        System.out.println("\n*** EXCLUIR EXAME ***\n");

        System.out.println("\nCódigo do exame para excluir ou [0] para retornar:");
        int codigo = sc.nextInt();

        if(codigo == 0) {
            return;
        }

        Exame exameEncontrado = pesquisarExamePorCodigo(codigo);

        if (exameEncontrado == null ) {
            System.out.println("\n-- Código não cadastrado --\n");
            return;
        }

        mostrarExame(exameEncontrado);

        sc.nextLine();
        char confirma;
        do {
            System.out.printf("\nConfirma exclusão [S/N]: ");
            confirma = sc.nextLine().charAt(0);
            confirma = Character.toUpperCase(confirma);
            if(confirma!='S' && confirma!='N') {
                continue;
            }
            break;
        } while (true);

        if (confirma=='S') {
            exames.remove(exameEncontrado);
            System.out.println("-- Exame excluído com sucesso\n");
        }
    }

    private static void listarExames() {
        System.out.println("\n*** LISTAR EXAMES ***\n");

        if (exames.isEmpty()) {
            System.out.println("Nenhum exame cadastrado\n");
            return;
        }

        sc.nextLine();
        char status;
        do {
            System.out.println("Tipo de diagnóstico para listagem :");
            System.out.println("N - Normal");
            System.out.println("P - Pré-diabetes");
            System.out.println("D - Diabetes");
            System.out.println("T - Todos");
            System.out.println("Filtar por situação: ");
            status = sc.nextLine().charAt(0);
            status = Character.toUpperCase(status);
            if(status!='N' && status!='P' && status!='D' && status!='T') {
                System.out.println("-- Opção inválida");
                continue;
            }
            break;
        } while (true);

        System.out.println("\n=======================================");
        System.out.println("Código  Nível de Glicose  Dianóstico");
        System.out.println("=======================================");

        for (Exame exame: exames) {
            if (status=='N' && exame.getDiagnostico().equals("Normal") ||
                    status=='P' && exame.getDiagnostico().equals("Pré-diabetes") ||
                    status=='D' && exame.getDiagnostico().equals("Diabetes") ||
                    status=='T' ) {

                System.out.printf("%6d  %16d  %-13s\n",
                        exame.getIdExame(),
                        exame.getNivelGlicose(),
                        exame.getDiagnostico());
            }
        }
        System.out.println("=======================================\n");
    }

    private static void mostrarExame(Exame exame) {
        System.out.printf("""
                \nId do exame.....: %d
                Nível de glicose: %d
                Diagnóstico.....: %s\n
                """,
                exame.getIdExame(),
                exame.getNivelGlicose(),
                exame.getDiagnostico());
    }

    private static Exame pesquisarExamePorCodigo(int codigo) {
        for(Exame exame : exames) {
            if(codigo == exame.getIdExame()) {
                return exame;
            }
        }
        return null;
    }
}
