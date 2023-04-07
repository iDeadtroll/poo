/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epd1.problema2;

/**
 *
 * @author joni-
 */
public class Circulo {

    public static final double PI = 3.14; //Constante PI

    public static void main(String[] args) {
        double radio = Float.parseFloat(args[0]);
        double diametro, area, circunferencia;
        
        diametro = 2*radio;
        area = 2*PI*(radio*radio);
        circunferencia = PI*diametro;
        
        System.out.println("Diametro: " + diametro);
        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + circunferencia);

    }
}
