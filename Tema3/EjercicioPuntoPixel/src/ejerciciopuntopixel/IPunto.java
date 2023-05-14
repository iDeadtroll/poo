/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopuntopixel;

/**
 *
 * @author Deadtroll
 */
public interface IPunto {
    public void borrar();
    public void mover(double x, double y);
    public void mover(IPunto s);
    public double distancia(IPunto s);
    public double getX();
    public double getY();
    public void setX(double  v);
    public void setY(double  v);
    
    
}
