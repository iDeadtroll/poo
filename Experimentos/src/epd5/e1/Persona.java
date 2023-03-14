/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epd5.e1;

/**
 *
 * @author joni-
 */
public class Persona implements IPersona {

    private String nombre;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void presentate() {
        System.out.print("Hola, mi nombre es " + getNombre() + " y tengo " + getEdad()
                + " años");
    }
    
}
