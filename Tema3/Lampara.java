package Tema3;

public class Lampara implements IPotenciometro {
    private int potencia;
    private boolean status;
    private String marca;

    public Lampara(){
        this.potencia = 0;
        this.status = false;
        this.marca = "Blan-k";
    }

    public Lampara(int potencia){
        this.potencia = potencia;
    
    }

    public void aumentraPotencia() {

    }

    public void disminuirPotencia() {

    }

    public void apagar() {

    }

    public void encender() {

    }

    public void imprimir() {

    }

    public String toString(){
        return "Datos: " + potencia ;
    }
}
