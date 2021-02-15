/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.util.ArrayList;

public class BebidaDAO {
    private static ArrayList<Bebida> bebidas =  new ArrayList<>();
    
    public static void inserir(Bebida bebida) {
        bebidas.add(bebida);
    }
    
    public static Bebida buscar(int id) throws Exception {
        for (Bebida bebida : bebidas) {
            if (bebida.getId() == id)
                return bebida;
        }
        throw new Exception("A bebida não foi encontrado");
    }
    
    public static ArrayList<Bebida> getBebidas() { return bebidas; }
}
