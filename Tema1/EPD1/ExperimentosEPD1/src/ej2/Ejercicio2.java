/*
EJ2. Escriba un programa que calcule la suma de todos los números del 1 al 100.
 */
package ej2;

/**
 *
 * @author Deadtroll
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        int suma = 0;
        
        for(int i = 1 ; i <= 100 ; i++){
            suma = suma + i;
        }
        System.out.println(suma);
    }
}
