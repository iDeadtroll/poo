
package epdfinal2324;

public class Deporte {
    private String nombre;
    private Evento[] eventos;
    private int contadorEventos;
    
    public Deporte(String nombre, int maxEventos){
	this.nombre = nombre.toUpperCase();
	this.eventos = new Evento[maxEventos];
    }
    
    public void añadirEvento(Evento evento){
        if (contadorEventos < eventos.length){
            eventos[contadorEventos] = evento;
            contadorEventos++;
        }else{
            System.out.println("Se ha alcanzado el máximo de eventos para este deporte");
        }
    }
    
    public String getNombre(){
	return nombre;
    }
    
    public String toString(){
    String cadena = "- DEPORTE: " + this.nombre + " - Lista de eventos:\n" ;
            for(int i = 0; i<contadorEventos; i++){
                cadena+=eventos[i] + "\n";
            }
	return cadena;
    }
}
