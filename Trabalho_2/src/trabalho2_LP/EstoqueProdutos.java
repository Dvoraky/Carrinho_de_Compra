package trabalho2_LP;

public class EstoqueProdutos
{
    private ProdutoEstoque[] produtos;
    private int quantidadeProdutos;

    public EstoqueProdutos()
    {
        produtos = new ProdutoEstoque[100];
        quantidadeProdutos = 0;
    }

    public void adicionaProduto(ProdutoEstoque produto)
    {
        if(quantidadeProdutos < produtos.length)
        {
            produtos[quantidadeProdutos] = produto;
            quantidadeProdutos++;
        }
        else
        {
            System.out.println("Estoque cheio, não é possível adicionar mais produtos.");
        }
    }

    public ProdutoEstoque getProduto(int indice)
    {
        if(indice >= 0 && indice < quantidadeProdutos)
        {
            return produtos[indice];
        }
        return null;
    }

    public int getQuantidadeProdutos()
    {
        return quantidadeProdutos;
    }
}