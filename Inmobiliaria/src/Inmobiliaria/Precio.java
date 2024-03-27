
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
        this.parteDecimal = parteDecimal;
    }

    public int getParteEntera() {
        return parteEntera;
    }

    public void setParteEntera(int parteEntera) {
        this.parteEntera = parteEntera;
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
