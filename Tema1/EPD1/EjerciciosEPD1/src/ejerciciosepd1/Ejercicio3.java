/*
 * EJ3. 
 * Escriba un programa que, dado un número entero por parte del usuario, nos devuelva la cifra correspondiente a las unidades
 * de dicho número. 
 * 
 * Por ejemplo, si el usuario introduce el número 1532, el programa nos debe de decir que la cifra de unidades de ese
 * número es 2.

 * Para ello, dado un número se le restará 10 hasta que el resultado sea menor que diez, correspondiendo dicho resultado
 * a la cifra de las unidades.

   1532
 */
package ej;

import poo.io.IO;

/**
 *
 * @author mamisho
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        int valor = 0;
        do {
            System.out.println("Ingrese un número mayor o igual a cero");
            valor = (int) IO.readNumber();
        } while(valor <= -1);
        
        if(valor <= 9) {
            System.out.println("La unidad es: " + valor);
        } else {
            // int result = 0;
            // USANDO FOR
            int cont = 0;
            System.out.println("cont: " + cont);
            for(cont = valor; cont > 9; cont = cont-10 ) {
                // System.out.println("valor: " + valor);
                // System.out.println("cont: " + cont);
                // result = cont;
                // result -=10;
            }
            System.out.println("La unidad del número " + valor + " USANDO FOR es: " + cont);
            
            
            int valortCopy = valor;
            // USANDO DO-WHILE
            do {
                valor = valor - 10;
            } while(valor > 9);
            System.out.println("La unidad es de valor USANDO DO-WHILE es: " + valor);
            
            // USANDO WHILE
            while(valortCopy > 9) {
                valortCopy -= 10;
            }
            
            System.out.println("ValorCopia USANDO WHILE es: " + valortCopy);
        }
    }
}
