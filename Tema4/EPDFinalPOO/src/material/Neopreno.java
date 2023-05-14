
package material;

import java.util.Objects;

public class Neopreno implements IReservable{

    private String marca;
    private String categoria;
    private int talla;
    private boolean mangasLargas;
    private boolean piernasLargas;
    private int cremallera;
    public static final int DELANTERA = 0;
    public static final int TRASERA = 0;
    public static final int SIN = 0;
    private int [] precios;
    private double suplemento;

    public Neopreno(String marca, String categoria, int talla, boolean mangasLargas, boolean piernasLargas, int cremallera, double suplemento) {
        this.marca = marca;
        this.categoria = categoria;
        this.talla = talla;
        this.mangasLargas = mangasLargas;
        this.piernasLargas = piernasLargas;
        this.cremallera = cremallera;
        this.suplemento = suplemento;
    }

    
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public boolean isMangasLargas() {
        return mangasLargas;
    }

    public void setMangasLargas(boolean mangasLargas) {
        this.mangasLargas = mangasLargas;
    }

    public boolean isPiernasLargas() {
        return piernasLargas;
    }

    public void setPiernasLargas(boolean piernasLargas) {
        this.piernasLargas = piernasLargas;
    }

    public int getCremallera() {
        return cremallera;
    }

    public void setCremallera(int cremallera) {
        this.cremallera = cremallera;
    }

    public static int[] getPrecios() {
        return null;
    }

    public void setPrecios(int[] precios) {
        this.precios = precios;
    }

    public double getSuplemento() {
        return suplemento;
    }

    public void setSuplemento(double suplemento) {
        this.suplemento = suplemento;
    }

     @Override
     public String toString(){
         return getDenominacion() + " - " + getObservaciones();
     }
    
    
    @Override
    public String getDenominacion() {
        return marca + ", " + categoria;
    }

    public String getObservaciones() {
        String observaciones = "talla: " + talla + ", ";
        observaciones += (mangasLargas ? "mangas largas" : "mangas cortas") + ", ";
        observaciones += (piernasLargas ? "piernas largas" : "piernas cortas") + ", ";
        
        switch (cremallera) {
            case 1:
                observaciones += "con cremallera delantera";
                break;
            case 2:
                observaciones += "con cremallera trasera";
                break;
            case 3:
                observaciones += "sin cremallera";
                break;    
            default:
                break;    
        }
        
        return observaciones; 
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
        final Neopreno other = (Neopreno) obj;
        if (this.talla != other.talla) {
            return false;
        }
        if (this.mangasLargas != other.mangasLargas) {
            return false;
        }
        if (this.piernasLargas != other.piernasLargas) {
            return false;
        }
        if (this.cremallera != other.cremallera) {
            return false;
        }
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        if (!Objects.equals(this.categoria, other.categoria)) {
            return false;
        }
        return true;
    }
    
    
}
