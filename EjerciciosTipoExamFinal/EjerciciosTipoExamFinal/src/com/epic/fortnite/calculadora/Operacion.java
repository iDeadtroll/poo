/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.fortnite.calculadora;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Deadtroll
 */
public class Operacion {

    private Double resultado;
    private List<IOperacion> operaciones;

    
    public Operacion() {
        this.operaciones = new ArrayList<>();
        this.operaciones.add(new Raiz());
        this.operaciones.add(new Suma());
        this.operaciones.add(new Resta());
        this.operaciones.add(new Multiplica());
//        this.operaciones.add(new Factorial());
        this.operaciones.add(new Divide());
        Collections.sort(operaciones, new Comparador_Array_IOperacion());
    }
    
    public Double ejecutar(Integer opc, Double val1, Double val2) {
        IOperacion oper = this.operaciones.get(opc);
        
        return oper.ejecutar(val1,val2);
    }

    public Double getResultado() {
        return resultado;
    }

    public List<String> getOperaciones() {
        List<String> listaOperaciones = new ArrayList<>() ;
        
        for (IOperacion oper: operaciones ){
            String name = oper.getNombre();
            listaOperaciones.add(name); 
        }
        return listaOperaciones;
    }
}
