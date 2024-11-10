public class Produto {
    private String codigo;
    private String descricao;
    private double precoCusto;
    protected double precoVenda;
    private double percLucro;
    private double percIcms;

    public Produto(String codigo, String descricao, double precoCusto, double percLucro, double percIcms) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.precoCusto = precoCusto;
        this.percLucro = percLucro;
        this.percIcms = percIcms;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public double getPercLucro() {
        return percLucro;
    }

    public double getPercIcms() {
        return percIcms;
    }

    public void calculaPrecoVenda() {
        this.precoVenda = this.precoCusto * (1 + percIcms/100) *  (1 + percLucro/100);
    }

    @Override
    public String toString() {
        return    "Código.....................: " + getCodigo() +
                "\nDescrição..................: " + getDescricao() +
                "\nPreço de custo.............: R$" + String.format("%.2f", getPrecoCusto()) +
                "\nPercentual do lucro........: " + String.format("%.1f", getPercLucro()) + "%" +
                "\nPercentual do ICMS.........: " + String.format("%.1f", getPercIcms()) + "%" +
                "\nPreço de venda.............: R$" + String.format("%.2f", getPrecoVenda()) + "\n";
    }
}
