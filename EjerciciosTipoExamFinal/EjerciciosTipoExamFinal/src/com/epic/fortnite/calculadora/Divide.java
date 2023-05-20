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
public class Divide implements IOperacion{
    private String name;
    
    @Override
    public String getName(){
        this.name = getClass().toString();
        return name;
    }
    @Override 
    public Double ejecutar(double val1, double val2){
        return val1 / val2;
    }
}
