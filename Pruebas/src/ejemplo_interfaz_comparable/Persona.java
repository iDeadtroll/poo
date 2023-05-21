/*
------Ejemplo Interfaz Comparable------

En este ejemplo, el método compareTo() compara la edad de dos objetos Persona
y devuelve un valor negativo si la edad del objeto actual es menor que la edad
del objeto especificado, cero si son iguales y un valor positivo si la edad del
objeto actual es mayor que la edad del objeto especificado.

 */
package ejemplo_interfaz_comparable;

/**
 *
 * @author Deadtroll
 */
public class Persona implements Comparable<Persona> {
    private String nombre;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Persona(String nombre, int edad) {
        super();
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public int compareTo(Persona o) {
        if (this.getEdad() > o.getEdad()) {
            return 1;
        } else if (this.getEdad() < o.getEdad()) {
            return -1;
        } else {
            return 0;
        }
    }
}
