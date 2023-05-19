/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

/**
 *
 * @author Deadtroll
 */
public class Principal {
    public static void main(String[] args){
        OperacionCalculadora operaciones = null;
        
        Calculadora calc = new Calculadora(operaciones);
        calc.mostrarOpcionesCalculadora();
    }
}
