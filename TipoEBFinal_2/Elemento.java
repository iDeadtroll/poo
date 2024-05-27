package TipoEBFinal_2;

public class Elemento implements Comparable{
    protected String nombre;
    protected Fecha fechaCreacion;

    public Elemento(String nombre, Fecha fechaCreacion) {
        this.nombre = nombre;
        this.fechaCreacion = Fecha.hoy();
    }

    public String getNombre() {
        return nombre;
    }

    public Fecha getFechaCreacion() {
        return fechaCreacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String toString() {
        return nombre + " " + fechaCreacion;
    }

    public boolean equals(Object obj) {

        Elemento otro = (Elemento) obj;
        if (nombre.equals(otro.nombre))
            return true;

        return false;
    }

    @Override
    public int compareTo(Object o) {
        Elemento e = (Elemento) o;
        return this.nombre.compareTo(e.nombre);
    }


}
