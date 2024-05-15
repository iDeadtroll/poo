
package epdfinal2324;

public class Atleta extends Persona implements Competidor, Comparable {
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


    @Override
    public int compareTo(Object o) {
        Atleta a = (Atleta) o;
        return this.getNombre().compareTo(a.getNombre());
    }    
    

    public void añadirMedalla(Medalla medalla) throws MaxMedallasException {
        if (contadorMedallas < MAXMEDALLAS) {
            medallas[contadorMedallas] = medalla;
            contadorMedallas++;
        } else {
            throw new MaxMedallasException("No se puede añadir más medallas. El atleta ya ha alcanzado el máximo de medallas.");
        }
    }

    public void añadirVariasMedallas(Atleta atleta, Medalla[] nuevasMedallas) {
        for (Medalla medalla : nuevasMedallas) {
            try {
                atleta.añadirMedalla(medalla);
            } catch (MaxMedallasException e) {
                System.out.println(e.getMessage());
                break;
            } catch (Exception e) {
                System.out.println("Error al añadir medalla: " + e.getMessage());
            }
        }
    }

    public int totalMedallas() {
        return contadorMedallas;
    }

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
