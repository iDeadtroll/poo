/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.fortnite.calculadora;

import java.util.Comparator;

/**
 *
 * @author Deadtroll
 */
public class Comparador_Array_Strings implements Comparator {
    

    @Override
    public int compare(Object t1, Object t2) {
        String c1 = (String) t1;
        String c2 = (String) t2;
        
        int cmp;
        
        if(c1.length() < c2.length()){
            cmp = -1;
        }else if(c1.length() > c2.length()){
            cmp = 1;
        }else{
            cmp = 0;
        }
        
        return cmp;
    }
}
