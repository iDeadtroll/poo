/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e2_a;

import e2_b.*;

/**
 *
 * @author Deadtroll
 */
public class Positivo {
    private int numero;

    public Positivo(int numero) throws Exception {
        setNumero(numero);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) throws Exception {
        if (numero >= 0)
            this.numero = numero;
        else
            throw new Exception("ERROR: EL número debe ser positivo");
    }
}

