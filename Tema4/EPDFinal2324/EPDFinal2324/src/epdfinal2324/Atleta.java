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
public class Atleta extends Persona implements Competidor{
    private String disciplinas;
    private Medalla[] medallas;
    private int contadorMedallas;
    
    public Atleta(String nombre, String pais, int edad, String disciplina){
	super(nombre,pais,edad);
	this.disciplinas = disciplina;
	this.medallas = new Medalla[MAXMEDALLAS];
    }

    @Override
    public String getDisciplinas() {
	return disciplinas;
    }
    
    public void añadirMedalla(Medalla medalla){
	
    }

    @Override
    public String toString() {
	return "Atleta{" + "disciplinas=" + disciplinas + ", medallas=" + medallas + ", contadorMedallas=" + contadorMedallas + '}';
    }
    

    
}
