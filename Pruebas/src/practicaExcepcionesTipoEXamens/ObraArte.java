/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaExcepcionesTipoEXamens;

/**
 *
 * @author Deadtroll
 */
public class ObraArte {
    private String titulo;
    private String autor;
    private int anio;
    public ObraArte(String titulo, String autor, int anio){
        setTitulo(titulo);
        setAutor(autor);
        try{
        setAnio(anio);
        }
        catch (Exception e){
            System.out.println("ERROR: ");
            anio = 2023;
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnio() {
        return anio;
    }

    private void setAnio(int anio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setAnio throws Exception (int anio) {
        if(anio<2023){
        this.anio = anio;
        }
        else{
            throw new  AnioException("Anio no valido");
        }
    }
    public int antiguedad(int divisor){
        int ant = (2023-anio)/divisor;
        return ant;
    }
    
}
