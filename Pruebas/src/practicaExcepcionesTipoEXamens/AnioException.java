/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaExcepcionesTipoEXamens;

/**
 *hEMOS CREADO UNA EXCEPCION PROPIA
 * @author Deadtroll
 */ 
public class AnioException extends Exception {
    public AnioException(){
        super("Anyo no valido");
    }
    public AnioException(String m){
        super(m);
    }
}
