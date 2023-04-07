/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;
import poo.io.IO;
import 
/**
 *
 * @author joni-
 */
public class Tarjeta implements {

    private String id;
    private String dniTitular;
    private int pin;
    private float saldo;

    public Tarjeta(String id, String dniTitular, int pin, float saldo) {
        this.id = id;
        this.dniTitular = dniTitular;
        this.pin = pin;
        this.saldo = saldo;
    }

    public String getId() {
        return id;
    }

    public String getDniTitular() {
        return dniTitular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setPin(int pin) {
        int paux;
        System.out.println("Introduce PIN antiguo: ");
        paux = (int) IO.readNumber();
        if (paux == this.pin) {
            this.pin = pin;
            System.out.println("El nuevo PIN ha sido guardado.");
        } else {
            System.out.println("El PIN introducido es incorrecto. No se ha podido cambiar el PIN.");
        }
    }

    public void comprar(float importe, String dni) {

        if (dni.equals(dniTitular)) {
            if (cargo(importe)) {
                System.out.println("Compra Efectuada. El saldo de su tarjeta es " + saldo + " Euros.");
            } else {
                System.out.println("No es posible hacer la compar. No tiene suficiente saldo.");
            }
        } else {
            System.out.println("No es posible hacer la compar. El DNI no coincide.");
        }
    }

    public void retirarCajero(float importe, int pin) {

        if (pin == this.pin) {
            if (cargo(importe)) {
                System.out.println("Reintegro efectuado efectuado. Su nuevo saldo es " + saldo + " Euros.");
            } else {
                System.out.println("No es posible retiarar " + " Euros, ya que su saldo actual es " + saldo + " Euros.");
            }
        } else {
            System.out.println("No es posible hacer la compar. El DNI no coincide.");
        }
    }

    private boolean cargo(float importe) {
        boolean cargoEfectuado = false;
        if (importe <= saldo) {
            saldo = saldo - importe;
            cargoEfectuado = true;
        }
        return cargoEfectuado;
    }

    public void imprimir() {
        System.out.println("TARJETA id: " + id + "\n\tDNI: " + dniTitular + "\n\tPIN: " + pin + "\n\tSALDO: " + saldo + "Euros");
    }
}
