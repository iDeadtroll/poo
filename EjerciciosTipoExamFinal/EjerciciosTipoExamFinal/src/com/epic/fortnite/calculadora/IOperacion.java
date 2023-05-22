/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.fortnite.calculadora;

/**
 *
 * @author Deadtroll
 */
public interface IOperacion extends Comparable {
    public String getNombre();
    public Double ejecutar(double val1, double val2);
    
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
