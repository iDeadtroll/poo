/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epd3.e5;

/**
 *
 * @author joni-
 */
public class CalculadoraSimple {

  private static double memoria;
    public static void setMemoria(double n) {
        memoria = n;
    }

    public static double getMemoria() {
        return memoria;
    }

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        return a / b;
    }

    public static double potencia(double a, int b) {
        double resultado = 1;
        for (int i = 0; i < b; i++) {
            resultado = resultado * a;
        }
        return resultado;
    }
}
