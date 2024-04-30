
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

    public void setEdad(int edad) {
        if (edad < 0){
            System.err.println("Error: el valor 'edad' no puede ser negativa. Valor por defecto = 0");
            this.edad = 0;
        }else{
            this.edad = edad;
        }

    }

    @Override
    public String toString() {
	return nombre + " (" + pais + ")" + " - " + edad + " años";
    }
    
    
    
}
