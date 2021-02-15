/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

public class ProdutoCarrinho {
    private Produto produto;
    private int quantidade = 1;
    
    public ProdutoCarrinho(Produto produto) {
        this.produto = produto;
    }
    
    public String getInfoString() {
        return String.format("%6d | %-20s | %10d | R$%-12.2f | R$%-9.2f", produto.getId(), produto.getNome(), quantidade, produto.getPreco(), produto.getPreco() * quantidade);
    }
    
    public Produto getProduto() {
        return produto;
    }
    
    public int getQuantidade() {
        return quantidade;
    }
    
    public void setQuantidade(int valor) {
        quantidade = valor;
    }
}
