/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipoExamen;

/**
 *
 * @author Deadtroll
 */
public class Pixel extends Punto implements IPixel{
    private String color;
    
    public Pixel(){
        super();
        color = "Negro";
    }
    
    public Pixel(Punto p, String c){
//      Valido pero, con el super es mejor!  
//        x = p.getX();
//        y = p.getY();
        super(p.getX(), p.getY());
        
        color = c;
    }

    @Override
    public void setColor(String c) {
        this.color = c;
    }
     
}
