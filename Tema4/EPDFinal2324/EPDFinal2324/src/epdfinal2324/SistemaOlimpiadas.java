
package epdfinal2324;

import java.util.Arrays;

public class SistemaOlimpiadas {
    private Atleta[] atletas;
    private Deporte[] deportes;
    private int contadorAtletas;
    private int contadorDeportes;
    
    public SistemaOlimpiadas(int maxAtletas, int maxDeportes){
	this.atletas = new Atleta[maxAtletas];
	this.deportes = new Deporte[maxDeportes];
    }
    
    public void registrarAtleta(Atleta atleta){
        if (contadorAtletas < atletas.length){
            atletas[contadorAtletas]= atleta;
            contadorAtletas++;
        }else{
            System.out.println("Se ha alcanzado el máximo de atletas");
        }
    }
    
    public void añadirDeporte(Deporte deporte){
        if (contadorDeportes < deportes.length){
            deportes[contadorDeportes]= deporte;
            contadorDeportes++;
        }else{
            System.out.println("Se ha alcanzado el máximo de deportes");
        }
    }

    public void medallasTotales(String tipoMedalla){
        String[] medallasPorAtleta = new String[contadorAtletas];
        for (int i = 0; i < contadorAtletas; i++){
            medallasPorAtleta[i] = this.atletas[i].getNombre() + ", " + this.atletas[i].totalMedallas(tipoMedalla) + " medallas " + tipoMedalla;
        }
        for (String result: medallasPorAtleta){
            System.out.println(result);
        }
    }

    public void medallasTotales(){
        String[] medallasPorAtleta = new String[contadorAtletas];
        for (int i = 0; i < contadorAtletas; i++){
            medallasPorAtleta[i] = this.atletas[i].getNombre() + ", " + this.atletas[i].totalMedallas();
        }
        for (String result: medallasPorAtleta){
            System.out.println(result);
        }
    }

    public void listarAtletasAlfabeticamente() {
        Arrays.sort(this.atletas, 0, contadorAtletas);
        for (Atleta atleta : this.atletas) {
            if (atleta != null) {
                System.out.println(atleta.getNombre());
            }
        }
    }

    public void listarAtletasPorEdad() {
        AtletaComparatorEdad comparator = new AtletaComparatorEdad();
        Arrays.sort(this.atletas, 0, contadorAtletas, comparator);
        for (Atleta atleta : this.atletas) {
            if (atleta != null) {
                System.out.println(atleta.getNombre() + " - " + atleta.getEdad());
            }
        }
    }

    public void listarAtletasPorPaisEdad() {
        AtletaComparatorPaisEdad comparator = new AtletaComparatorPaisEdad();
        Arrays.sort(this.atletas, 0, contadorAtletas, comparator);
        for (Atleta atleta : this.atletas) {
            if (atleta != null) {
                System.out.println(atleta.getNombre() + " - " + atleta.getPais() + " - " + atleta.getEdad());
            }
        }
    }
    

    public void mostrarSistema(){
        String cadena = "## SISTEMA OLIMPIADAS ##\n\n";
                cadena += "** ATLETAS REGISTRADOS **\n";
                for (int i = 0 ; i < contadorAtletas ; i++){
                    cadena += atletas[i] + "\n";
                }
                cadena += "\n** DEPORTES Y EVENTOS **\n";
                for (int i = 0 ; i < contadorDeportes ; i++){
                    cadena += deportes[i] + "\n";
                }

        System.out.println(cadena);
    }
}
