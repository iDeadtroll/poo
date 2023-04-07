/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epd1.problema5;

/**
 *
 * @author joni-
 */
public class Fecha {

    private int day;
    private int month;
    private int year;

    private Fecha() {
    }

    public Fecha(int d, int m, int y) {
        day = d;
        month = m;
        year = y;

    }

    public void imprimirFecha() {

        String mes = "";

        switch (month) {
            case 1:
                mes = "enero";
                break;
            case 2:
                mes = "febrero";
                break;
            case 3:
                mes = "marzo";
                break;
            case 4:
                mes = "abril";
                break;
            case 5:
                mes = "mayo";
                break;
            case 6:
                mes = "junio";
                break;
            case 7:
                mes = "julio";
                break;
            case 8:
                mes = "agosto";
                break;
            case 9:
                mes = "septiembre";
                break;
            case 10:
                mes = "octubre";
                break;
            case 11:
                mes = "novienbre";
                break;
            case 12:
                mes = "diciembre";
                break;
        }
        System.out.println("La fecha es" + day + "de" + mes + "de" + year );
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
