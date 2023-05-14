/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package material;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Deadtroll
 */
public class VentanaMateriales {
    private CentralMateriales materiales;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public VentanaMateriales(CentralMateriales materiales){
        this.materiales = materiales;
    }
    
    public void mostrarMenuGestionMateriales() throws IOException{
        int opc;
        
        do{
            System.out.println("Menu Gestion de Materiales; \n");
            System.out.println("1. Alta de tabla de surf");
            System.out.println("2. Baja de tabla de surf");
            System.out.println("3. Listado de tablas de surf");
            System.out.println("4. Alta de traje de neopleno");
            System.out.println("5. Baja de traje de neopleno");
            System.out.println("6. Listado de trajes de neopleno");
            System.out.println("-----------------------------");
            System.out.println("0. Salir");
            
            opc = Integer.parseInt(br.readLine());
            
            if (opc >= 1 && opc <= 6){
                realizarOpcionGestionMaterial(opc);
            }
        }while (opc != 0);
        
    }
    private void realizarOpcionGestionMaterial(int opcion){
        switch (opcion){
            case 1: mostrarAltaTabla();
            break;
            case 2: mostrarBajaTabla();
            break;
            case 3: mostrarListadoTablas();
            break;
            case 4: mostrarAltaTraje();
            break;
            case 5: mostrarBajaTraje();
            break;
            case 6: mostrarListadoTrajes();
            break;
            
        }
    }
    private void mostrarAltaTabla(){
    
    }
    
    private void mostrarBajaTabla(){
    
    }
    
    private void mostrarListadoTablas(){
    
    }
    
    private void mostrarAltaTraje(){
    
    }
    
    private void mostrarBajaTraje(){
    
    }
    
    private void mostrarListadoTrajes(){
    
    }

}
