package Inmobiliaria;

/**
 *
 * @author developer
 */
public class Transacccion {

    private Precio importeTransaccion;
    private String direccion;
    private String poblacion;
    private int codigoPostal;
    private String provincia;
    private int tipoInmueble;
    private int porcentajeComision;
    public static final int CASA = 1;
    public static final int PISO = 2;
    public static final int GARAGE = 3;

    public Transacccion(String direccion, String poblacion, int codigoPostal, String provincia, int tipoInmueble) {
        this.direccion = direccion;
        this.poblacion = poblacion;
        this.codigoPostal = codigoPostal;
        this.provincia = provincia;
        this.tipoInmueble = tipoInmueble;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        if (codigoPostal < 0 || codigoPostal > 99999) {
            System.out.println("Error: codigo postal incorrecto. Codigo postal por defecto: 0");
            this.codigoPostal = 0;
        } else {
            this.codigoPostal = codigoPostal;
        }
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public int getTipoInmueble() {
        return tipoInmueble;
    }

    public void setTipoInmueble(int tipoInmueble) {
        if (tipoInmueble < CASA || tipoInmueble > GARAGE) {
            System.out.println("Error: tipo de inmueble incorrecto");
            this.tipoInmueble = PISO;
        } else {
            this.tipoInmueble = tipoInmueble;
        }
    }

    public int getPocentajeComision() {
        return porcentajeComision;
    }

    public void setPocentajeComision(int porcentajeComision) {

        if (porcentajeComision < 0 || porcentajeComision > 100) {
            System.out.println("Error: porcentaje de comision incorrecto. Porcentaje por defecto: 5%");
            this.porcentajeComision = 5;
        } else {
            this.porcentajeComision = porcentajeComision;
        }
    }

    public Precio getImporteTransaccion() {
        return importeTransaccion;
    }

    public void setImporteTransaccion(Precio ImporteTransaccion) {
        this.importeTransaccion = ImporteTransaccion;
    }

    @Override
    public String toString() {
        String t_inmueble = "";
        switch (getTipoInmueble()) {
            case CASA:
                t_inmueble = "Casa";
                break;
            case PISO:
                t_inmueble = "Piso";
                break;
            case GARAGE:
                t_inmueble = "Garage";
                break;
        }
        return "Direccion: " + direccion
                + "\nPoblacion: " + poblacion
                + "\nCP: " + codigoPostal
                + "\nprovincia: " + provincia
                + "\ntipoInmueble: " + t_inmueble;
    }

}
