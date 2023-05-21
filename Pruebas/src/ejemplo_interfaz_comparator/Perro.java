/*
------Ejemplo Interfaz Comparator----

En este ejemplo, el método compare() compara la edad de dos objetos Perro y 
devuelve un valor negativo si la edad del primer objeto es menor que la edad
del segundo objeto, cero si son iguales y un valor positivo si la edad del
primer objeto es mayor que la edad del segundo objeto.

 */
package ejemplo_interfaz_comparator;

import java.util.Comparator;

/**
 *
 * @author Deadtroll
 */
class Perro implements Comparator<Perro> {
    private String nombre;
    private int edad;

    Perro() {}

    Perro(String n, int e) {
        nombre = n;
        edad = e;
    }

    public String getPerroNombre() {
        return nombre;
    }

    public int getPerroEdad() {
        return edad;
    }

    @Override
    public int compare(Perro p, Perro p1) {
        return p.edad - p1.edad;
    }
}