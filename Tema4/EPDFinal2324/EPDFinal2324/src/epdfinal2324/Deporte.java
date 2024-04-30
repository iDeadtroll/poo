/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epdfinal2324;

/**
 *
 * @author joni-
 */
public class Deporte {
    private String nombre;
    private Evento[] eventos;
    private int contadorEventos;
    
    public Deporte(String nombre, int maxEventos){
	this.nombre = nombre;
	this.eventos = new Evento[maxEventos];
    }
    
    public void añadirEvento(Evento evento){
	
    }
    
    public String getNombre(){
	return nombre;
    }
    
    public String toString(){
	return "";
    }
}
