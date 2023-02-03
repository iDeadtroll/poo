/*Escriba un programa que calcule la suma de todos los números del 1 al 100 */
package ej;

public class Ejercicio2 {

    //int contador;
    public static void main(String[] args) {
        int suma = 0;

        for (int contador = 1; contador <= 100; contador++) {
            suma = suma + contador;
            System.out.println(suma);
        }
    }

}
