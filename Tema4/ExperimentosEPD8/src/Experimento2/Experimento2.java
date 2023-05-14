/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Experimento2;

/**
 *
 * @author Deadtroll
 */
import poo.io.*;

public class Experimento2 {

    public static void main(String[] args) {
        int tam;
        System.out.println("Introduce tamanio: ");
            tam = (int)IO.readNumber();
        double[] notas = new double[tam];
        
        double media;

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Introduce nota " + i);
            notas[i] = IO.readNumber();
        }

        media = 0.0;
        for (int i = 0; i < notas.length; i++) {
            media += notas[i];
        }
        media /= notas.length;

        System.out.println("La nota media es: " + media);
    }
}
