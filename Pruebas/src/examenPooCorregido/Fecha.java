/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenPooCorregido;

/**
 *
 * @author Deadtroll
 */
public class Fecha implements Comparable {
    
    private int dia;
    private int mes;
    private int anyo;
    
    public Fecha(int dia, int mes, int anyo){
        this.dia = dia;
        this.mes = mes;
        this.anyo = anyo;
    }   
    
    public int getDia(){
        return dia;
    }
    
    public void setDia(int dia){
        this.dia = dia;
    }
    
    public int getMes(){
        return mes;
    }
    
    public void setMes(int mes){
        this.mes = mes;
    }
    
    public int getAnyo(){
        return anyo;
    }
    

    @Override
    public int compareTo(Object o) {
        Fecha f = (Fecha) o;

        int cmp = anyo - f.anyo;
        if (cmp == 0) {
            cmp = mes - f.mes;
            if (cmp == 0) {
                cmp = dia - f.dia;
            }
        }
        return cmp;
    }

    
}
