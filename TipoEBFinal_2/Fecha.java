package TipoEBFinal_2;

import java.time.LocalDateTime;

public class Fecha implements Comparable {
    private int dia;
    private int mes;
    private int anio;
    private int hora;
    private int minuto;

    public Fecha(int dia, int mes, int anio, int hora, int minuto) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.hora = hora;
        this.minuto = minuto;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
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
        return dia + "/" + mes + "/" + anio + " " + hora + ":" + minuto;
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
        LocalDateTime currentDate = LocalDateTime.now();
        int dia = currentDate.getDayOfMonth();
        int mes = currentDate.getMonthValue();
        int anio = currentDate.getYear();
        int hora = currentDate.getHour();
        int minuto = currentDate.getMinute();
        return new Fecha(dia, mes, anio, hora, minuto);
    }

    // Orden natural ascendente: por año, mes y día
    @Override
    public int compareTo(Object o) {
        Fecha f = (Fecha) o;
        int cpm = this.anio - f.anio;
        if (cpm == 0) {
            cpm = this.mes - f.mes;
            if (cpm == 0) {
                cpm = this.dia - f.dia;
                if (cpm == 0) {
                    cpm = this.hora - f.hora;
                    if (cpm == 0) {
                        cpm = this.minuto - f.minuto;
                    }
                }
            }
        }
        return cpm;
    }


    // Orden natural descendente: por año, mes y día
    // @Override
    // public int compareTo(Object o){
    // Fecha f = (Fecha) o;
    // int cpm = f.anio - this.anio;
    // if (cpm == 0){
    // cpm = f.mes - this.mes;
    // if (cpm == 0){
    // cpm = f.dia - this.dia;
    // }
    // }
    // return cpm;
    // }

}