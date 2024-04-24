
package epdfinal2324;

public class Persona {
    protected String nombre;
    protected String pais;
    protected int edad;
    
    public Persona(String nombre, String pais, int edad){
	this.nombre = nombre;
	this.pais = pais;
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
	this.edad = edad;
    }

    @Override
    public String toString() {
	return "Persona{" + "nombre=" + nombre + ", pais=" + pais + ", edad=" + edad + '}';
    }
    
    
    
}
