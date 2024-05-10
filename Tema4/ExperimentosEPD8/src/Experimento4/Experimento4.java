package Experimento4;

import java.util.Arrays;

public class Experimento4 {

    public static void main(String[] args) {
        Numero[] v = new Numero[10];
        for (int i = 0; i < v.length; i++) {
            v[i] = new Numero();
        }
        System.out.println("Antes de ordenar: ");

        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i]);
            if (i != v.length - 1) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }
        
        Arrays.sort(v);

        System.out.println("Después de ordenar: ");
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i]);
            if (i != v.length - 1) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }
    }
}
