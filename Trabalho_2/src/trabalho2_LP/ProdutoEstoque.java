package trabalho2_LP;

public class ProdutoEstoque
{
    private String nome;
    private float valor;
    private int quantidade;

    public ProdutoEstoque(String nome, float valor, int quantidade)
    {
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public String getNome()
    {
        return nome;
    }

    public float getValor()
    {
        return valor;
    }

    public int getQuantidade()
    {
        return quantidade;
    }

    public void setQuantidade(int quantidade)
    {
        this.quantidade = quantidade;
    }
    public void setValor(int valor)
    {
        this.valor = valor;
    }
}