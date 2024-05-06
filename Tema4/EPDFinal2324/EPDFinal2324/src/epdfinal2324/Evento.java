
package epdfinal2324;

public class Evento {
    private String nombre;
    private String fecha;
    private Atleta[] atletas;
    private int contadorAtletas;

    public Evento(String nombre, String fecha, int maxAtletas) {
        this.nombre = nombre;
        setFecha(fecha);
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
        if (fechaValida(f)) {
            this.fecha = f;
        } else {
            this.fecha = "01/01/1900";
        }
    }

    private boolean fechaValida(String fecha) {
        if (fecha.length() != 10)
            return false;

        String[] partes = fecha.split("/");
        if (partes.length != 3)
            return false;

        String dia = partes[0];
        String mes = partes[1];
        String año = partes[2];

        if (dia.length() != 2 || mes.length() != 2 || año.length() != 4)
            return false;

        int diaNum = Integer.parseInt(dia);
        int mesNum = Integer.parseInt(mes);

        if (diaNum < 1 || diaNum > 31)
            return false;
        if (mesNum < 1 || mesNum > 12)
            return false;

        return true;
    }

    @Override
    public String toString() {
        String cadena = "   -> EVENTO: " + this.nombre + " <" + this.fecha + ">\n";
        if (contadorAtletas != 0) {
            for (int i = 0; i < contadorAtletas; i++) {
                cadena += "   ----> " + atletas[i].nombre + " (" + atletas[i].pais + ") " + "\n";
            }
        } else {
            cadena += "        <Aún no hay atletas registrados en este evento>" + "\n";
        }
        return cadena;
    }
}
