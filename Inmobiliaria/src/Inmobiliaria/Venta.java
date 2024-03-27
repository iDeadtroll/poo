
package Inmobiliaria;

/**
 *
 * @author developer
 */
public interface Venta {
    public int getCodigoPostal();
    public void setCodigoPostal(int codigoPostal);
    public String getComprador();
    public void setComprador(String comprador);
    public String getDireccion();
    public void setDireccion(String direccion);
    public String getPoblacion();
    public void setPoblacion(String poblacion);
    public String getProvincia();
    public void setProvincia(String provincia);
    public int getTipoInmueble();
    public void setTipoInmueble(int tipoInmueble);
    public String getVendedor();
    public void setVendedor(String vendedor);
}
