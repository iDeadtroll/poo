package EjercicioRepaso;

public class main {
    public static void main(String[] args) {
        Punto p1 = new Punto();
        Punto p2 = new Punto(2, 6);
        Pixel px1 = new Pixel(p2, "Azul");

        p1.mover(2, 8);

        System.out.println("Pixel px1: " + px1.toString());

        System.out.println("Cooredenadas de p1:" + p1);
        System.out.println("Cooredenadas de p2:" + p2);

        if (p1.equal(p2)) {

        }
    }
}
