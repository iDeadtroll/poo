/*
P8. Escriba un programa que indique si el año introducido por un usuario es o no bisiesto. 
Los años bisiestos son múltiplos de cuatro, sin embargo, los múltiplos de 100 sólo son bisiestos 
cuando a la vez son múltiplos de 400 (por ejemplo 1800 no es bisiesto, mientras
que 2000 si lo es).
 */
package epd1.problema8;

import poo.io.IO;

public class Problema8 {

    int year = 0;

    public void entradaYear() {
        System.out.print("Ingrese un año: ");
        year = (int) IO.readNumber();
    }

    public void evaluarYear() {
        if ((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println("el año " + year + " es bisiesto");
        } else {
            System.out.println("el año" + year + " no bisiesto");
        }
    }

    public static void main(String[] args) {
        Problema8 bisiesto = new Problema8();
        bisiesto.entradaYear();
        bisiesto.evaluarYear();
    }
}
     

