
package epdfinal2324;

public class Evento {
    private String nombre;
    private String fecha;
    private Atleta[] atletas;
    private int contadorAtletas;

    public Evento(String nombre, String fecha, int maxAtletas) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.atletas = new Atleta[maxAtletas];
    }

    public void añadirAtleta(Atleta atleta) {
        if (contadorAtletas < atletas.length) {
            atletas[contadorAtletas] = atleta;
            contadorAtletas++;
        } else {
            System.out.println("Se ha alcanzado el máximo de atletas para este evento");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setFecha(String f) {
        this.fecha = f;
    }

    @Override
    public String toString() {
        String cadena = "   -> EVENTO: " + this.nombre + " <" + this.fecha + ">\n";
        if (contadorAtletas != 0){
            for (int i = 0; i < contadorAtletas; i++){
                cadena += "   ----> " + atletas[i] + "\n";
            }
        }else{
            System.out.println("        <Aún no hay atletas registrados en este evento>" + "\n");
        }
        return cadena;
    }
}
