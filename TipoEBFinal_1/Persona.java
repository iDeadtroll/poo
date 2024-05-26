public class Persona {
    private String nombre;
    private String apellido;
    private String dni;

    public Persona(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public String toString() {
        return apellido + ", " + nombre + " - " + dni;
    }

    public boolean equals(Object obj) {
        Persona p = (Persona) obj;
        if (this.dni.equals(p.dni)) {
            return true;
        } else {
            return false;
        }
    }
}