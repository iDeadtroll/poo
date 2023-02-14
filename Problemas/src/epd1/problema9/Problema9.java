/*
P9. Escriba un programa que pida números hasta que el usuario introduzca el cero. 
Una vez introducido el cero, el programa deberá imprimir en pantalla el valor medio
y la varianza de los números que se han ido introduciendo, excluyendo el cero.
 */
package epd1.problema9;

import poo.io.IO;


public class Problema9 {
   
   
   public static void main(String[] args)
   {
   int contador = 0;
   double suma = 0;
   double valor = 1;
   double sumatoria = 0;
   double media = 0;
   while(valor!=0)
   {
       System.out.println("Introduce un valor distinto de 0 o (0 para terminar)");
       valor = (int)IO.readNumber();
       
       if (valor!=0)
       {
           contador++;
           suma = suma + valor; 
//           sumatoria = valor - (suma/contador);
           media = suma/contador;
           sumatoria = sumatoria-(valor - media);
       }
       else
       {
           System.out.println("El numero de valores introducidos es: " + contador);
           System.out.println("La suma de valores introducidos es: " + suma);
           System.out.println("El valor medio es: " + media);
           System.out.println("Sumatoria igual a: " + sumatoria);
       }
           
   }
   }
}
