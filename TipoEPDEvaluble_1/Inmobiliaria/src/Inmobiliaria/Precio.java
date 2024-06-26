package Inmobiliaria;

/**
 *
 * @author developer
 */
public class Precio {

    private int parteEntera;
    private int parteDecimal;
    private String divisa;

    public Precio(int parteEntera, int parteDecimal, String divisa) {
        setParteEntera(parteEntera);
        setParteDecimal(parteDecimal);
        setDivisa(divisa);
    }

    public String getDivisa() {
        return divisa;
    }

    public void setDivisa(String divisa) {
        this.divisa = divisa;
    }

    public int getParteDecimal() {
        return parteDecimal;
    }

    public void setParteDecimal(int parteDecimal) {
        if (parteDecimal < 0) {
            System.out.println("ERROR: la parte decimal no puede ser negativa");
            this.parteDecimal = 0;
        }else if(parteDecimal > 99) {
            System.out.println("ERROR: la parte decimal no puede ser mayor a 99");
            this.parteDecimal = 0;
        }
        else {
            this.parteDecimal = parteDecimal;
        }
    }

    public int getParteEntera() {
        return parteEntera;
    }

    public void setParteEntera(int parteEntera) {
        if (parteEntera < 0) {
            this.parteEntera = 0;
        } else {
            this.parteEntera = parteEntera;
        }
    }

    @Override
    public boolean equals(Object obj) {
        Precio p = (Precio) obj;
        return this.parteEntera == p.getParteEntera()
                && this.parteDecimal == p.getParteDecimal()
                && this.divisa.equals(p.getDivisa());
    }

    @Override
    public String toString() {
        return this.parteEntera + "," + this.parteDecimal + " " + this.divisa;
    }
}
