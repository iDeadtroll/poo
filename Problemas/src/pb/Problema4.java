/*
P4. Escriba un programa que simule el funcionamiento de un termostato. Para ello, se le pedirá al usuario 
la temperatura actual, y la temperatura deseada por debajo de la cual se activará la calefacción 
(se muestra un mensaje por pantalla pidiendo su activación) y por encima de la cual se activará el aire
acondicionado frío (un mensaje por pantalla similar al caso anterior). Si la temperatura actual
coincide con la temperatura se indicará un mensaje por pantalla advirtiendo de ello.
 */
package pb;

public class Problema4 {

    private boolean encenderCalefaccion;
    private boolean encenderAireAcondicionado;
    private int temperatura;

    public static void main(String[] args) {
        Termoestato t = new Termoestato(1, 2);
        t.aumentarTemperatura();
        t.aumentarTemperatura();
        t.bajarTemperatura();
        t.bajarTemperatura();
    }
}
