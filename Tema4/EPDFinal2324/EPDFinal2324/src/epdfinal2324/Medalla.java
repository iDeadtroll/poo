
package epdfinal2324;

public class Medalla {
    private int tipo;
    private String disciplina;
    public static final int ORO = 1;
    public static final int PLATA = 2;
    public static final int BRONCE = 3;

    public Medalla(int tipo, String disciplina) {
        if (tipo < 1 || tipo > 3) {
            System.out.println("Tipo de medalla no validado. Valor por defecto asignado: 'Bronce'");
            this.tipo = 3;
        } else {
            this.tipo = tipo;
        }

        this.disciplina = disciplina.toUpperCase();
    }

    public String getTipoString() {
        String tipoMedalla = "";
        switch (this.tipo) {
            case 1:
                tipoMedalla = "ORO";
                break;
            case 2:
                tipoMedalla = "PLATA";
                break;
            case 3:
                tipoMedalla = "BRONCE";
                break;
        }
        return tipoMedalla;
    }

    @Override
    public String toString() {
        return this.getTipoString() + " en " + this.disciplina;
    }
}
