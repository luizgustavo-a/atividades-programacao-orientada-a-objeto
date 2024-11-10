public class ProdutosApp {
    public static void main(String[] args) {
        Produto produtoFornecedore = new Produto("000", "Produto de Fornecedores", 1000.0, 20.0, 18.0);
        produtoFornecedore.calculaPrecoVenda();
        System.out.println(produtoFornecedore);

        Produto prodIndustrializado = new ProdutoIndustrializado("001", "Produto Industrializado", 1000.0, 20.0, 18.0, 5.0);
        prodIndustrializado.calculaPrecoVenda();
        System.out.println(prodIndustrializado);

        Produto prodRepresentado = new ProdutoRepresentado("002", "Produto Representado", 1000.0, 20.0, 18.0, 10.0);
        prodRepresentado.calculaPrecoVenda();
        System.out.println(prodRepresentado);
    }
}
