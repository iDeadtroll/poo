/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

import java.util.Scanner;

/**
 *
 * @author Deadtroll
 */
public class Calculadora {

    public OperacionCalculadora operaciones;
    
    public Calculadora(OperacionCalculadora operaciones) {
        this.operaciones = operaciones;
    }
    
    public void mostrarOpcionesCalculadora() {
        Scanner input = new Scanner(System.in);
        int opc;
        do {
            System.out.println("Seleccione una opcion:");
            System.out.println("1.  Sumar 2 numeros");
            System.out.println("2.  Restar 2 numeros");
            System.out.println("3.  Multiplicar 2 numeros");
            System.out.println("4.  Dividir 2 numeros");
            System.out.println("0.  Salir");
            System.out.print("\n\n--->Opcion: ");
            opc = input.nextInt();
            while (opc < 0 || opc > 6) {
                System.out.print("Introduzca una opcion valida: ");
                opc = input.nextInt();
                System.out.println("\n");
            }
            if (opc != 0) {
                mostrarOpcionesCalculadora(opc);
            }
        } while (opc != 0);
    }

    public void mostrarOpcionesCalculadora(int opc) {
        switch(opc){
            case 1: 
                mostrarOpcionSuma();
                break;
            case 2:
                mostrarOpcionResta();
                break;
            case 3:
                mostrarOpcionMultiplicar();
                break;
            case 4:
                mostrarOpcionDividir();
                
        }
    }
    
    public void mostrarOpcionSuma(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("\n\n----Opcion Suma----");
        
        System.out.print("\nIngrese el primer numero: ");
        int num1 = input.nextInt();
        
        System.out.print("\nIngrese el segundo numero: ");
        int num2 = input.nextInt();
              
        OperacionCalculadora operacion = new OperacionCalculadora(num1, num2);
        
        System.out.println(operacion.Suma());
        
        
    }
    
    public void mostrarOpcionResta(){
    
    }
    
    public void mostrarOpcionMultiplicar(){
    
    }
    
    public void mostrarOpcionDividir(){
    
    }
}
