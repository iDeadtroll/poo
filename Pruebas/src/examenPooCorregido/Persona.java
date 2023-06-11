/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenPooCorregido;

/**
 *
 * @author Deadtroll
 */
public class Persona {
    private String nombre;
    private String apellido;
    private String dni;
    
    public Persona(String n, String a, String d){
        this.nombre = n;
        this.apellido = a;
        this.dni = d;
    }

    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    public String setDni(){
        return dni;
    }
    
    public void setDni(String dni){
        this.dni = dni;
    }

    @Override
    public String toString() {
        return apellido + ", " + nombre + " - " + dni;
    }
    
    
}
