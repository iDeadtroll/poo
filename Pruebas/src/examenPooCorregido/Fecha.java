
package examenPooCorregido;

import java.util.Calendar;

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
    
    public void setAnyo(int anyo){
        this.anyo = anyo;
    }
    
    @Override
    public String toString(){
        return dia + "/" + mes + "/" + anyo;
    }
    
    public static Fecha hoy() {
        Calendar calendario = Calendar.getInstance();
        int dia = calendario.get(Calendar.DAY_OF_MONTH);
        int mes = calendario.get(Calendar.MONTH) + 1;
        int anyo = calendario.get(Calendar.YEAR);
        return new Fecha(dia, mes, anyo);
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
