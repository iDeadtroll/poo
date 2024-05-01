/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epdfinal2324;

/**
 *
 * @author joni-
 */
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

    public String mostrarSistema(){
        String cadena = "## SISTEMA OLIMPIADAS ##\n\n";
                cadena += "** ATLETAS REGISTRADO **\n";
                for (int i = 0 ; i < contadorAtletas ; i++){
                    cadena += atletas[i] + "\n";
                }
                cadena += "** DEPORTES Y EVENTOS **\n";
                for (int i = 0 ; i < contadorDeportes ; i++){
                    cadena += deportes[i] + "\n";
                }

        return cadena;
    }
}
