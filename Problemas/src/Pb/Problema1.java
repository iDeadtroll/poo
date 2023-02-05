/*P1. Escriba un programa que pida al usuario dos números enteros. 

  Una vez obtenidos los dos números, el programa mostrará al usuario
  una serie de opciones numeradas (un menú), y esperará que
  el usuario teclee la opción deseada.

  Las opciones que ofrecera el programa son:
  1. Sumar los números.
  2. Restar los números.
  3. Multiplicar los números.
  4. Dividir los números.*/
package Pb;
import poo.io.IO;
public class Problema1 {
   
    public static void main(String[] args) {
        int numero1;
        int numero2;
        int suma;
        int resta;
        int multiplicacion;
        float division;
        //Pedimos dos numeros al usuario
        System.out.println("Introduce dos numeros");
        System.out.print("Primer número: ");
        numero1 = (int)IO.readNumber();
        System.out.print("Segundo número: ");
        numero2 = (int)IO.readNumber();
        //Mostramos las opciones disponibles del programa
       
        System.out.println("Selecciona una de las opciones (1-4)");
        System.out.println("1. Sumar los numeros");
        System.out.println("2. Restar los numeros");
        System.out.println("3. Multiplicar los numeros");
        System.out.println("4. Dividir los numeros");
        System.out.print("Opcion: ");
        //Mostramos los resultados en funcion de la opcion seleccionada
        int opcion = (int) IO.readNumber();
        switch(opcion){
            case 1:
                suma = numero1 + numero2;
                System.out.println("La suma de los dos numeros es: " + suma);
            break;
            case 2:
                resta = numero1 - numero2;
                System.out.println("La resta de los dos numeros es: " + resta );
            break;
            case 3:
                multiplicacion = numero1 * numero2;
                System.out.println("La multiplicacion de los dos numeros es: " + multiplicacion );
            break;
            case 4:
                division = ((float)numero1 / numero2);
                System.out.println("La division de los dos numeros es: " + division );
            break;
            default:
                System.out.println("No has elegido un opcion valida");
                
        }
        
        
    }
    
}
