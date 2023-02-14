/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epd2.e2;

/**
 *
 * @author joni-
 */
public class Producto {
    //Constante para limitar precio maximo
    public stactic final PRECIO_MAXIMO = 1.000.000;
    //Nombre del producto
    private String nombre;
    //Precio del producto
    private float precio;
    //Unidades en estock
    private int unidades;
  
    // Debuelve el estock
    public float valorEnStock() {
        return unidades * precio;
    }
    /*
    @Param
    **/
    public void incrementarStock(int incremento) {
        unidades = unidades + incremento;
    }

    public void disminuirStock(int decremento) {
        unidades = unidades - decremento;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }
    //Debuelve las unidades
    public int getUnidades() {
        return unidades;
    }
    //Establece el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //Establece las unidades
    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }
    //Establece el precio 
    //Limita un intervalo valido para el precio, con un minimo mayor que cero y maximo en 1000000.
    public void setPrecio(float precio) {
        if (precio > 0 && precio<= PRECIO_MAXIMO) {
            this.precio = precio;
        
        }
    }

    void setPrecio(double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
