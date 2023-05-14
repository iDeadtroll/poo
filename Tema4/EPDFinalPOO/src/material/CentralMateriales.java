
package material;

public class CentralMateriales {
    private static final int MAXMATERIALES = 50;
    private TablaSurf[] tablas;
    private int numTablas;
    private Neopreno[] trajes;
    private int numTrajes;

    public CentralMateriales() {
        this.tablas = new TablaSurf[MAXMATERIALES];
        this.numTablas = 0;
        this.trajes = new Neopreno[MAXMATERIALES];
        this.numTrajes = 0;
    }

    public void nuevaTabla(String marca, String tipo, int volumen, double talla, int construccion, double suplemento) {
        if (numTablas < MAXMATERIALES) {
            tablas[numTablas] = new TablaSurf(marca, tipo, volumen, talla, construccion, suplemento);
            numTablas++;
        } else {
            System.out.println("No se pueden añadir más tablas.");
        }
    }

    public void eliminaTabla(TablaSurf tabla) {
        for (int i = 0; i < numTablas; i++) {
            if (tablas[i].equals(tabla)) {
                for (int j = i; j < numTablas - 1; j++) {
                    tablas[j] = tablas[j + 1];
                }
                tablas[numTablas - 1] = null;
                numTablas--;
                break;
            }
        }
    }

    public TablaSurf getTabla(int index) {
        if (index >= 0 && index < numTablas) {
            return tablas[index];
        } else {
            return null;
        }
    }

    public String tablasToString() {
        Integer index = 0;
        for (TablaSurf tabla : tablas) {
        if (tabla != null){
                System.out.println("ID: " + index + "\t " + tabla.toString());
        }
            index ++;
        }
        
        return null;
    }
    
     public void nuevoTraje(String marca, String categoria, int talla, boolean mangasLargas, boolean piernasLargas, int cremallera, double suplemento) {
        if (numTrajes < MAXMATERIALES) {
            trajes[numTrajes] = new Neopreno(marca, categoria, talla, mangasLargas, piernasLargas, cremallera, suplemento);
            numTrajes++;
        } else {
            System.out.println("No se pueden añadir más trajes.");
        }
    }

    public void eliminaTraje(Neopreno traje) {
        for (int i = 0; i < numTrajes; i++) {
            if (trajes[i].equals(traje)) {
                for (int j = i; j < numTrajes - 1; j++) {
                    trajes[j] = trajes[j + 1];
                }
                trajes[numTrajes - 1] = null;
                numTrajes--;
                break;
            }
        }
    }

    public Neopreno getTraje(int index) {
        if (index >= 0 && index < numTrajes) {
            return trajes[index];
        } else {
            return null;
        }
    }

    public String trajesToString() {
        Integer index = 0;
        for (Neopreno traje : trajes) {
        if (traje != null){
                System.out.println("ID: " + index + "\t " + traje.toString());
        }
            index ++;
        }
        
        return null;
    }

    public int getNumTablas() {
        return numTablas;
    }

    public void setNumTablas(int numTablas) {
        this.numTablas = numTablas;
    }

    public TablaSurf[] getTablas() {
        return tablas;
    }

    public void setTablas(TablaSurf[] tablas) {
        this.tablas = tablas;
    }
    
}
