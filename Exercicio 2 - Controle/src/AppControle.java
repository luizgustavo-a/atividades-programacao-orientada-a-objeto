public class AppControle {
    public static void main(String[] args) {
        ControleTelevisao controleTelevisao = new ControleTelevisao(1, "modelo");

        System.out.printf("""
                Id Controle: %d
                Modelo: %s
                Canal Atual: %d
                Ligado: %b\n
                """,
                controleTelevisao.getIdControle(),
                controleTelevisao.getModelo(),
                controleTelevisao.getCanalAtual(),
                controleTelevisao.isLigado());

        controleTelevisao.ligarDesligar();
        System.out.printf("""
                Canal atual: %d
                Ligado: %b\n
                """,
                controleTelevisao.getCanalAtual(),
                controleTelevisao.isLigado());

        for (int i = 0; i < 3; i++) {
            controleTelevisao.avancaCanal();
            System.out.println("Canal atual: " + controleTelevisao.getCanalAtual());
        }

        if(controleTelevisao.irParaCanal(7)) {
            System.out.printf("\nCanal atual: %s\n\n", controleTelevisao.getCanalAtual());
        } else {
            System.out.println("\nCanal inexistente\n");
        }

        if(controleTelevisao.irParaCanal(1)) {
            System.out.printf("Canal atual: %s\n\n", controleTelevisao.getCanalAtual());
        } else {
            System.out.println("Canal inexistente\n");
        }

        for (int i = 0; i < 2; i++) {
            controleTelevisao.retornaCanal();
            System.out.println("Canal atual: " + controleTelevisao.getCanalAtual());
        }

        controleTelevisao.ligarDesligar();
        System.out.printf("""
                \nCanal atual: %d
                Ligado: %b\n
                """,
                controleTelevisao.getCanalAtual(),
                controleTelevisao.isLigado());

        controleTelevisao.avancaCanal();
        System.out.printf("Canal atual: %s", controleTelevisao.getCanalAtual());
    }
}
