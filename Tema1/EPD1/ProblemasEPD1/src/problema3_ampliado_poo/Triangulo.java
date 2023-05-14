package problema3_ampliado_poo;

/**
 * Triangulo donde su base o altura no supera los 100cm
 * @author mamisho
 */

//Clase que implemta una interfaz
public class Triangulo implements IFigura {
    private int base;
    private int altura;
    
    private Triangulo() {}
    
    public Triangulo(int base, int altura){
        setAltura(altura);
        setBase(base);
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        if(base > 0 && base < 101) {
            this.base = base;
        } else {
            System.out.println("Base no válida");
        }
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        if(altura > 0 && altura < 101) {
            this.altura = altura;
        } else {
            System.out.println("Altura no válida");
        }
    }
    
    public void printPerimetro() {
        System.out.println("El perímetro es: " + calcularPerimetro());
    }
    
    public void printArea() {
        System.out.println("El área es: " + calcularArea());
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2)) + base + altura;
    }

    @Override
    public int getTotalLados() {
        return 3;
    }
    
//    public boolean equals(Object o){
//        Triangulo t = (Triangulo)o;
//        boolean iguales=false;
//        return this.altura.equals(t.altura) && this.base.equals(t.base);
//    }
}
