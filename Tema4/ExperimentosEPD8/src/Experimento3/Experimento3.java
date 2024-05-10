
package Experimento3;

/**
 *
 * @author Deadtroll
 */
import poo.io.*;

public class Experimento3 {

    public static void main(String args[]) {
        int filas, columnas;
        int[][] m;

        System.out.println("Introduzca el número de filas: ");
        filas = (int) IO.readNumber();

        System.out.println("Introduzca el número de columnas: ");
        columnas = (int) IO.readNumber();

        m = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas ; j++) {
                System.out.println("Elemento (" + i + "," + j + ")");
                m[i][j] = (int) IO.readNumber();
            }
        }

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.println("Elemento (" + i + "," + j + "): " + m[i][j]);
            }
        }
    }
}
