/*P1. Escriba un programa que pida al usuario dos números enteros. 

  Una vez obtenidos los dos números, el programa mostrará al usuario
  una serie de opciones numeradas (un menú), y esperará que
  el usuario teclee la opción deseada.

  Las opciones que ofrecera el programa son:
  1. Sumar los números.
  2. Restar los números.
  3. Multiplicar los números.
  4. Dividir los números.*/
package epd1.problema1;

import poo.io.IO;

public class Problema1 {

    public static void main(String[] args) {
        int numero1;
        int numero2;
        int opcion = 0;

        //Pedimos dos numeros al usuario
        System.out.println("Introduce dos numeros");
        System.out.print("Primer número: ");
        numero1 = (int) IO.readNumber();
        System.out.print("Segundo número: ");
        numero2 = (int) IO.readNumber();
        
        opcion = mostrarMenu(opcion);
        

        //Mostramos los resultados en funcion de la opcion seleccionada
        float result = calcular(numero1, numero2, opcion);
        String mensaje = componerMensajeResultado(result, opcion);
        System.out.println(mensaje);

    }

    /**
     * Método que evalua si es necesario pedir nuevamente la opción
     *
     * @param opt -> valor introducido por teclado del usuario
     * @return true: cuando hay que solicitar opcion | false: no se solicita
     */
    private static boolean solicitarOpcion(int opt) {
        return !opcionCorrect(opt);
    }
    
    private static int mostrarMenu(int opcionUsuario) {
        while (solicitarOpcion(opcionUsuario)) {
            System.out.println("Selecciona una de las opciones (1-4)");
            System.out.println("1. Sumar los numeros");
            System.out.println("2. Restar los numeros");
            System.out.println("3. Multiplicar los numeros");
            System.out.println("4. Dividir los numeros");
            System.out.print("Opcion: ");
            opcionUsuario = (int) IO.readNumber();

            if (!opcionCorrect(opcionUsuario)) {
                System.out.println("");
                System.out.println("--------------------------------");
                System.out.println("No has elegido un opcion válida");
            }
        }
        return opcionUsuario;
    }

    private static boolean opcionCorrect(int opt) {
        boolean result = true;
        if (opt < 1 || opt > 4) {
            result = false;
        }
        return result;
    }

    private static float calcular(int valor1, int valor2, int oper) {
        float result = 0;
        switch (oper) {
            case 1:
                result = valor1 + valor2;
                break;
            case 2:
                result = valor1 - valor2;
                break;
            case 3:
                result = valor1 * valor2;
                break;
            case 4:
                result = (float) valor1 / valor2;
                break;
        }
        return result;

    }

    private static String componerMensajeResultado(float valor, int oper) {
        String mensajeComun = "de los dos números es: ";
        String result = "";
        switch (oper) {
            case 1:
                result = "La suma " + mensajeComun + (int) valor;
                break;
            case 2:
                result = "La resta " + mensajeComun + (int) valor;
                break;
            case 3:
                result = "La multiplicacion " + mensajeComun + (int) valor;
                break;
            case 4:
                result = "La division " + mensajeComun + valor;
                break;
        }
        return result;
    }
}
