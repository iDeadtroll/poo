/*

 */
package com.epic.fortnite.calculadora;

import java.util.Comparator;
import java.util.List;
public class Comparador_Array_IOperacion implements Comparator {
    
    
    public int compare(Object t1, Object t2) {
        IOperacion c1 = (IOperacion) t1;
        IOperacion c2 = (IOperacion) t2;
        
        int cmp;
        
        if (c1.getCaracter() < c2.getCaracter()){
            cmp = -1;
        }else if(c1.getCaracter() > c2.getCaracter()){
            cmp = 1;
        }
        else{
            cmp = c1.getNombre().compareToIgnoreCase(c2.getNombre());
        }
        return cmp;
        
    }
}
