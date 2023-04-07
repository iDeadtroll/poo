/*
P13. Modifique el anterior programa para que ofrezca un menú que le dé al usuario tres opciones:
1. Mostrar el triángulo original.
2. Eliminar del triángulo los números pares, sustituyendo éstos por asteriscos.
3. Eliminar del triángulo los números impares, sustituyendo éstos por asteriscos.
 */
package epd.problema13;

import poo.io.IO;

/**
 *
 * @author joni-
 */
public class Problema13 {
    public static void main(String[] args) {
        
       

        System.out.println("Elija la opcion (1-3):");
        
        int a = (int)IO.readNumber();
        TrianguloNumeros t = new TrianguloNumeros(a);
        
    }
    

        
    
}
