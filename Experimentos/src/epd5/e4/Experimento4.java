/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epd5.e4;

/**
 *
 * @author joni-
 */
public class Experimento4 {

    public static void main(String[] args) {
        UsuarioMetro v1 = new ViajeroOcasional(9650, "Pablo de Olavide", "Gran Plaza");
        UsuarioMetro v2 = new ViajeroAbonado(9700, "Montequinto", "San Bernardo");
        v1.viajar();
        v2.viajar();
    }
}
