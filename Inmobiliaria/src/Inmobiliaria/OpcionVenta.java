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
        return vigenciaOpcion;
    }

    public void setVigenciaOpcion(int vigenciaOpcion) {
        this.vigenciaOpcion = vigenciaOpcion;
    }

    public int getPenalizacion() {
        return penalizacion;
    }

    public void setPenalizacion(int penalizacion) {
        if (penalizacion < 0 || penalizacion > 100) {
            System.out.println("Error: porcentaje de penalizacion incorrecto. Porcentaje por defecto: 5%");
            this.penalizacion = 5;
        } else {
            this.penalizacion = penalizacion;
        }
    }

    @Override
    public int getCodigoPostal() {
        return codigoPostal;
    }

    @Override
    public void setCodigoPostal(int codigoPostal) {
        if (codigoPostal < 0 || codigoPostal > 99999) {
            System.out.println("Error: codigo postal incorrecto. Codigo postal por defecto: 0");
            this.codigoPostal = 0;
        } else {
            this.codigoPostal = codigoPostal;
        }
    }

    @Override
    public String getComprador() {
        return comprador;
    }

    @Override
    public void setComprador(String comprador) {
        this.comprador = comprador;
    }

    @Override
    public String getDireccion() {
        return direccion;
    }

    @Override
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String getPoblacion() {
        return poblacion;
    }

    @Override
    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    @Override
    public String getProvincia() {
        return provincia;
    }

    @Override
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    @Override
    public int getTipoInmueble() {
        return tipoInmueble;
    }

    @Override
    public void setTipoInmueble(int tipoInmueble) {
        if (tipoInmueble < CASA || tipoInmueble > GARAGE) {
            System.out.println("Error: tipo de inmueble incorrecto");
            this.tipoInmueble = PISO;
        } else {
            this.tipoInmueble = tipoInmueble;
        }
    }

    @Override
    public String getVendedor() {
        return vendedor;
    }

    @Override
    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

}
