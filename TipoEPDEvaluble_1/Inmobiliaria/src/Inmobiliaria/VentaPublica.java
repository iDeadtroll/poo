
package Inmobiliaria;

/**
 *
 * @author developer
 */
public class VentaPublica extends Transacccion implements Venta{
    private int diaEscritura;
    private int mesEscritura;
    private int anyoEscritura;
    private int valorCatastral;
    private boolean vpo;
    private String comprador;
    private String vendedor;
    
    
    public VentaPublica(int diaEscritura, int mesEscritura, int anyoEscritura, String direccion, String poblacion, int codigoPostal, String provincia, int tipoInmueble) {
	super(direccion, poblacion, codigoPostal, provincia, tipoInmueble);
        this.diaEscritura = diaEscritura;
        this.mesEscritura = mesEscritura;
        this.anyoEscritura = anyoEscritura;
        this.vpo = false;
        this.valorCatastral = 0;
        this.comprador = "";
        this.vendedor = "";
    }

    public int getDiaEscritura() {
	return diaEscritura;
    }

    public void setDiaEscritura(int diaEscritura) {
	this.diaEscritura = diaEscritura;
    }

    public int getMesEscritura() {
	return mesEscritura;
    }

    public void setMesEscritura(int mesEscritura) {
	this.mesEscritura = mesEscritura;
    }

    public int getAnyoEscritura() {
	return anyoEscritura;
    }

    public void setAnyoEscritura(int anyoEscritura) {
	this.anyoEscritura = anyoEscritura;
    }

    public int getValorCatastral() {
	return valorCatastral;
    }

    public void setValorCatastral(int valorCatastral) {
	this.valorCatastral = valorCatastral;
    }

    public boolean isVpo() {
	return vpo;
    }

    public void setVpo(boolean vpo) {
	this.vpo = vpo;
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
    public String getVendedor() {
	return vendedor;
    }

    @Override
    public void setVendedor(String vendedor) {
	this.vendedor = vendedor;
    }

    @Override
    public String toString() {
	return "\nCOMPRA-VENTA\n" + super.toString() + 
		"\nComprador: " + comprador + 
		"\nVendedor: " + vendedor + 
		"\nValor catastral: " + valorCatastral + 
		"\nVPO: " + vpo +
		"\nFecha escritura: " + diaEscritura +"/"+ mesEscritura +"/"+ anyoEscritura +
		"\nImporte Compra-Venta: " + getImporteTransaccion()+
		"\nComisión inmobiliaria: " +  getPocentajeComision() + "%";
    }
    
}
