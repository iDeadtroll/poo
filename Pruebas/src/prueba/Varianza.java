/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.util.Scanner;

/**
 *
 * @author joni-
 */
public class Varianza {

    public static void main(String[] args) {
        //definición  de variables 
        int valor[] = new int[10];
        int sumatoria = 0;
        float media = 0;
        double varianza = 0.0;
        double desviacion = 0.0;

        Scanner entrada = new Scanner(System.in);
        //se abre el flujo entrada

        System.out.println("Ingrese el valor de 10 numeros"
                + " como muestra");
        //petición de datos y sumatoria de todos
        for (int i = 0; i < 10; i++) {

            System.out.print("Ingrese el valor " + (i + 1) + ":");
            valor[i] = entrada.nextInt();

            sumatoria = sumatoria + valor[i];

        }
        entrada.close();//se cierra el flujo entrada

        media = sumatoria / 10; //media aritmetica 

        //se hace la suma de las diferencias respecto a la media
        for (int i = 0; i < 10; i++) {
            double rango;
            rango = Math.pow(valor[i] - media, 2f);
            varianza = varianza + rango;
        }
        varianza = varianza / 10f;//suma de diferencias sobre "n"
        //teniendo ya la varinza sólo debemos sacarle raiz cuadrada 
        //tendremos la desviación estandar
        desviacion = Math.sqrt(varianza);

        //impresion de resultados
        System.out.println("Media: " + media);
        System.out.println("Varianza: " + varianza);
        System.out.println("Desvianción Estándar: " + desviacion);
    }

}
