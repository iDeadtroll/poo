package Inmobiliaria;

/**
 *
 * @author developer
 */
public class Transacccion {

    private Precio precio;
    private String direccion;
    private String poblacion;
    private int codigoPostal;
    private String provincia;
    private int tipoInmueble;
    private int pocentajeComision;
    public int CASA = 1;
    public int PISO = 2;
    public int GARAGE = 3;

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
	this.codigoPostal = codigoPostal;
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
	this.tipoInmueble = tipoInmueble;
    }

    public int getPocentajeComision() {
	return pocentajeComision;
    }

    public void setPocentajeComision(int pocentajeComision) {
	this.pocentajeComision = pocentajeComision;
    }

    public Precio getImporteTransaccion() {
	return precio;
    }

    public void setImporteTransaccion(Precio ImporteTransaccion) {
	this.precio = precio;
    }

    @Override
    public String toString() {
	return "Direccion: " + direccion + "\nPoblacion: " + poblacion + "\n CP: " + codigoPostal + "\nprovincia: " + provincia + "\ntipoInmueble: " + tipoInmueble ;
    }

}
