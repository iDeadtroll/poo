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
    private final List<String> operaciones;

    public Operacion() {
        this.operaciones = new ArrayList<>();
        this.operaciones.add("Suma");
        this.operaciones.add("Resta");
        // this.operaciones.add("Multiplica");
        this.operaciones.add("Divide");
        this.operaciones.add("Raiz");
    }
    
    public Double ejecutar(Integer opc, Double val1, Double val2) {
        Double resultado = null;
        switch(opc) {
            case 0:
                resultado = suma(val1, val2);
            break;
            case 1:
                resultado = resta(val1, val2);
            break;
            case 2:
                resultado = multiplica(val1, val2);
            break;
            case 3:
                resultado = divide(val1, val2);
                break;
            case 4:
                resultado = raiz(val1, val2);
            break;
        }
        return resultado;
    }

    public Double getResultado() {
        return resultado;
    }

    public List<String> getOperaciones() {
        return operaciones;
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
