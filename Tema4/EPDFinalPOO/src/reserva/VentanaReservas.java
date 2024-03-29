package reserva;

import cliente.CentralClientes;
import cliente.Cliente;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import material.CentralMateriales;
import material.IReservable;

public class VentanaReservas {

    private CentralReservas reservas;
    private CentralClientes clientes;
    private CentralMateriales materiales;

    public VentanaReservas(CentralClientes clientes, CentralMateriales materiales, CentralReservas reservas) {

        this.clientes = clientes;
        this.materiales = materiales;
        this.reservas = reservas;
    }

    public void mostrarMenuGestionReservas() throws ParseException {
        Scanner s = new Scanner(System.in);
        int opc;

        do {
            System.out.println("\n\n\n\tMenú Gestión de Materiales:\n");
            System.out.println("\t1. Realizar Reserva");
            System.out.println("\t2. Listado de Reservas");
            System.out.println("\t3. Cancelar Reserva");
            System.out.println("\t4. Consolidar Reserva");
            System.out.println("\t---------------------");
            System.out.println("\t\t0. Salir");
            System.out.print("\n\n--> Introduzca una opción: ");
            opc = s.nextInt();
            while (opc < 0 || opc > 3) {
                System.out.print("--> Introduzca una opción valida: ");
                opc = s.nextInt();
                System.out.println("\n");
            }
            if (opc != 0) {
                realizarOpcionGestionReserva(opc);
            }
        } while (opc != 0);
    }

    private void realizarOpcionGestionReserva(int opc) throws ParseException {
        switch (opc) {
            case 1:
                mostrarRealizarReserva();
                break;
            case 2:
                mostrarListadoReservas();
                break;
            case 3:
                mostrarCancelarReserva();
                break;
            case 4:
                mostrarConsolidarReserva();
                break;

        }
    }
// TODO: Implementar codigo para los siguientes métodos:

    private void mostrarRealizarReserva() throws ParseException {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el DNI del cliente
        System.out.println("Introduzca el DNI del cliente: ");
        String dni = scanner.nextLine();

        Cliente cliente = clientes.buscaCliente(dni);
        if (cliente == null) {
            System.out.println("Introduzca un nombre: ");
            String nombre = scanner.nextLine();

            System.out.println("Introduzca un email: ");
            String email = scanner.nextLine();

            System.out.println("Introduzca un telefono: ");
            String tlf = scanner.nextLine();

            clientes.nuevoCliente(nombre, dni, email, tlf);
            cliente = clientes.buscaCliente(dni);
        }

        System.out.println("Seleccione la opcion temporal (0-5):");
        int opcionTiempo;
        do {
            System.out.println("Opcion temporal (entre 0 y 5): ");
            opcionTiempo = scanner.nextInt();
            scanner.nextLine();
        } while (opcionTiempo < 0 || opcionTiempo > 5);

        System.out.println("Introduzca una fecha para la reserva (dd/MM/yyyy): ");
        String fecha = scanner.nextLine();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date date = df.parse(fecha);
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        GregorianCalendar fechaReserva = (GregorianCalendar) cal;

        Reserva reserva = new Reserva(cliente, opcionTiempo, fechaReserva);
        System.out.println("Seleccione los materiales:");
        materiales.tablasToString();
        Integer idTabla = scanner.nextInt();
        IReservable tabla = materiales.getTabla(idTabla);
        reserva.addMaterial(tabla);
        materiales.trajesToString();
        Integer idTraje = scanner.nextInt();
        IReservable traje = materiales.getTabla(idTraje);
        reserva.addMaterial(traje);

        reservas.addReservas(reserva);

    }

    private void mostrarListadoReservas() {
        System.out.println(reservas.toString());
    }

    private void mostrarCancelarReserva() {

    }

    private void mostrarConsolidarReserva() {

    }
}
