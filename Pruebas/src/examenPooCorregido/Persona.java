
package examenPooCorregido;

import java.util.Objects;


public class Persona {
    private String nombre;
    private String apellido;
    private String dni;
    
    public Persona(String n, String a, String d){
        this.nombre = n;
        this.apellido = a;
        this.dni = d;
    }

    public String getNombre(){
        return nombre;
    }
    
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getApellidos(){
        return apellido;
    }
    
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    public String getDni(){
        return dni;
    }
    
    public void setDni(String dni){
        this.dni = dni;
    }

    @Override
    public String toString() {
        return apellido + ", " + nombre + " - " + dni;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        return true;
    }
    
}
