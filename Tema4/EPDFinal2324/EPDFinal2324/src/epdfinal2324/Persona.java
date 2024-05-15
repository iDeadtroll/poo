
package epdfinal2324;

public class Persona {
    protected String nombre;
    protected String pais;
    protected int edad;
    
    public Persona(String nombre, String pais, int edad){
	this.nombre = nombre;
	this.pais = pais.toUpperCase();
	this.edad = edad;
    }

    public String getNombre() {
	return nombre;
    }

    public String getPais() {
	return pais;
    }

    public int getEdad() {
	return edad;
    }

    public void setEdad(int edad) throws EdadInvalidaException { 
        if (edad < 0){
            throw new EdadInvalidaException("Error: el valor 'edad' no puede ser negativo."); 
        } else {
            this.edad = edad;
        }
    }

    @Override
    public String toString() {
	return nombre + " (" + pais + ")" + " - " + edad + " años";
    }
    
    
    
}
