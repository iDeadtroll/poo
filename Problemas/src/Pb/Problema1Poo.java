
package Pb;

import Pb.calc.Calculadora;

/**
 *
 * @author mamisho
 */
public class Problema1Poo {
    
    public static void main(String[] args) {
        // Problema1.main(args);
        // Problema1.main(args);

        // Calculadora calc = new Calculadora(2, 3);
        
        Calculadora calc2 = new Calculadora(5, 10);
        calc2.getOper();
        
        try {
            calc2.operar();
        } catch(NullPointerException ex) {
            System.out.println(ex);
            if(calc2.getOper() == null) {
                calc2.setOper("+");
                calc2.operar();
            }
        }
        
        Calculadora c3 = new Calculadora(3.0, 5.0);
        c3.operar();
        
        Calculadora c4 = new Calculadora("+", "6", "2");
        c4.operar();
        
        
        
        Calculadora c5 = new Calculadora("x", "6", "20");
        c5.operar();
        c5.setOper("/");
        c5.operar();
        c5.setOper("+");
        c5.operar();
        // prueba();
    }
    
}
