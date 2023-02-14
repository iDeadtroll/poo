/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epd2.e2;

/**
 * Clase que desrcibe objetos del tipo producto
 * Cada producto tiene un nombre, precio y unidades en stock.
 * 
 * @author joni-
 * @version 2/13/
 */
public class PruebaProducto {

    public static void main(String[] args) {
        Producto p = new Producto();
        float precioTotal;
        p.setNombre("Cola-Cao");
        p.setPrecio(10.5F);
        p.setUnidades(3);
        precioTotal = p.setPrecio(10.5) * p.setUnidades(3);
        System.out.println("El precio del producto " + p.getNombre() + " es de "
                + p.getPrecio() + " Euros");
        System.out.println("Hay " + p.getUnidades() + " en stock, valoradas es "
                + precioTotal + " Euros");

    }
}

