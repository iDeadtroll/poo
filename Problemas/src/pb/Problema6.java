/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb;

import poo.io.IO;

/**
 *
 * @author joni-
 */
public class Problema6 {
    public static void main(String[] args) {

        int clave = 9;
        boolean correcto = false;

        while (!correcto) {
            System.out.println("Introduzca la clave");
            int valor = (int) IO.readNumber();

            if (valor == clave) {
                System.out.println("La clave es correcta");
                correcto = true;
            }
            else
                System.out.println("La clave es incorrecta");

        }
    }

}
