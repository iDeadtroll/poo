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
public class Medalla {
    private int tipo;
    private String disciplina;
    public static final int ORO=1;
    public static final int PLATA=2;
    public static final int BRONCE=3;

    public Medalla(int tipo, String disciplina) {
	this.tipo = tipo;
	this.disciplina = disciplina;
    }
    
    public String getTipoString(){
	return null;
    }
    
    @Override
    public String toString(){
	return null;
    }
}
