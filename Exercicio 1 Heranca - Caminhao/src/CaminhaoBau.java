public class CaminhaoBau extends Caminhao{
    private double volume;
    private double comprimento;
    private double largura;
    private double altura;

    public CaminhaoBau(String modelo, int anoFabricacao, int capacidadeTotal, char unidade, double comprimento, double altura, double largura) {
        super(modelo, anoFabricacao, capacidadeTotal, unidade);
        this.comprimento = comprimento;
        this.altura = altura;
        this.largura = largura;
        this.volume = calculaVolume();
    }

    public double getVolume() {
        return volume;
    }

    public double getComprimento() {
        return comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void carregaBau(double qtdeQuilos) {
        super.cargaAtual += qtdeQuilos/1000;
    }

    public void descarregaBau(double qtdeQuilos) {
        super.cargaAtual -= qtdeQuilos/1000;
    }

    private double calculaVolume(){
        return this.altura * this.largura * this.comprimento;
    }
}
