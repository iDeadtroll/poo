
package epdfinal2324;

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
        cadena = "- ATLETA: " + super.toString();
        cadena += "\n  -- Disciplinas: " + disciplinas;
        cadena += "\n  -- Medallas: \n";
        int oro = 0, plata = 0, bronce = 0;
        for (int i = 0; i < this.contadorMedallas; i++) {
            cadena += "    ---" + medallas[i] + "\n";

            switch (medallas[i].getTipoString()) {
                case "ORO":
                    oro += 1;
                    break;
                case "PLATA":
                    plata += 1;
                    break;
                case "BRONCE":
                    bronce += 1;
                    break;
            }

        }
        cadena += "  --*Total Medallas: " + oro + " oro, " + plata + " plata, " + bronce + " bronce";

        return cadena;
    }

}
