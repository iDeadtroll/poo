/*
P9. Escriba un programa que pida números hasta que el usuario introduzca el cero. 
Una vez introducido el cero, el programa deberá imprimir en pantalla el valor medio
y la varianza de los números que se han ido introduciendo, excluyendo el cero.
 */
package epd1.problema9;

import java.util.ArrayList;
import java.util.List;
import poo.io.IO;

public class Problema9 {

    public static void main(String[] args) {
        int contador = 0;
        double suma = 0;
        double valor = 1;
        double sumatoria = 0;
        double media = 0;
        List<Integer> valores = recolectaDatos();
        double oper = 0;
        
        for(int i=0; i < valores.size(); i++) {
            suma += valores.get(i);
        }
        media = suma / valores.size();
        
        for(int i=0; i < valores.size(); i++) {
            oper = oper + Math.pow(valores.get(i) - media, 2);
        }

        double vari =  oper / valores.size();
        System.out.println(suma);
        System.out.println(media);
        System.out.println(vari);
        System.out.println(valores.size());
    }
    
    private static List<Integer> recolectaDatos() {
        double valor = 1;
        List<Integer> valores = new ArrayList<>();
        while (valor != 0) {
            System.out.println("Introduce un valor distinto de 0 o (0 para terminar)");
            valor = IO.readNumber();

            if (valor != 0) {
                Integer val = (int) valor;
                valores.add(val);
            }

//       if (valor!=0)
//       {
//           contador++;
//           suma = suma + valor; 
//           media = suma/contador;
//           for(int i = 0 ; i< contador ; i++){
//           
//           }
////           sumatoria = (contador - media);
//       }
//       else
//       {
//           System.out.println("El numero de valores introducidos es: " + contador);
//           System.out.println("La suma de valores introducidos es: " + suma);
//           System.out.println("El valor medio es: " + media);
//           System.out.println("Sumatoria igual a: " + sumatoria);
//       }
        }
        return valores;
    }
}
