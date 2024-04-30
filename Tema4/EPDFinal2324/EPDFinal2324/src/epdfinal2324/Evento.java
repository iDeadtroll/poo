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
public class Evento {
    private String nombre;
    private String fecha;
    private Atleta[] atletas;
    private int contadorAtletas;
    
    public Evento(String nombre, String fecha, int maxAtletas){
	this.nombre = nombre;
	this.fecha = fecha;
	this.atletas = new Atleta[maxAtletas];
    }
    
    public void añadirAtleta(Atleta atleta){
    
    }
    
    public String getNombre(){
	return nombre;
    }
    
    public void setFecha(String f){
	this.fecha = f;
    }
    
    @Override
    public String toString(){
	return "";
    }
}
