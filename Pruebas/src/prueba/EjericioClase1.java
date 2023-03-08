/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prueba;

/**
 *
 * @author joni-
 */
public class EjericioClase1 {
    
    public static void main(String[] args){
        
    Tarjeta t = new Tarjeta("oiyqwe", "lkjash", 1234 , 1000 );
    
//        System.out.println(t.getId() + t.getDniTitular() + t.getSaldo());
//        System.out.println(t.getDniTitular());
        t.setPin(7890);
        t.retirarCajero(150, 7890);
        t.comprar(900, "lkjash");
        t.comprar(700, "lkjash");
        t.imprimir();
    }
    
    
}
