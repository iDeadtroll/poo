/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epd5.e3;

/**
 *
 * @author joni-
 */
public class Hijo extends Padre {

    public Hijo() {
        System.out.println("Se ha llamado al constructor por defecto de la "
                + "clase Hijo");
    }

    public Hijo(int n) {
//      Instanciamos a la clase padre para forzar la llamada a la clase padre con parametro.
        super(n);
        System.out.println("Se ha llamado al constructor con un argumento "
                + "int n=" + n + " de la clase Hijo");
    }
}
