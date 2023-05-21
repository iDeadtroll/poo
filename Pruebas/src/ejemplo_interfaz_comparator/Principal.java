/*

 */
package ejemplo_interfaz_comparator;

/**
 *
 * @author Deadtroll
 */
import java.util.ArrayList;
import java.util.Collections;

public class Principal {
    public static void main(String[] args) {
        Perro p1 = new Perro("Arturo", 5);
        Perro p2 = new Perro("Lola", 2);
        Perro p3 = new Perro("Violeta", 9);
        Perro p4 = new Perro("Frida", 9);
        Perro p5 = new Perro("Helga", 7);

        ArrayList<Perro> lista = new ArrayList<>();
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        lista.add(p5);

        Collections.sort(lista, new Perro());

        for (Perro p : lista) {
            System.out.println(p.getPerroNombre() + " : " + p.getPerroEdad());
        }
    }
}

