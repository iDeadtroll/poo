/* Ejercicio 1 de la EPD1 de POO */
package ej;

public class Ejercicio1 {

    public static void main(String[] args) {
        int var1, var2 = 5;
        char c1 = 'R', c2 = 'O', c3 = 'M', c4 = 'A';
        var1 = var2 + 1;
        System.out.println("El valor de var1 es " + var1);
        System.out.println("El valor de var2 es " + var2);
        System.out.println("Palabra 1: " + c1 + c2 + c3 + c4);
        System.out.println("Palabra 2: " + c4 + c3 + c2 + c1 );
        System.out.println("Palabra 3: " + c3 + c2 + c1 + c4);
        System.out.println("Palabra 4: " + c1 + c4 + c3 + c2);
    }
}
