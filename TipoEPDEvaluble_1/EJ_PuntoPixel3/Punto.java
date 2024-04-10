package EjercicioRepaso;

public class Punto implements IPunto {
    protected double x;
    protected double y;

    public Punto() {
        // x = 0;
        // y = 0;
        this(0, 0); // Equivale a las dos lineas anteriores
    }

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public boolean equal(Object o) {
        Punto p = (Punto) o;
        boolean res = false;
        if (this.x == p.x && this.y == p.y) {
            res = true;
        }
        return res;
    }

    public String toString() {

        return "(" + this.x + "," + this.y + ")";
    }

    @Override
    public void borrar() {
        // x = 0;
        // y = 0;
        mover(0, 0); // Equievale a las dons lineas anteruioes
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
        double disX = this.x - s.getX();
        double disY = this.y - s.getY();
        return Math.sqrt(disX * disX + disY * disY);
    }

    @Override
    public double getX() {
        return this.x;
    }

    @Override
    public double getY() {
        return this.y;
    }

    @Override
    public void setX(double v) {
        this.x = v;
    }

    @Override
    public void setY(double v) {
        this.y = v;
    }

}
