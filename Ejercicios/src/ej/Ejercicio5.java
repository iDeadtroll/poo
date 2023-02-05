// EJ5. Escriba un programa que reciba un parámetro real que representa una temperatura en grados 
// Fahrenheit, calcule la misma temperatura en grados Celsius e imprima el resultado por pantalla.
// Utilice la siguiente fórmula: grados celcius = 5/9*(grados fahrenheit-32)
package ej;

import poo.io.IO;

public class Ejercicio5 {
    public static void main(String[] args){
        
        System.out.println("Ingrese la temperatura en grados Fahrenheit:");
        int f = (int) IO.readNumber();
// Utilizamos "String.format("%.1f",c)" para mostrar el valor de la temperatura con 2 decimales
        double c = ((double)5/9)*(f-32);
        System.out.println("La temperatura en grados celcius es: " + String.format("%.1f",c));
    }
}
