/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Experimento4;

/**
 *
 * @author Deadtroll
 */
public class Numero implements Comparable {

    private int numero;

    public Numero() {
        this.numero = (int) Math.round(Math.random() * 100);
    }

    public int getNumero() {
        return numero;
    }

    public int compareTo(Object o) {
        Numero n = (Numero) o;
        if (this.numero == n.numero) {
            return 0;
        } else if (this.numero < n.numero) {
            return -1;
        } else {
            return 1;
        }
    }

    public String toString() {
        return String.valueOf(numero);
    }
}
