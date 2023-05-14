/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e3;

/**
 *
 * @author joni-
 */
import poo.io.*;

public class Experimento3 {

    public static void main(String[] args) {
        int digito;
        int contador = 3;
// Se pide un digito dentro de un intervalo.
        do {
            System.out.println("Introduzca un dígito (0-9):");
            digito = (int) IO.readNumber();
// Si el digito no esta dentro del intervalo, se muestra el mensaje de error y disminuye el numero de intentos.
            if ((digito < 0) || (digito > 9)) {
                System.out.println("Error, no has introducido un digito (0-9)");
                contador = contador - 1;
// Tras cada intento fallido, se muestra el mensaje con los intentos restantes, excepto si los intentos restantes son igual a 0.
                if(contador != 0)
                 System.out.println("Numero de intentos restantes: " + contador );
// Si se supera el numero maximo de intentos se muestra el mensaje y termina el programa.
                if (contador == 0) {
                    System.out.println("Has superado el numero maximo de intentos!");
                    return;
                }
            }

// Mientras el digito este fuera del intervalo, se ejecutara lo que este entre el (do-while), caso contrario, se imprimira el mensaje.
        } while ((digito < 0) || (digito > 9));

        System.out.println("¡Gracias! Has introducido el numero " + digito);
    }
//    }
}
