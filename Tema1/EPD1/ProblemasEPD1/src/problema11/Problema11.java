/*
P11. Escribir un programa que pida al usuario una contraseña fija establecida como una constante en el programa. 
El programa dará 3 oportunidades al usuario para averiguarla. Si el usuario averigua la contraseña se imprimirá
en pantalla el mensaje “Acceso permitido” y terminará el programa. Si el usuario consume las tres oportunidades
sin acertar la contraseña, se imprimirá en pantalla “Acceso denegado” y terminará el programa.
 */
package epd1.problema11;

import poo.io.IO;

/**
 *
 * @author joni-
 */
public class Problema11 {
    public static final int CLAVE = 1234;
    public static void main(String[] args) {
        
        int intentos = 0;
        boolean correcto = false ;
        
        while (intentos < 3 && !correcto) {
            System.out.println("Introduzca la clave");
            int valor = (int)IO.readNumber();
            if (valor == CLAVE ) {
                correcto = true;
            }
            intentos++;
           
            if (!correcto){
                System.out.println("Clave incorrecta");
                
            }
            
        }
        if(correcto)
            System.out.println("Acceso permitido");
        else
            System.out.println("Acceso denegado");
        
    }
}
