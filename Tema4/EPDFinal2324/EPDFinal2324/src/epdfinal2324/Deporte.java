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
	this.nombre = nombre.toUpperCase();
	this.eventos = new Evento[maxEventos];
    }
    
    public void añadirEvento(Evento evento){
        if (contadorEventos < eventos.length){
            eventos[contadorEventos] = evento;
            contadorEventos++;
        }else{
            System.out.println("Se ha alcanzado el máximo de eventos para este deporte");
        }
    }
    
    public String getNombre(){
	return nombre;
    }
    
    public String toString(){
	return "";
    }
}
