/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.util.ArrayList;

public class Carrinho {
    private static ArrayList<ProdutoCarrinho> produtosCarrinho = new ArrayList<ProdutoCarrinho>();
    
    public static void adicionar(Produto produto) {
        for (ProdutoCarrinho produtoCarrinho : produtosCarrinho) {
            Produto produtoExistente = produtoCarrinho.getProduto();
            if (produtoExistente.equals(produto)) {
                produtoCarrinho.setQuantidade(produtoCarrinho.getQuantidade() + 1);
                return;
            }
        }
        
        produtosCarrinho.add(new ProdutoCarrinho(produto));
    }
    
    public static float getValorTotal() {
        float total = 0;
        for (ProdutoCarrinho produtoCarrinho : produtosCarrinho) {
            total += produtoCarrinho.getProduto().getPreco() * produtoCarrinho.getQuantidade();
        }
        return total;
    }
    
    public static ArrayList<ProdutoCarrinho> getProdutosCarrinho() {
        return produtosCarrinho;
    }
    
    public static void removerId(int id) {
        ProdutoCarrinho produtoCarrinho = getProdutoCarrinho(id);
        if (produtoCarrinho != null)
            produtosCarrinho.remove(produtoCarrinho);
    }
    
    public static int getQuantidade(int id) {
        ProdutoCarrinho produtoCarrinho = getProdutoCarrinho(id);
        if (produtoCarrinho != null)
            return produtoCarrinho.getQuantidade();
        return 0;
    }
    
    public static ProdutoCarrinho getProdutoCarrinho(int id) {
        for (ProdutoCarrinho produtoCarrinho : produtosCarrinho) {
            Produto produtoExistente = produtoCarrinho.getProduto();
            if (produtoExistente.getId() == id) {
                return produtoCarrinho;
            }
        }
        return null;
    }
    
    public static void limpar() {
        produtosCarrinho.clear();
    }
}
