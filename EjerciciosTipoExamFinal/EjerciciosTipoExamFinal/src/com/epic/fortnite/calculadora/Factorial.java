/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.fortnite.calculadora;

import com.epic.fortnite.calculadora_100tifica.IOperacion100tifica;
import com.epic.fortnite.calculadora_100tifica.Operando;
import java.util.Objects;

/**
 *
 * @author mamisho
 */
public class Factorial implements IOperacion100tifica {
    
    private String name;
    
    @Override
    public String getNombre() {
        return getClass().getSimpleName();
    }

    @Override
    public Double ejecutar(Operando operando) {
        return 1D;
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
        final Factorial other = (Factorial) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.name);
        return hash;
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
    
    public Integer getCaracter(){
        char caracter = 'a';
        Integer contador = 0;
        for ( int i = 0 ; i < this.getNombre().length() ; i++  ){
            if (this.getNombre().charAt(i) == caracter){
                contador++;
            }
                
        }
        return contador;
    }

    @Override
    public Integer getOperandoNumbers() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
