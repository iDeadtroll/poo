/*
Interfaz que implementan las clases que conforman el vector operaciones.
 */
package com.epic.fortnite.calculadora;


public interface IOperacion extends Comparable {
    public String getNombre();
    public Double ejecutar(double val1, double val2);
    public Integer getCaracter();
    
    /*@Override
    public default int compareTo(Object o) {
    IOperacion oper = (IOperacion) o;
        String nombreExterno = oper.getNombre();
        if(this.getNombre().length() > nombreExterno.length()) {
            return 1;
        }
        
        if(this.getNombre().length() == nombreExterno.length()) {
            return 0;
        }
        
        return -1;
    }
*/
}
