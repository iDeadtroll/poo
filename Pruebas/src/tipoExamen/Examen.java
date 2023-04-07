/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipoExamen;

/**
 *
 * @author Deadtroll
 */
public class Examen {
    public static void main(String[] args) {
        IPunto ip1 = new Punto();
        IPunto ip2 = new Punto(2, 6);
        Punto p3 = new Punto(8,1);
        
      ip2.borrar();
      
      double x = ip1.distancia(p3);
      
      
      
      
    }
    
}
