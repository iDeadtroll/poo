package material;

import java.util.Scanner;

public class VentanaMateriales {

    public CentralMateriales materiales;

    public VentanaMateriales(CentralMateriales materiales) {
        this.materiales = materiales;
    }

    public void mostrarMenuGestionMateriales() {
        Scanner s = new Scanner(System.in);
        int opc;

        do {
            System.out.println("\n\n\n\tMenú Gestión de Materiales:\n");
            System.out.println("\t1. Alta de tabla de surf");
            System.out.println("\t2. Baja de tabla de surf");
            System.out.println("\t3. Listado de tablas de surf");
            System.out.println("\t4. Alta de traje de neopreno");
            System.out.println("\t5. Baja de traje de neopreno");
            System.out.println("\t6. Listado de trajes de neopreno");
            System.out.println("\t---------------------");
            System.out.println("\t\t0. Salir");
            System.out.print("\n\n--> Introduzca una opción: ");
            opc = s.nextInt();
            while (opc < 0 || opc > 6) {
                System.out.print("--> Introduzca una opción valida: ");
                opc = s.nextInt();
                System.out.println("\n");
            }
            if (opc != 0) {
                mostrarMenuGestionMateriales(opc);
            }
        } while (opc != 0);
    }

    private void mostrarMenuGestionMateriales(int opc) {
        switch (opc) {
            case 1:
                mostrarAltaTabla();
                break;
            case 2:
                mostrarBajaTabla();
                break;
            case 3:
                mostrarListadoTablas();
                break;
            case 4:
                mostrarAltaTraje();
                break;
            case 5:
                mostrarBajaTraje();
                break;
            case 6:
                mostrarListadoTrajes();
                break;
        }
    }

    private void mostrarAltaTabla() {
        Scanner s = new Scanner(System.in);

        System.out.println("\n\n\n\tAlta de tabla de surf:\n");

        // Solicitar datos de la tabla
        System.out.print("\tMarca: ");
        String marca = s.nextLine();

        System.out.print("\tTipo: ");
        String tipo = s.nextLine();

        int volumen;
        do {
            System.out.print("\tVolumen (entre 10 y 100): ");
            volumen = s.nextInt();
            s.nextLine();
        } while (volumen < 10 || volumen > 100);

        double talla;
        System.out.print("\tTalla: ");
        talla = s.nextDouble();

        System.out.print("\tMaterial de construcción: ");
        int material = s.nextInt();

        System.out.print("\tSuplemento: ");
        double suplemento = s.nextDouble();

        // nuevaTabla para agregar la nueva tabla al vector de tablas
        materiales.nuevaTabla(marca, tipo, volumen, talla, material, suplemento);
    }

    private void mostrarBajaTabla() {
        Scanner scanner = new Scanner(System.in);
        CentralMateriales m = new CentralMateriales();
        materiales.tablasToString();
        System.out.println("Seleccione el ID de la tabla que desea eleminar: ");
        int id = scanner.nextInt();
 
            TablaSurf tabla = materiales.getTabla(id);
            materiales.eliminaTabla(tabla);

        
    }

    private void mostrarListadoTablas() {

        System.out.println("\nListado de tablas de surf:\n");
        materiales.tablasToString();
    }

    private void mostrarAltaTraje() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\n\n\tAlta de traje de surf:\n");

        // Solicitar datos de la tabla
        System.out.print("\nMarca: ");
        String marca = scanner.nextLine();

        System.out.print("\nCategoria: ");
        String categoria = scanner.nextLine();

        System.out.print("\nTalla: ");
        int talla = scanner.nextInt();

        System.out.print("\nmangasLargas: ");
            String val1 = scanner.nextLine();
            String val2 = "si";
            if(val1.equals(val2)){        
                boolean mangasLargas = true;
            }
        System.out.print("\npiernasLargas: ");
        boolean piernasLargas = scanner.nextBoolean();

        System.out.print("\nCremallera: ");
        int cremallera = scanner.nextInt();

        System.out.print("\nSuplemento: ");
        double suplemento = scanner.nextDouble();
        // nuevoTraje para agregar el nuevo traje al vector de trajes
        materiales.nuevoTraje(marca, categoria, talla, mangasLargas, piernasLargas, cremallera, suplemento);

    }

    private void mostrarBajaTraje() {
        Scanner scanner = new Scanner(System.in);
        CentralMateriales m = new CentralMateriales();
        materiales.trajesToString();
        System.out.println("Seleccione el ID de la tabla que desea eleminar: ");
        int id = scanner.nextInt();
            Neopreno traje = materiales.getTraje(id);
            materiales.eliminaTraje(traje);

        
    }

    private void mostrarListadoTrajes() {
        System.out.println("\nListado de trajes neopreno:\n");
        materiales.trajesToString();
    }
}
