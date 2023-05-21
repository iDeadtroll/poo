/*

 */
package ejemplo_interfaz_comparable;

/**
 *
 * @author Deadtroll
 */

import java.util.ArrayList;
import java.util.Collections;

public class Principal {
    public static void main(String[] args) {
        Persona p1 = new Persona("Pedro", 20);
        Persona p2 = new Persona("Juan", 30);
        Persona p3 = new Persona("Maria", 40);
        Persona p4 = new Persona("Gema", 15);

        ArrayList<Persona> lista = new ArrayList<>();
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);

        Collections.sort(lista);

        for (Persona p : lista) {
            System.out.println(p.getNombre() + " " + p.getEdad());
        }
    }
}

