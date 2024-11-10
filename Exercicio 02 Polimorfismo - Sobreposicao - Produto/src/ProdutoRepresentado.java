public class ProdutoRepresentado extends Produto{
    private double percRepresentacao;

    public ProdutoRepresentado(String codigo, String descricao, double precoCusto, double percLucro, double percIcms, double percRepresentacao) {
        super(codigo, descricao, precoCusto, percLucro, percIcms);
        this.percRepresentacao = percRepresentacao;
    }

    @Override
    public void calculaPrecoVenda() {
        double valorIcms = getPrecoCusto() * getPercIcms()/100;
        double valorRep = getPrecoCusto() * this.percRepresentacao/100;

        super.precoVenda = (getPrecoCusto() + valorIcms + valorRep) * (1 + getPercLucro()/100);
    }

    @Override
    public String toString() {
        return    "Código.....................: " + getCodigo() +
                "\nDescrição..................: " + getDescricao() +
                "\nPreço de custo.............: R$" + String.format("%.2f", getPrecoCusto()) +
                "\nPercentual do lucro........: " + String.format("%.1f", getPercLucro()) +  "%" +
                "\nPercentual do ICMS.........: " + String.format("%.1f", getPercIcms()) + "%" +
                "\nPercentual de Representação: " + String.format("%.1f", this.percRepresentacao) + "%" +
                "\nPreço de venda.............: R$" + String.format("%.2f", getPrecoVenda()) + "\n";
    }
}
