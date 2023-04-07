/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioPuntoPixel;

import tipoExamen.Pixel;

/**
 *
 * @author Deadtroll
 */
public class Principal {
    public static void main(String[] args) {
        Punto pt1 = new Punto();
        Punto pt2 = new Punto(2,3);
        Pixel px1 = new Pixel();
        Punto pt3 = new Punto();
        IPixel ip1 = (IPixel) new Pixel();
//        pt3 = 
        
        System.out.println("Punto: x="+pt1.getX()+" - y="+pt1.getY());
       
        pt1.setX(5);
        System.out.println("Punto: x="+pt1.getX()+" - y="+pt1.getY());
        System.out.println("Punto: x="+pt2.getX()+" - y="+pt2.getY());
        System.out.println("Punto pt1:" + pt1);
        System.out.println("");
        System.out.println(ip1);
        
        if(pt1.equals(pt2)){
            System.out.println(pt1 + " es IGUAL a" + pt2);
        }
        else{
            System.out.println(pt1 + " es DISTINTO a" + pt2);
        }
        
        pt1.mover(pt2);
        
        System.out.println("Punto pt1:" + pt1);
        
        if(pt1.equals(pt2)){
            System.out.println(pt1 + " es IGUAL a" + pt2);
        }
        else{
            System.out.println(pt1 + " es DISTINTO a" + pt2);
        }
        
    }
}
