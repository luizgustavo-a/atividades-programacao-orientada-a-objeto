import java.util.Scanner;

public class AppExame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Exame exame = new Exame();

        System.out.println("Identificador do exame:");
        exame.idExame = sc.nextInt();

        System.out.println("Nível de glicose:");
        exame.nivelGlicose = sc.nextInt();

        System.out.printf("\nIdentificador do exame: %d" +
                "\nNível de glicose: %d mg/dL" +
                "\nDiagnóstico do exame: %s",
                exame.idExame, exame.nivelGlicose, exame.obterDiagnostico());

        sc.close();
    }
}
