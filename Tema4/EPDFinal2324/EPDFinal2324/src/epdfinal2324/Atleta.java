
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

    //TODO: hacer filtro por disciplinas

    public void añadirMedalla(Medalla medalla) {
        if (contadorMedallas < MAXMEDALLAS) {
            medallas[contadorMedallas] = medalla;
            contadorMedallas++;
        } else {
            System.out.println("No se puede añadir más medallas. El atleta ya ha alcanzado el máximo de medallas.");
        }
    }

    //TODO: probar contador de medallas
    public String totalMedallas() {
        int contador = 0;
        for (int i = 0; i < contadorMedallas; i++) {
            contador++;
        }
        String count = Integer.toString(contador);
        return count;
    }

    //TODO: probar contador de medallas por tipo
    public String totalMedallas(String t) {
        int contador = 0;
        String tipo = t.toUpperCase();
        for (int i = 0; i < contadorMedallas; i++) {
            if(tipo.equals(medallas[i].getTipoString())){
                contador++;
            }
        }
        String count = Integer.toString(contador);
        return count;
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
