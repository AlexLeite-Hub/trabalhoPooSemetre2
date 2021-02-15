/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.util.ArrayList;

public class UsuarioDAO {
    private static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
    private static int idAtual = 0;
    
    private static Usuario usuarioLogado = null;
    
    public static void inserir(Usuario usuario) {
        usuarios.add(usuario);
        usuario.setId(idAtual++);
    }
    
    public static Usuario buscar(int id) throws Exception {
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id)
                return usuario;
        }
        throw new Exception("O usuário não foi encontrado");
    }
    
    public static boolean autenticar(String email, String senha) {
        for (Usuario usuario : usuarios) {
            if (usuario.getEmail().equals(email) && usuario.getSenha().equals(senha)) {
                usuarioLogado = usuario;
                return true;
            }
        }
        return false;
    }
    
    public static ArrayList<Usuario> getUsuarios() { return usuarios; }
    
    public static Usuario getUsuarioLogado() {
        return usuarioLogado;
    }
}
