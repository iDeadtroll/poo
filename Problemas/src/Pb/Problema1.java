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
       
       
       // Solución con Do-While
       /*
       int opcion = 0;
       boolean firstTime = true;
       do {
            if(!firstTime) { // para ahorrarnos este boolean podemos pasarlo debajo de la lectura del teclado
                System.out.println("No has elegido un opcion válida");
            }
            System.out.println("Selecciona una de las opciones (1-4)");
            System.out.println("1. Sumar los numeros");
            System.out.println("2. Restar los numeros");
            System.out.println("3. Multiplicar los numeros");
            System.out.println("4. Dividir los numeros");
            System.out.print("Opcion: ");
            opcion = (int) IO.readNumber();
            firstTime = false;
        } while(opcion < 1 || opcion > 4);
        */
       int opcion = 0;
       while(volverSolicitarOpcion(opcion)) {
           System.out.println("Selecciona una de las opciones (1-4)");
            System.out.println("1. Sumar los numeros");
            System.out.println("2. Restar los numeros");
            System.out.println("3. Multiplicar los numeros");
            System.out.println("4. Dividir los numeros");
            System.out.print("Opcion: ");
            opcion = (int) IO.readNumber();
            
            if(opcionCorrect(opcion)) {
                System.out.println("No has elegido un opcion válida");
            }
       }
       
        //Mostramos los resultados en funcion de la opcion seleccionada
        float result = calcular(numero1, numero2, opcion);
        System.out.println("El resulttado de la operación es " + result);
        switch (opcion) {
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
        }
        
        
    }
    
    /**
     * Método que evalua si es necesario pedir nuevamente la opción
     * @param opt -> valor introducido por teclado del usuario
     * @return true: cuando hay que solicitar opcion | false: no se solicita 
     */
    private static boolean volverSolicitarOpcion(int opt) {
        return opcionCorrect(opt);
    }
    
    private static boolean opcionCorrect(int opt) {
        boolean result = false;
        if(opt < 1 || opt > 4) {
            result = true;
        }
        return result;
    }
    
    private static float calcular(int valor1, int valor2, int oper) {
        
    }
    
}
