/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.fortnite.calculadora;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Deadtroll
 */
public class Operacion {

    private Double resultado;
    private final List<IOperacion> operaciones;

    
    public Operacion() {
        this.operaciones = new ArrayList<>();
        this.operaciones.add(new Suma());
        this.operaciones.add(new Resta());
        this.operaciones.add(new Multiplica());
        this.operaciones.add(new Divide());
        this.operaciones.add(new Raiz());
    }
    
    public Double ejecutar(Integer opc, Double val1, Double val2) {
        IOperacion oper = this.operaciones.get(opc);
        return oper.ejecutar(val1,val2);
    }

    public Double getResultado() {
        return resultado;
    }

    public List<String> getOperaciones() {
        List<String> listasOperaciones = new ArrayList<>() ;
        
        for (IOperacion oper: operaciones ){
            String name = oper.getNombre();
            listasOperaciones.add(name); 
        }
        return listasOperaciones;
    }

    private Double suma(Double val1, Double val2) {
        return val1 + val2;
    }

    private Double resta(Double val1, Double val2) {
        return val1 - val2;
    }

    private Double multiplica(Double val1, Double val2) {
        return val1 * val2;
    }

    private Double divide(Double val1, Double val2) {
        return val1 / val2;
    }
    
    private Double raiz(Double val1, Double val2) {
        return Math.pow(val1, (double) 1 / val2);
    }

}
