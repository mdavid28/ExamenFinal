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
public class Papa {
    
     public String devolverNombre1(){
        return this.nombre+" Sr.";
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
    
}
