/*
EJ4.

Escriba un programa que permita al usuario jugar a adivinar un número del 1 al 100. El programa generará un número aleatorio,

y pedirá al usuario que lo adivine. Si el usuario adivina dicho número se le felicitará y terminará el programa. En caso contrario, se le

indicará al usuario si el número que ha de adivinar es mayor o menor que el número que el usuario ha indicado, y se le volverá a dar

de nuevo la oportunidad de que lo adivine.

n = new java.util.Random().nextInt(100)+1;
 */
package ej;
import java.util.Random;
import poo.io.IO;

/**
 *
 * @author mamisho
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        
        // Implementación para cuando tiene oportunidades hasta acertar (cambiar a 100)
        int numRamdom = new Random().nextInt(10) + 1;
        
        System.out.println("Adivina un número del 1 al 10");
        int valor = (int) IO.readNumber();
        
        while(valor != numRamdom) {
            if(numRamdom > valor) {
                System.out.println("Has fallado, el número a adivinar es mayor");
            } else {
                System.out.println("Has fallado, el número a adivinar es menor");
            }
            System.out.println("Tines otra oportunidad");
            valor = (int) IO.readNumber();
        }
        
        System.out.println("Felicitaciones, has adivinado");
        
        
//         Implmentación con dos oportunidades
        
//        int numRamdom = new Random().nextInt(10) + 1;
//        
//        System.out.println("Adivina un número del 1 al 10");
//        int valor = (int) IO.readNumber();
//        
//        if(valor == numRamdom) {
//            System.out.println("Felicitaciones, has adivinado");
//        } else {
//        
//            if(numRamdom > valor) {
//                System.out.println("Has fallado, el número a adivinar es mayor");
//            } else {
//                System.out.println("Has fallado, el número a adivinar es menor");
//            }
//            
//            System.out.println("Tines otra oportunidad");
//            valor = (int) IO.readNumber();
//            
//            if(valor == numRamdom) {
//                System.out.println("Felicitaciones, has adivinado");
//            } else {
//                System.out.println("Has perdido");
//            }
//        }

    }
}
