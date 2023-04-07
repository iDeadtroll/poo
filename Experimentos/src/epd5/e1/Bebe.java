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
public class Bebe extends Persona implements IBebe {

    private double edad;

    public void setEdad(double edad) {
        this.edad = edad;
//      Llamamos al metodo setEdad de la clase padre
        super.setEdad((int) edad);
    }

    public void presentate() {
        super.presentate();
        System.out.print(" y " + ((this.edad - getEdad()) * 12) + " meses");
    }
}
