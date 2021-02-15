/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.util.ArrayList;

public class DoceDAO {
    private static ArrayList<Doce> doces =  new ArrayList<>();
    
    public static void inserir(Doce doce) {
        doces.add(doce);
    }
    
    public static Doce buscar(int id) throws Exception {
        for (Doce doce : doces) {
            if (doce.getId() == id)
                return doce;
        }
        throw new Exception("O doce não foi encontrado");
    }
    
    public static ArrayList<Doce> getDoces() { return doces; }
}
