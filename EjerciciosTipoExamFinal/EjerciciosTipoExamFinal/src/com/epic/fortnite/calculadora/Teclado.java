package com.epic.fortnite.calculadora;

import java.util.Scanner;

/**
 *
 * @author mamisho
 */
public class Teclado {

    private Scanner input;

    public Teclado() {
        this.input = new Scanner(System.in);
    }

    public Double leerValor(String mensaje) {
        try {
            System.out.print(mensaje);
            return input.nextDouble();
        } catch (Exception ex) {
            this.input = new Scanner(System.in);
            return -1D;
        }
    }
}
