/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epd1.problema4;

/**
 *
 * @author joni-
 */
public class Termoestato {
    private int temperaturaActual;
    private int temperaturaDeseada;
    
    private Termoestato(){
    }
    
    public Termoestato(int a, int b){
        temperaturaActual = a;
        temperaturaDeseada = b; 
        comprobarTemperatura();
    }

    public int getTemperaturaActual() {
        return temperaturaActual;
    }

    public void setTemperaturaActual(int temperaturaActual) {
        this.temperaturaActual = temperaturaActual;
    }

    public int getTemperaturaDeseada() {
        return temperaturaDeseada;
    }

    public void setTemperaturaDeseada(int temperaturaDeseada) {
        this.temperaturaDeseada = temperaturaDeseada;
    }
    public int aumentarTemperatura(){
        temperaturaActual = temperaturaActual + 1;
        comprobarTemperatura();
        return temperaturaActual;
    }
    public int bajarTemperatura(){
        temperaturaActual = temperaturaActual - 1;
        comprobarTemperatura();
        return temperaturaActual;
    }
    private void comprobarTemperatura(){
        if (temperaturaActual<temperaturaDeseada)
            System.out.println("Desea activar la caleccion?");
        else if (temperaturaActual>temperaturaDeseada)
            System.out.println("Desea activar el aire acondicionado?");
        else
            System.out.println("La temperatura deseada es igual a la actual");
    }
    
}
