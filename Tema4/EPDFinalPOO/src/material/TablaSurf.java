
package material;

import java.util.Objects;

public class TablaSurf implements IReservable {

    private String marca;
    private String tipo;
    private int volumen;
    private double talla;
    private int construccion;

    public static final int POLIESTER = 1;
    public static final int EPOXY = 2;
    public static final int SOFTBOARD = 3;
    public static final int HINCHABLE = 4;
    public static final int INDETERMINADA = 5;
    private static int[] precios = {10, 15, 25, 40, 70, 90};
    private double suplemento;

    public TablaSurf(String marca, String tipo, int volumen, double talla, int construccion, double suplemento) {
        this.marca = marca;
        this.tipo = tipo;
        this.volumen = volumen;
        this.talla = talla;
        this.construccion = construccion;
        this.suplemento = suplemento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public static int[] getPrecios() {
        return precios;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getVolumen() {

        return volumen;
    }

    public void setVolumen(int volumen) {
        if (volumen < 10) {
            volumen = 10;
        }
        if (volumen > 100) {
            volumen = 100;
        }
        this.volumen = volumen;

    }

    public double getTalla() {
        return talla;
    }

    public void setTalla(double talla) {
        this.talla = talla;
    }

    public int getConstruccion() {
        return construccion;
    }

    public void setConstruccion(int construccion) {
        if (construccion >= POLIESTER && construccion <= HINCHABLE) {
            this.construccion = construccion;
        } else {
            this.construccion = INDETERMINADA;
        }
        switch (construccion) {
            case POLIESTER:
            case EPOXY:
            case SOFTBOARD:
            case HINCHABLE:
                this.construccion = construccion;
                break;
            default:
                this.construccion = INDETERMINADA;
                break;
        }
    }

    public double getSuplemento() {
        return suplemento;
    }

    public void setSuplemento(double suplemento) {
        if (suplemento < 0) {
            this.suplemento = 0;
        } else if (suplemento > 1) {
            this.suplemento = 1;
        } else {
            this.suplemento = suplemento;
        }
    }

    @Override
    public String getDenominacion() {
        return marca + ", " + tipo;
    }

    @Override
    public String getObservaciones() {

        String construccionStr = "";

        switch (construccion) {
            case 1:
                construccionStr = "POLIESTER";
                break;
            case 2:
                construccionStr = "EPOXY";
                break;
            case 3:
                construccionStr = "SOFTBOARD";
                break;
            case 4:
                construccionStr = "HINCHABLE";
                break;
            case 5:
                construccionStr = "INDETERMINADA";
                break;
            default:
                break;
        }
        return construccionStr;
    }

    @Override
    public String toString() {

        return marca + ", " + tipo + " - Volumen: " + volumen + ", Talla: " + talla + ", Construcción: " + construccion;
    }

    @Override
    public double getPrecio(int opcionTiempo) {
      return precios[opcionTiempo] * (1 + suplemento);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TablaSurf other = (TablaSurf) obj;
        if (this.volumen != other.volumen) {
            return false;
        }
        if (Double.doubleToLongBits(this.talla) != Double.doubleToLongBits(other.talla)) {
            return false;
        }
        if (this.construccion != other.construccion) {
            return false;
        }
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        return true;
    }


}
