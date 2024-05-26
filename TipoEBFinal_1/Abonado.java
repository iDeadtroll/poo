public class Abonado extends Persona{
    private int numeroAbonado;
    private Fecha fechaAlta, fechaBaja;
    private boolean activo;

    public Abonado(String n, String a, String d, int s) {
        super(n, a, d);
        this.numeroAbonado = s;
        this.fechaAlta = Fecha.hoy();
        this.fechaBaja = null;
        this.activo = true;
    }

    public void baja(Fecha fecha) {
        if (!this.isActivo()){
            System.out.println("El abonado ya está dado de baja");
        }
        else if (fecha.compareTo(fechaAlta) < 0){
            System.out.println("La fecha de baja no puede ser anterior a la fecha de alta");
        }
        else {
            this.activo = false;
            this.fechaBaja = fecha;
        }

    }

    public boolean isActivo() {
        return activo; 
    }

    public String toString() {
        return "#" + numeroAbonado + " - " +super.toString() 
        + (activo ? "(Fecha alta: " + fechaAlta : "(Fecha alta: " + fechaAlta + ", Fecha baja: " + fechaBaja + ")");
    }
    
}
