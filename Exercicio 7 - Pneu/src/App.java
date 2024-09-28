public class App {
    public static void main(String[] args) {
        Fabricante fabricante = new Fabricante("12.345.678/0001-12", "Nome", "Razão");
        Pneu pneu = new Pneu(1, "Modelo", 110.0, fabricante);

        mostrarDadosPneu(pneu);

        if(pneu.desgastar(4, 14)) {
            System.out.printf("""
                    Índice de vida: %.2f
                    Horas de uso: %d
                    Estado: %c\n
                    """,
                    pneu.getIndiceDeVida(),
                    pneu.getHorasDeUso(),
                    pneu.getEstado());
        } else {
            System.out.println("Pneu fora de uso");
        }

        if(pneu.desgastar(15, 20)) {
            System.out.printf("""
                    Índice de vida: %.2f
                    Horas de uso: %d
                    Estado: %c\n
                    """,
                    pneu.getIndiceDeVida(),
                    pneu.getHorasDeUso(),
                    pneu.getEstado());
        } else {
            System.out.println("Pneu fora de uso");
        }

        if(pneu.desgastar(21, 23)) {
            System.out.printf("""
                    Índice de vida: %.2f
                    Horas de uso: %d
                    Estado: %c\n
                    """,
                    pneu.getIndiceDeVida(),
                    pneu.getHorasDeUso(),
                    pneu.getEstado());
        } else {
            System.out.println("Pneu fora de uso");
        }

    }

    private static void mostrarDadosPneu(Pneu pneu) {
        System.out.printf("""
                Id : %d
                Modelo: %s
                Índice de vida: %.2f
                Estado: %c
                Horas de Uso: %d
                Fabricante:
                - CNPJ: %s
                - Nome Fantasia: %s
                - Razão Social: %s\n
                """,
                pneu.getIdPneu(),
                pneu.getModelo(),
                pneu.getIndiceDeVida(),
                pneu.getEstado(),
                pneu.getHorasDeUso(),
                pneu.getFabricante().getCnpj(),
                pneu.getFabricante().getNomeFantasia(),
                pneu.getFabricante().getRazaoSocial());
    }
}
