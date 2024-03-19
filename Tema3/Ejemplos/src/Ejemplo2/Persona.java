package Ejemplo2;

public class Persona implements Cloneable {
    private String nombre, apellidos;
    private int edad;

    public Persona(String n, String a, int e) {

        nombre = n;
        apellidos = a;
        edad = e;

    }

    public void setNombre(String n) {
        nombre = n;
    }

    public void setApellidos(String a) {
        apellidos = a;
    }

    public void setEdad(int e) {
        edad = e;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    // Redefinición de los métodos de Object

    public String toString() {
        return nombre + apellidos + (" + edad + ");
    }

    public boolean equals(Object o) {
        Persona p = (Persona) o;
        return (nombre.equals(p.nombre) &&
                apellidos.equals(p.apellidos) &&
                edad == p.edad);
    }

    public Object clone()
            throws CloneNotSupportedException {
        return super.clone();

    }
}