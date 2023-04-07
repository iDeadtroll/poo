/*
P5. Escriba un programa que pida al usuario el día, mes (en formato numérico) y año, y le muestre por pantalla 
dicha fecha indicando el mes por su nombre (por ejemplo, si se indica día 1, mes 3 y año 2011, el programa
tiene que devolver el resultado “1 de Marzo de 2011”).
 */
package epd1.problema5;


/**
 *
 * @author joni-
 */
public class Problema5 {
    
    public static void main(String[] args){
   
        
        Fecha f = new Fecha(1,2,2002);
        
        f.imprimirFecha();
        f.setMonth(8);
        f.imprimirFecha();
    }
}
