
package reserva;


public class CentralReservas {
    private static final int MAXRESERVAS = 100;
    private Reserva[] reservas;
    private int numReservas;

    public CentralReservas() {
        reservas = new Reserva[MAXRESERVAS];
        numReservas = 0;
    }

    public void addReservas(Reserva reserva) {
        if (numReservas < MAXRESERVAS) {
            reservas[numReservas] = reserva;
            numReservas++;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numReservas; i++) {
            sb.append(reservas[i].toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
