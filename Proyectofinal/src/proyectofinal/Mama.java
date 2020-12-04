/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

/**
 *
 * @author Ana Ruth
 */
public class Mama {
    
     public String devolverNombre3(){
        return this.nombre+" Sra.";
     }
     
    public String nombre; 
    
    public String devolverNombre(){
        return nombre;
    }
    
    public void ponerNombre(String nombre){
        this.nombre = nombre;
        
    }
    
    public String decirAlgo(int n){
        String txt = "El numero es:" + Integer.toString(n);
        System.out.println(txt);
        return txt;
    }
    
    public String decirAlgo(String mensaje){
        String txt = "Dire esto:"+mensaje;
        System.out.println(txt);
        return txt;
    }

    String devolverNombre1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
