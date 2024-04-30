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
public class Atleta extends Persona implements Competidor {
    private String disciplinas;
    private Medalla[] medallas;
    private int contadorMedallas;

    public Atleta(String nombre, String pais, int edad, String disciplina) {
        super(nombre, pais, edad);
        this.disciplinas = disciplina.toUpperCase();
        this.medallas = new Medalla[MAXMEDALLAS];
        this.contadorMedallas = 0;
    }

    @Override
    public String getDisciplinas() {
        return disciplinas;
    }

    public void añadirMedalla(Medalla medalla) {
        if (contadorMedallas < MAXMEDALLAS) {
            medallas[contadorMedallas] = medalla;
            contadorMedallas++;
        } else {
            System.out.println("No se puede añadir más medallas. El atleta ya ha alcanzado el máximo de medallas.");
        }
    }

    @Override
    public String toString() {
        String cadena = "";
        cadena = "-Atleta: " + super.toString();
        cadena += "\n  --Disciplinas: " + disciplinas;
        cadena += "\n  --Medallas: \n";
        for (int i = 0; i < this.contadorMedallas; i++) {
            cadena += medallas[i];
        }
        cadena += "\n   --*Total Medallas: ";
        return cadena;
    }

}
