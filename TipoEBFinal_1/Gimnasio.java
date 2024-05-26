import java.util.Arrays;

public class Gimnasio {
    private Abonado[] abonados;
    private int numabonados;
    public static final int MAXABONADOS = 100;

    public Gimnasio () {
        this.abonados = new Abonado[MAXABONADOS];
        this.numabonados = 0;
    }

    public void añadirAbonado(String nombre, String apellidos, String dni) throws AbonadoException {
        Abonado a = new Abonado(nombre, apellidos, dni, numabonados + 1);
        if (numabonados < MAXABONADOS) {
            boolean encontrado = false;
            for (int i = 0; i < numabonados && !encontrado; i++) {
                if (abonados[i].equals(a)) {
                    encontrado = true;
                }
            }
            if (encontrado) {
                throw new AbonadoException("Ya existe un abonado con ese DNI");
            } else {
                abonados[numabonados] = a;
                numabonados++;
            }
        } else {
            System.out.println("No se pueden dar de alta más abonados");
        }
    }

    public void añadirAbonado(Persona p) throws AbonadoException{
        this.añadirAbonado(p.getNombre(),p.getApellido(), p.getDni());
    }

    public void eliminarAbonado(int numSocio, Fecha fecha) {
        if (numSocio > 0 && numSocio <= numabonados) {
            abonados[numSocio - 1].baja(fecha);
        } else {
            System.out.println("El socio " + numSocio + " no existe");
        }
    }

    public void ordenarAbonados(ComparadorAntiguedadAbonado c) {
        Arrays.sort(abonados, 0, numabonados, c);
    }

    public String toString(){
        String s = "*** Abonados del Gimnacion ***\n";
        for (int i = 0; i < numabonados; i++) {
            s += abonados[i] + "\n";
        }
        return s;
    }
}
