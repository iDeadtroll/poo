/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e2_b;

/**
 *
 * @author Deadtroll
 */
public class Positivo {
    private int numero;

    public Positivo(int numero) {
        setNumero(numero);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        try {
            if (numero >= 0)
                this.numero = numero;
            else
                throw new Exception("ERROR: EL número debe ser positivo");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            this.numero = 0;
        }
    }
}
