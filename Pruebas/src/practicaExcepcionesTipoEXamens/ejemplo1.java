/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaExcepcionesTipoEXamens;

/**
 *
 * @author Deadtroll
 */
public class ejemplo1 {
    
    public static void main(String[] args) {
        ObraArte o = new ObraArte("El parque", "Vixtoria", 2021);
        System.out.println("La autora es:" + o.getAutor());
        try{
        int x = o.antiguedad(3);
        System.out.println("Antiguedad: " + x);
        }
        catch(ArithmeticException e){
            e.printStackTrace();
        }
        System.out.println("EL PROGRAMA SIGUE...");
        
    }
    
    
}
