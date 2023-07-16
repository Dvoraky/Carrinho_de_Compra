package trabalho2_LP;

public class Principal
{
    public static void main(String[] args) 
    {
        EstoqueProdutos estoque = new EstoqueProdutos();
        estoque.adicionaProduto(new ProdutoEstoque("monitor", 500, 100));
        estoque.adicionaProduto(new ProdutoEstoque("telefone", 150, 300));
        estoque.adicionaProduto(new ProdutoEstoque("teclado", 70, 50));
        estoque.adicionaProduto(new ProdutoEstoque("mouse", 50, 50));
        
        CarrinhoCompra carrinho = new CarrinhoCompra(estoque);
        carrinho.adicionaItem("monitor", 2);
        carrinho.adicionaItem("telefone", 5);
        carrinho.adicionaItem("teclado", 2);             

        System.out.printf("A soma dos produtos: R$ %.2f%n", carrinho.calculaTotal());

        carrinho.finalizaCompra();

        System.out.printf("A soma dos produtos apos a compra: R$ %.2f%n", carrinho.calculaTotal());

        for (int i = 0; i < estoque.getQuantidadeProdutos();i++)
        {
            System.out.println("Quantidade atual de " + estoque.getProduto(i).getNome()+ " no estoque: " + estoque.getProduto(i).getQuantidade());
        }
       
    }
}