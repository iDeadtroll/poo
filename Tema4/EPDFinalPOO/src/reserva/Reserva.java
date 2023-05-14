
package reserva;

import cliente.ICliente;
import java.util.GregorianCalendar;
import material.IReservable;

public class Reserva {
    private static int numReserva = 0;
    private int idReserva;
    private ICliente cliente;
    private IReservable[] materiales;
    private int numMateriales;
    private static final int MAXPRODUCTOSXRESERVA = 10;
    private int opcionTiempo;
    public static final int UNAHORA = 0;
    public static final int MEDIODIA = 1;
    public static final int UNDIA = 2;
    public static final int DOSDIAS = 3;
    public static final int CUATRODIAS = 4;
    public static final int UNASEMANA = 5;
    private GregorianCalendar fechaReserva;
    private double total;

    public Reserva(ICliente cliente, int opcionTiempo, GregorianCalendar fechaReserva) {
        this.idReserva = ++numReserva;
        this.cliente = cliente;
        this.materiales = new IReservable[MAXPRODUCTOSXRESERVA];
        this.numMateriales = 0;
        this.opcionTiempo = opcionTiempo;
        this.fechaReserva = fechaReserva;
        this.total = 0.0;
    }

    public void addMaterial(IReservable material) {
        if (numMateriales < MAXPRODUCTOSXRESERVA) {
            materiales[numMateriales] = material;
            numMateriales++;
            total += material.getPrecio(opcionTiempo);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Reserva #").append(idReserva).append("\n");
        sb.append("Cliente: ").append(cliente.toString()).append("\n");
        sb.append("Fecha de reserva: ").append(fechaReserva.getTime()).append("\n");
        sb.append("Materiales reservados:\n");
        for (int i = 0; i < numMateriales; i++) {
            sb.append(materiales[i].toString()).append("\n");
        }
        sb.append("Total: ").append(total).append("\n");
        return sb.toString();
    }
    
    public double getTotal(){
        return total;
    }
    
    public IReservable[] getMateriales() {
        return this.materiales;
    }
}
