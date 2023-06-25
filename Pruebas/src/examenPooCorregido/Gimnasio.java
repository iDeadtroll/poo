
package examenPooCorregido;

import java.util.Arrays;
import java.util.Comparator;

public class Gimnasio {

    private Abonado[] abonados;
    public static int MAXABONADOS = 100;
    private int numAbonados;

    public Gimnasio() {
        /*Inicializamos Gimnasio vacio, es decir sin elementos en la tabla*/
        abonados = new Abonado[MAXABONADOS];
        numAbonados = 0;
    }

    public void anadirAbonado(String nombre, String apellidos, String dni) throws AbonadoException {
        Abonado s = new Abonado(nombre, apellidos, dni, numAbonados + 1);
        anadirAbonadoProcess(s);
    }

    // Mejor llamar desde este método al anterior
    public void anadirAbonado(Persona persona) throws AbonadoException {
        Abonado nuevo = new Abonado(persona, numAbonados + 1);
        anadirAbonadoProcess(nuevo);
    }
    
    private void anadirAbonadoProcess(Abonado nuevo) throws AbonadoException {
        for (int i = 0; i < numAbonados; i++) {
            if (abonados[i].equals(nuevo)) {
                throw new AbonadoException("Este abonado ya existe");
            }
        }
        abonados[numAbonados] = nuevo;
        numAbonados++;
    }

    public void eliminarAbonado(int numSocio, Fecha fechaBaja) {
        if (numSocio > numAbonados || numSocio < 0) {
            System.out.println("El socio número " + numSocio + " no existe.");
        } else {
            abonados[numSocio - 1].baja(fechaBaja);
        }
    }

    public void ordenarAbonados(Comparator c) {
        Arrays.sort(abonados, 0, numAbonados, c);
    }

    @Override
    public String toString() {
        String s = "* * * ABONADOS DEL GIMNASIO * * *\n";
        int i;
        for (i = 0; i < numAbonados; i++) {
            s += abonados[i] + "\n";
        }
        return s;
    }
}
