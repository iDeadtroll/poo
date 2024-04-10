package Inmobiliaria;

/**
 *
 * @author joni-
 */
public class OpcionVenta implements Venta {

    private Precio importePactado;
    private String comprador;
    private String vendedor;
    private String direccion;
    private String poblacion;
    private int codigoPostal;
    private String provincia;
    private int tipoInmueble;
    private int vigenciaOpcion;
    private int penalizacion;
    private boolean extinguido;
    public static final int CASA = 1;
    public static final int PISO = 2;
    public static final int GARAGE = 3;

    public OpcionVenta(String direccion, String poblacion, int codigoPostal, String provincia, int tipoInmueble) {
        this.direccion = direccion;
        this.poblacion = poblacion;
        this.codigoPostal = codigoPostal;
        this.provincia = provincia;
        this.tipoInmueble = tipoInmueble;
        this.extinguido = false;
    }

    public void extinguirContrato() {
        if (isExtinguido()) {
            System.out.println("\"ERROR: Contrato ya extinguido\"");
        } else {
            this.extinguido = true;
        }
    }

    public boolean isExtinguido() {
        return extinguido;
    }

    public Precio getImportePactado() {
        if (isExtinguido()) {
            System.out.println("ERROR: Contrato Extinguido");
            return null;
        } else {
            return importePactado;
        }
    }

    public void setImportePactado(Precio importePactado) {
        if (isExtinguido()) {
            System.out.println("ERROR: Contrato Extinguido");
        } else {
            this.importePactado = importePactado;
        }
    }

    public int getVigenciaOpcion() {
        if (isExtinguido()) {
            System.out.println("ERROR: Contrato Extinguido");
            return 0;
        } else {
            return vigenciaOpcion;
        }
    }

    public void setVigenciaOpcion(int vigenciaOpcion) {
        if (isExtinguido()) {
            System.out.println("ERROR: Contrato Extinguido");
        } else {
            this.vigenciaOpcion = vigenciaOpcion;
        }

    }

    public int getPenalizacion() {
        if (isExtinguido()) {
            System.out.println("ERROR: Contrato Extinguido");
            return 0;
        } else {
            return penalizacion;
        }

    }

    public void setPenalizacion(int penalizacion) {
        if (isExtinguido()) {
            System.out.println("ERROR: Contrato Extinguido");
        } else {
            if (penalizacion < 0 || penalizacion > 100) {
                System.out.println("Error: porcentaje de penalizacion incorrecto. Porcentaje por defecto: 5%");
                this.penalizacion = 5;
            } else {
                this.penalizacion = penalizacion;
            }
        }
    }

    @Override
    public int getCodigoPostal() {
        if (isExtinguido()) {
            System.out.println("ERROR: Contrato Extinguido");
            return 0;
        } else {
            return codigoPostal;
        }

    }

    @Override
    public void setCodigoPostal(int codigoPostal) {
        if (isExtinguido()) {
            System.out.println("ERROR: Contrato Extinguido");
        } else {
            if (codigoPostal < 0 || codigoPostal > 99999) {
                System.out.println("Error: codigo postal incorrecto. Codigo postal por defecto: 0");
                this.codigoPostal = 0;
            } else {
                this.codigoPostal = codigoPostal;
            }
        }

    }

    @Override
    public String getComprador() {
        if (isExtinguido()) {
            System.out.println("ERROR: Contrato Extinguido");
            return "";
        } else {
            return comprador;
        }
    }

    @Override
    public void setComprador(String comprador) {
        if (isExtinguido()) {
            System.out.println("ERROR: Contrato Extinguido");
        } else {
            this.comprador = comprador;
        }

    }

    @Override
    public String getDireccion() {
        if (isExtinguido()) {
            System.out.println("ERROR: Contrato Extinguido");
            return "";
        } else {
            return direccion;
        }
    }

    @Override
    public void setDireccion(String direccion) {
        if (isExtinguido()) {
            System.out.println("ERROR: Contrato Extinguido");
        } else {
            this.direccion = direccion;
        }
    }

    @Override
    public String getPoblacion() {
        if (isExtinguido()) {
            System.out.println("ERROR: Contrato Extinguido");
            return "";
        } else {
            return poblacion;
        }
    }

    @Override
    public void setPoblacion(String poblacion) {
        if (isExtinguido()) {
            System.out.println("ERROR: Contrato Extinguido");
        } else {
            this.poblacion = poblacion;
        }
    }

    @Override
    public String getProvincia() {
        if (isExtinguido()) {
            System.out.println("ERROR: Contrato Extinguido");
            return "";
        } else {
            return provincia;
        }
    }

    @Override
    public void setProvincia(String provincia) {
        if (isExtinguido()) {
            System.out.println("ERROR: Contrato Extinguido");
        } else {
            this.provincia = provincia;
        }
    }

    @Override
    public int getTipoInmueble() {
        if (isExtinguido()) {
            System.out.println("ERROR: Contrato Extinguido");
            return 0;
        } else {
            return tipoInmueble;
        }
    }

    @Override
    public void setTipoInmueble(int tipoInmueble) {
        if (isExtinguido()) {
            System.out.println("ERROR: Contrato Extinguido");
        } else {
            if (tipoInmueble < CASA || tipoInmueble > GARAGE) {
                System.out.println("Error: tipo de inmueble incorrecto");
                this.tipoInmueble = PISO;
            } else {
                this.tipoInmueble = tipoInmueble;
            }
        }

    }

    @Override
    public String getVendedor() {
        if (isExtinguido()) {
            System.out.println("ERROR: Contrato Extinguido");
            return "";
        } else {
            return vendedor;
        }
    }

    @Override
    public void setVendedor(String vendedor) {
        if (isExtinguido()) {
            System.out.println("ERROR: Contrato Extinguido");
        } else {
            this.vendedor = vendedor;
        }
    }

    @Override
    public String toString() {

        if (isExtinguido()) {
            System.out.println("\nERROR: Contrato Extinguido");
            return null;
        } else {
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
            return "\nCONTRATO COMPROMISO DE VENTA"
                    + "\nDireccion: " + getDireccion()
                    + "\nPoblacion: " + getPoblacion()
                    + "\nCP: " + getCodigoPostal()
                    + "\nprovincia: " + getProvincia()
                    + "\ntipoInmueble: " + t_inmueble
                    + "\nComprador: " + getComprador()
                    + "\nVendedor: " + getVendedor()
                    + "\nImporte pactado: " + getImportePactado()
                    + "\nVigencia contrato: " + getVigenciaOpcion() + " meses"
                    + "\nPenalizacion incumplimiento: " + getPenalizacion() + "%";
        }
    }

}
