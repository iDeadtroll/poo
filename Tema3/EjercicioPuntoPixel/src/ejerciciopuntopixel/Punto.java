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
public class Punto implements IPunto{

    protected double x;
    protected double y;
    
    public Punto(){
        x = 0;
        y = 0;
    }
    public Punto(double x, double y){
        this.x = x;
        this.y = y;
    }
    public boolean equals(Object o){
        Punto p = (Punto)o;
        return x==p.x && y==p.y;
    }
    
    public String toString(){
        return ("("+ x +", "+ y + ")");
    }
            
    @Override
    public void borrar() {
        x = 0;
        y = 0;
    }

    @Override
    public void mover(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void mover(IPunto s) {
        this.x = s.getX();
        this.y = s.getY();
    }

    @Override
    public double distancia(IPunto s) {
        double difx= x - s.getX();
        double dify= y - s.getY();
        
        return Math.sqrt(difx*difx+dify*dify);
        //return Math.sqrt(Math.pow(difx)+);
    }

    @Override
    public double getX() {
        return x;
    }

    @Override
    public double getY() {
        return y;
    }

    @Override
    public void setX(double v) {
        x = v;
    }

    @Override
    public void setY(double v) {
        y = v;
    }
    
    
}
