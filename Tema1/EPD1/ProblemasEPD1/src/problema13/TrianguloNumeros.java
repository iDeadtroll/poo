/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epd.problema13;

/**
 *
 * @author joni-
 */
public class TrianguloNumeros {

    public int opciones;

    private char c = '*';

    public TrianguloNumeros() {
    }

    public TrianguloNumeros(int a) {
        opciones = a;
        switch (opciones) {
            case 1:
                System.out.println("Triangulo original");
                trianguloOpcion1();
                break;
            case 2:
                System.out.println("Triangulo cambiando numeros pares por *");
                trianguloOpcion1(true);
                break;
            case 3:
                System.out.println("Triangulo cambiando numeros impares por *");
                trianguloOpcion1(false);

                break;
        }

    }

    public void trianguloOpcion1() {
        trianguloOpcion1(false, true);
    }

    public void trianguloOpcion1(boolean hiddenPar) {
        trianguloOpcion1(true, hiddenPar);
    }

    public void trianguloOpcion1(boolean filter, boolean hiddenPar) {
        for (int k = 1; k < 10; k++) {
            System.out.println("");

            for (int m = k; m >= 1; m--) {
                if (!filter) {
                    System.out.print(m + " ");
                } else {

                    if (esPar(m) && hiddenPar) {

                        System.out.print(c + " ");
                    } else if (!esPar(m) && !hiddenPar) {
                        System.out.print(c + " ");
                    } else {
                        System.out.print(m + " ");
                    }
                }

            }
        }
    }

//    public void trianguloOpcion2() {
//        for (int k = 1; k < 10; k++) {
//            System.out.println("");
//
//            for (int m = k; m >= 1; m--) {
//
//                if (m % 2 == 0) {
//
//                    System.out.print(c + " ");
//                } else {
//                    System.out.print(m + " ");
//                }
//
//            }
//        }
//    }
//
//    public void trianguloOpcion3() {
//        for (int k = 1; k < 10; k++) {
//            System.out.println("");
//
//            for (int m = k; m >= 1; m--) {
//                if (m % 2 != 0) {
//
//                    System.out.print(c + " ");
//
//                } else {
//                    System.out.print(m + " ");
//                }
//            }
//        }
//    }
    private boolean esPar(int val) {
        return val % 2 == 0;
    } 
}
