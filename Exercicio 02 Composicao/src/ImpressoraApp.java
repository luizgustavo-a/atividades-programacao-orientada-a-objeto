public class ImpressoraApp {
    public static void main(String[] args) {
        Impressora impressora = new Impressora(0, "Laser");
        mostrarDadosImpressora(impressora);

        impressora.recebeImpressao("Desenvolvimento Orientado a Objeto");
        mostrarDadosImpressora(impressora);

        impressora.recebeImpressao("Exercício 01 (Herança): Caminhão");
        mostrarDadosImpressora(impressora);

        impressora.recebeImpressao("Exercício 02 (COMPOSIÇÃO): Impressora x Impressão");
        mostrarDadosImpressora(impressora);

        finalizarImpressao(impressora);;

        finalizarImpressao(impressora);

        finalizarImpressao(impressora);

        finalizarImpressao(impressora);

    }

    public static void mostrarDadosImpressora (Impressora impressora) {
        System.out.println("Id: " + impressora.getId());
        System.out.println("Tipo: " + impressora.getTipo());
        System.out.println("Status: " + (impressora.isImprimindo() ? "Imprimindo" : "Em espera"));
        System.out.println("Fila de impressão");
        if(!impressora.getImpressoes().isEmpty()) {
            impressora.getImpressoes()
                    .forEach(i -> System.out.printf("-- Id: %d, Nome do arquivo: %s, Status: %s\n",
                            i.getId(), i.getNomeArquivo(), i.isStatus() ? "Imprmindo" : "Aguardando Impressão"));
        } else {
            System.out.println("-- Fila vazia");
        }
        System.out.println();
    }

    public static void finalizarImpressao (Impressora impressora) {
        if (!impressora.finalizaImpressao()) {
            System.out.println("Não tem impressão para finalizar\n");
        } else {
            mostrarDadosImpressora(impressora);
        }
    }

}
