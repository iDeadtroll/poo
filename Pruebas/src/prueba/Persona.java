/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

/**
 *
 * @author Deadtroll
 */
public class Persona implements Cloneable {
    private String nombre, apellido;
    private int edad;
    
    public Persona(String n, String a, int e){
        nombre = n;
        apellido = a;
        edad = e;
    }
    
}
