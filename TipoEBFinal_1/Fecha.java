import java.time.LocalDate;

public class Fecha implements Comparable{
    private int dia;
    private int mes;
    private int anio;

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String toString() {
        return dia + "/" + mes + "/" + anio;
    }

    public boolean equals(Object obj) {
        Fecha f = (Fecha) obj;
        if (this.dia == f.dia && this.mes == f.mes && this.anio == f.anio) {
            return true;
        } else {
            return false;
        }
    }

    public static Fecha hoy() {
        LocalDate currentDate = LocalDate.now();
        int dia = currentDate.getDayOfMonth();
        int mes = currentDate.getMonthValue();
        int anio = currentDate.getYear();
        return new Fecha(dia, mes, anio);
    }
    // Orden natural ascendente: por año, mes y día
    @Override
    public int compareTo(Object o){
        Fecha f = (Fecha) o;
        int cpm = this.anio - f.anio;
        if (cpm == 0){
            cpm = this.mes - f.mes;
            if (cpm == 0){
                cpm = this.dia - f.dia;
            }
        }
        return cpm;
    }

    // Orden natural descendente: por año, mes y día
    // @Override
    // public int compareTo(Object o){
    //     Fecha f = (Fecha) o;
    //     int cpm = f.anio - this.anio;
    //     if (cpm == 0){
    //         cpm = f.mes - this.mes;
    //         if (cpm == 0){
    //             cpm = f.dia - this.dia;
    //         }
    //     }
    //     return cpm;
    // }
    
}