/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.fortnite.calculadora_100tifica;

/**
 *
 * @author Deadtroll
 */
public interface IOperacion100tifica extends Comparable {
    public Double ejecutar( Operando operando);
    public Integer getOperandoNumbers();
    public String getNombre();
}
