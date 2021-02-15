/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

public abstract class Produto {
    private static int idAtual = 0;
    private int id;
    private String nome;
    private float preco;
    
    public Produto(String nome, float preco) {
        this.id = idAtual++;
        this.nome = nome;
        this.preco = preco;
    }
    
    public String getInfoString() {
        return String.format("\n%5d | %-20s | R$%.2f", getId(), getNome(), getPreco());
    }
    
    public void setId(int value) { id = value; }
    public int getId() { return id; }
    public String getNome() { return nome; }
    public float getPreco() { return preco; }
   
}
