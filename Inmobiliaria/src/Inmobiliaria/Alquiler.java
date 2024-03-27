
package Inmobiliaria;

/**
 *
 * @author developer
 */
public class Alquiler extends Transacccion {
    private String arrendador;
    private String arrendatario;
    private boolean amueblado;
    private boolean comunidadIncluida;


    public Alquiler(String arrendador, String arrendatario, boolean amueblado, boolean comunidadIncluida, String direccion, String poblacion, int codigoPostal, String provincia, int tipoInmueble) {
	super(direccion, poblacion, codigoPostal, provincia, tipoInmueble);
	this.arrendador = arrendador;
	this.arrendatario = arrendatario;
	this.amueblado = amueblado;
	this.comunidadIncluida = comunidadIncluida;
    }

    public String getArrendador() {
	return arrendador;
    }

    public void setArrendador(String arrendador) {
	this.arrendador = arrendador;
    }

    public String getArrendatario() {
	return arrendatario;
    }

    public void setArrendatario(String arrendatario) {
	this.arrendatario = arrendatario;
    }

    public boolean isAmueblado() {
	return amueblado;
    }

    public void setAmueblado(boolean amueblado) {
	this.amueblado = amueblado;
    }

    public boolean isComunidadIncluida() {
	return comunidadIncluida;
    }

    public void setComunidadIncluida(boolean comunidadIncluida) {
	this.comunidadIncluida = comunidadIncluida;
    }

    @Override
    public String toString() {
	return "ALQUILER\n" + super.toString() + 
		"\nArrendador: " + arrendador + 
		"\nArrendatario: " + arrendatario + 
		"\nAmueblado: " + amueblado + 
		"\n Comunidad Incluida: " + comunidadIncluida ;
    }
    
    
}
