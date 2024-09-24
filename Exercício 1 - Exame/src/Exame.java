public class Exame {
    int idExame;
    int nivelGlicose;

    String obterDiagnostico() {
        if (nivelGlicose < 100) {
            return "Normal";
        }
        if (nivelGlicose < 125) {
            return "Pré-diabetes";
        }
        return "Diabetes";
    }
}
