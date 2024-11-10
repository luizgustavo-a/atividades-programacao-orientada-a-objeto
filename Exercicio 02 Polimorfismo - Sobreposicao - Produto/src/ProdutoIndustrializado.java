public class ProdutoIndustrializado extends Produto{
    private double percIpi;

    public ProdutoIndustrializado(String codigo, String descricao, double precoCusto, double percLucro, double percIcms, double percIpi) {
        super(codigo, descricao, precoCusto, percLucro, percIcms);
        this.percIpi = percIpi;
    }

    @Override
    public void calculaPrecoVenda() {
        double valorIcms = getPrecoCusto() * getPercIcms()/100;
        double valorIpi = getPrecoCusto() * this.percIpi/100;
        super.precoVenda = (getPrecoCusto() + valorIpi + valorIcms) * (1 + getPercLucro()/100);
    }

    @Override
    public String toString() {
        return    "Código.....................: " + getCodigo() +
                "\nDescrição..................: " + getDescricao() +
                "\nPreço de custo.............: R$" + String.format("%.2f", getPrecoCusto()) +
                "\nPercentual do lucro........: " + String.format("%.1f", getPercLucro()) + "%" +
                "\nPercentual do ICMS.........: " + String.format("%.1f", getPercIcms()) + "%" +
                "\nPercentual do IPI..........: " + String.format("%.1f", this.percIpi) + "%" +
                "\nPreço de venda.............: R$" + String.format("%.2f", getPrecoVenda()) + "\n";
    }
}
