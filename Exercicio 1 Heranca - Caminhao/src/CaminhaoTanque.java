public class CaminhaoTanque extends Caminhao {
    private String tipo;

    public CaminhaoTanque(String modelo, int anoFabricacao, int capacidadeTotal, char unidade, String tipo) {
        super(modelo, anoFabricacao, capacidadeTotal, unidade);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void encheTanque() {
        super.cargaAtual = getCapacidadeTotal();
    }

    public void esvaziaTanque() {
        super.cargaAtual = 0;
    }

    public void abasteceTanque(int qtdeLitros) {
        super.cargaAtual += qtdeLitros;
    }

    public void descarregaTanque(int qtdeLitros) {
        super.cargaAtual -= qtdeLitros;
    }
}
