/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

public class Usuario {

    private int id = -1;
    private String nome;
    private String email;
    private String endereco;
    private String numero;
    private String cep;
    private String senha;

    public Usuario(String nome, String email, String endereco, String numero, String cep, String senha) {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.numero = numero;
        this.cep = cep;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getNumero() {
        return numero;
    }
    
    public String getCep() {
        return cep;
    }
    
    public String getSenha() {
        return senha;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int value) {
        id = value;
    }

}
