/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.fortnite.calculadora;

/**
 *
 * @author Deadtroll
 */
public class Multiplica implements IOperacion{
    private String name;
    public Multiplica(String name){
        name = this.name;
    }
    
    @Override
    public String getName(){
        return name;
    }
    
    @Override
    public Double ejecutar(double val1, double val2){
        Double Multiplica = val1 * val2;
        return Multiplica;
    }
}
