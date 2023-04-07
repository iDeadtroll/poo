/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edp1.problema14;

import poo.io.IO;

/**
 *
 * @author joni-
 */
public class Primo {
    
    public static void main (String[] args){
        int numA = 0;
        
        System.out.println("Introduca un numero: ");
        int numB = (int)IO.readNumber();
        
            for(int i = 1; i <= numB; i++)
                if( numB%i == 0){
                    numA++;
                }
                if (numA == 2 )
                    System.out.println(numB + " :es primo");
                else
                    System.out.println(numB + " : no es primo");
    }
    
}
