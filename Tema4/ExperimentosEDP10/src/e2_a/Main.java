/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e2_a;

import e2_b.*;

/**
 *
 * @author Deadtroll
 */
public class Main {
    public static void main(String[] args) {
        try {
            Positivo p = new Positivo(-3);
            System.out.println("Número:" + p.getNumero());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
