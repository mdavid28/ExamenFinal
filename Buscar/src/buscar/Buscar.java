/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscar;

import java.util.ArrayList;

/**
 *
 * @author Ana Ruth
 */
public class Buscar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList personas = new ArrayList();
        personas.add("Magdiel");
        personas.add("Lucas");
        personas.add("David");
        
        BuscarPersona obj = new BuscarPersona(personas);
        obj.setVisible(true);
    }
    
}
