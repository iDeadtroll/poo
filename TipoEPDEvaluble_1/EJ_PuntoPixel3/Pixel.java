package EjercicioRepaso;

public class Pixel extends Punto implements IPixel {
    private String color;

    public Pixel() {
        super(); // Llama al constructor de la clase padre
        color = "Negro";
    }

    public Pixel(Punto p, String c) {
        super(p.x, p.y); // La llamada de p.x o p.y se puede hacer directamente porque x e y son
                         // atributos protejidos
        this.color = c;
    }

    @Override
    public void setColor(String c) {
        this.color = c;
    }

    public String toString() {

        // return "(" + this.x + "," + this.y + ")" + "un pixel de color" + color;
        return super.toString() + "un pixel de color" + color; // Reutilizamos el toStrin() de la clase padre
    }
}
