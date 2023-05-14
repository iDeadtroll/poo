/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e4;

/**
 *
 * @author joni-
 */
public class Suma {

    public static void main(String[] args) {

        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int suma = x + y;
        System.out.println("La suma de " + args[0] + " y " + args[1] + " es " + suma);
    }
}
