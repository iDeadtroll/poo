
package prueba;
import poo.io.*;

public class P0 {

    public static void main(String[] args) {
        int numero1;
        int numero2;
        int suma;
        System.out.println("Vamos a sumar dos numeros");
        System.out.println("Introduce el primer número:");
        numero1 = (int)IO.readNumber();
        System.out.println("El número es: " + numero1);
         System.out.println("Introduce el segundo número:");
        numero2 = (int)IO.readNumber();
        System.out.println("El número es: " + numero2);
        suma = numero1 + numero2;
        System.out.println("La suma de los dos numeros es:" + suma);

    }
    
}
