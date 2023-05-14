package problema3_ampliado_poo;

/**
 * Clase cuadrado que sus lados como máximo miden 1m
 * @author mamisho
 */
public class Cuadrado implements IFigura {
    private int lado;
    
    public Cuadrado() {
        System.out.println("Hola, me he construido");
    }
    
    public Cuadrado(int tamLado) {
        this.setLado(tamLado);
        System.out.println("mis lados miden " + lado + " cm");
    }
    
    public Cuadrado(int lado, String miNombre) {
        setLado(lado);
        System.out.println("Mi nombre es: " + miNombre + " y mido " + this.lado);
    }
    
    /**
     * Método observador de la propiedad lado
     * @return int lado
     */
    public int getLado() {
        return lado;
    }
    
    public void setLado(int lado) {
        if(lado > 0 && lado < 101) {
            this.lado = lado;
        } else {
            System.out.println("Valor no válido");
        }
    }
    
    public void printArea() {
        System.out.println("El área es: " + calcularArea() + " cm");
    }
    
    public void printPerimetro() {
        System.out.println("El perímetro es: " + calcularPerimetro());
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4*lado;
    }

    @Override
    public int getTotalLados() {
        return 4;
    }
    
}
