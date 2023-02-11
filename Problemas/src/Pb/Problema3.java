package pb;

import poo.io.IO;

/**
 * Escriba un programa similar al anterior, pero que calcule el área y el
 * perímetro de un cuadrado (conociendo el lado) y un triángulo recto
 * (conociendo su base y altura).
 */
public class Problema3 {

    public static void main(String[] args) {
        int lado = 0;
        int base = 0;
        int altura = 0;
        System.out.println("Ingrese un valor para el lado del cuadrado");
        lado = (int) IO.readNumber();
        int cuadradoP = lado + lado + lado + lado;
        System.out.println("Perimetro cuadrad0 igual a: " + cuadradoP);
        int cuadradoA = lado * lado;
        System.out.println("Area del cuadrado igual a: " + cuadradoA);

        System.out.println("Ingrese un valor para la base:");
        base = (int) IO.readNumber();
        System.out.println("Ingrese un valor para altura:");
        altura = (int) IO.readNumber();
        double aCuadrado = Math.pow(base, 2);
        double bCuadrado = Math.pow(altura, 2);
        double h = Math.sqrt(aCuadrado + bCuadrado);
        double trianguloP = base + altura + h;
        System.out.println("Perimetro del triangulo igual a: " + trianguloP);
        double trianguloA = ((double) base * altura) / 2;
        System.out.println("Area de triangulo igual a : " + trianguloA);

    }

}
