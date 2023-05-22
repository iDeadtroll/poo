/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.fortnite.calculadora;

import java.util.Objects;

/**
 *
 * @author Deadtroll
 */
public class Multiplica implements IOperacion {
    private String name;
    
    @Override
    public String getNombre(){
        this.name = getClass().getSimpleName();
        return name;
    }
    
    @Override
    public Double ejecutar(double val1, double val2){
        return val1 * val2;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Multiplica other = (Multiplica) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
    @Override
    public int compareTo(Object o) {
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
    

    /*@Override
    public int compareTo(IOperacion o) {
        String nombreExterno = o.getNombre();
        if(this.getNombre().length() > nombreExterno.length()) {
            return 1;
        }
        
        if(this.getNombre().length() == nombreExterno.length()) {
            return 0;
        }
        
        return -1;
    }*/
}
