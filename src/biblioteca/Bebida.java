/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

public class Bebida extends Produto {
    private String volume;
    
    public Bebida(String nome, float preco, String volume) {
        super(nome, preco);
        this.volume = volume;
    }
    
    @Override
    public String getInfoString() {
        return String.format("\n%5d | %-20s | %-6s | R$%.2f", getId(), getNome(), getVolume(), getPreco());
    }
    
    
    public String getVolume() { return volume; }
}
