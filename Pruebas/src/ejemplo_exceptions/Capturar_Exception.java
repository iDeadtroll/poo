/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_exceptions;

/**
 *
 * @author Deadtroll
 */
public class Capturar_Exception {
    
    public static void main(String[] args) {
        
        try{
        int div = divide(2,0);
        }
        catch(Exception e){
            System.out.println("Se ha producido un error: " + e.getMessage());
        }
    }
   public static int divide(int x, int y){
       int d=x/y;
       
        return 0;
   }
}
