package EjercicioRepaso;

public interface IPunto {

    public void borrar();

    public void mover(double x, double y);

    public void mover(IPunto s);

    public double distancia(IPunto s);

    public double getX();

    public double getY();

    public void setX(double v);

    public void setY(double v);

}
