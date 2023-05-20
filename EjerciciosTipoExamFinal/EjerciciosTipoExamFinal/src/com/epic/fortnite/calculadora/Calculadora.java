/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.fortnite.calculadora;


/**
 *
 * @author Deadtroll
 */
public class Calculadora {
    
    private Teclado teclado;
    private Pantalla pantalla;
    private Operacion operacion;
    
    public Calculadora() {
        this.operacion = new Operacion();
        this.teclado = new Teclado();
        this.pantalla = new Pantalla(this.operacion.getOperaciones());
    }
    
    public void encenderCalculadora() {
        Integer salir = this.operacion.getOperaciones().size();
        Double opc;
        do {
            pantalla.mostrarOperaciones(salir);
            opc = this.teclado.leerValor("\n\n--->Opcion: ");
            if(salir.intValue() == opc.intValue()) {
                break;
            }
            this.ejecutarOperacion(opc.intValue());
        } while (opc > -1 || opc < salir);
    }
    
    private void ejecutarOperacion(Integer opc) {
        
        if(opc >= 0 && opc < this.operacion.getOperaciones().size()) {
            Double val1 = this.teclado.leerValor("\nIngrese el primer numero: ");
            Double val2 = this.teclado.leerValor("\nIngrese el segundo numero: ");        
            this.pantalla.mostrarResultado(this.operacion.ejecutar(opc, val1, val2).toString());
        }
    }

}
