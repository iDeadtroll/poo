/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inmobiliaria;

/**
 *
 * @author joni-
 */
public class principal {
    public static void main(String[] args){
        
        Alquiler alquiler_1 = new Alquiler("Calle Isaac Peral 156","Dos Hermanas",41700,"Sevilla",1);
        alquiler_1.setArrendador("Pedro González López");
        alquiler_1.setArrendatario("María Pérez Domínguez");
        alquiler_1.setAmueblado(true);
        alquiler_1.setComunidadIncluida(true);
        alquiler_1.setPocentajeComision(10);
        Precio p1 = new Precio(300,50, "Euros");
        alquiler_1.setImporteTransaccion(p1);
        System.out.println(alquiler_1);
        
        VentaPublica venta_1 = new VentaPublica(01,04,2020,"Calle Isaac Peral 154","Dos Hermanas",41700,"Sevilla",2);
        venta_1.setComprador("Luis López Salmerón");
        venta_1.setVendedor("Marta Castilla Suárez");
        venta_1.setValorCatastral(45325);
        venta_1.setVpo(true);
        Precio p2 = new Precio(96524,45,"Euros");
        venta_1.setImporteTransaccion(p1);
        venta_1.setPocentajeComision(2);
        
        System.out.println("\n" + venta_1);
        
        OpcionVenta opVenta_1 = new OpcionVenta("Calle Isaac Peral 154","Dos Hermanas",41700,"Sevilla",3);
        opVenta_1.setComprador("Jorge Sánchez Gómez");
        opVenta_1.setVendedor("Ricardo Asunción León");
        Precio p3 = new Precio(10000,0,"Euros");
        opVenta_1.setImportePactado(p3);
        opVenta_1.setVigenciaOpcion(6);
        opVenta_1.setPenalizacion(5);
        
        System.out.println("\n" + opVenta_1);
        
        opVenta_1.extinguirContrato();
        
        System.out.println(opVenta_1);
    } 
}
