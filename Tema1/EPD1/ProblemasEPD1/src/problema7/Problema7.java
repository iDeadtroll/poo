/*
P7. Escriba un programa que, dado un número entero por parte del 
usuario, calcule el factorial del mismo y lo muestre por pantalla.
 */
package epd1.problema7;

import poo.io.IO;

/**
 *
 * @author joni-
 */
public class Problema7 {
    
    public static void main(String[] args){
    
        int num;
        int factorial = 1;
        
        System.out.println("Ingrese un numero");
        num = (int)IO.readNumber();
        
        for (int i = 1; i<=num ; i++ ){
            factorial = i*factorial;   
        }
        System.out.println(factorial);
    }
}
