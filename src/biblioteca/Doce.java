package biblioteca;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class Doce extends Produto {
    
    private String peso;
            
    public Doce(String nome, float preco, String peso) {
        super(nome, preco);
        this.peso = peso;
    }
    
    @Override
    public String getInfoString() {
        return String.format("\n%5d | %-20s | %-6s | R$%.2f", getId(), getNome(), getPeso(), getPreco());
    }
    
    public String getPeso() { return peso; }
}
