/*
P12. Escriba un programa que visualice por pantalla el siguiente triangulo numérico.
1
21
321
4321
54321
654321
7654321
87654321
987654321
 */
package epd.problema12;

/**
 *
 * @author joni-
 */
public class Problema12 {

    public static void main(String[] args) {
//        for (int i = 1; i <= 10; i++) {
//            System.out.print(i + " ");
//        }
//        for (int j = 10; 1 <= j; j--) {
//            System.out.print(j);
//        }
        int k=0;
        int m=0;
        for ( k = 1; k <= 5; k++) {
   
            System.out.print(k);
            System.out.print(k);
            System.out.print(k);
            System.out.print(k);

            for ( m = 1; m <= 5; m++) {
                if (k == m)
                System.out.println(k);
//                else
//                    System.out.print(m);
                
            }
            
        }

        }
    }

