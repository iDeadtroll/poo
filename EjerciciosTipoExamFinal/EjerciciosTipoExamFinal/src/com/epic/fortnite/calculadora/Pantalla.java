package com.epic.fortnite.calculadora;

import java.util.List;

/**
 *
 * @author mamisho
 */
public class Pantalla {
    private List<String> operaciones;
    
    private Pantalla() {}
    
    public Pantalla(List<String> operaciones) {
        this.operaciones = operaciones;
    }
    
    public void mostrarResultado(String value) {
        System.out.println(value);
    }
    
    public void mostrarOperaciones(Integer salir) {
        System.out.println("Seleccione una opcion:");
        for (int i=0; i < operaciones.size(); i++) {
            System.out.println( i + " " + this.operaciones.get(i));
        }
        System.out.println(salir + " " + "Salir");
    }
}
