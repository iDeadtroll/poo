
package epdfinal2324;

public class SimulacionOlimpiadas {

    public static void main(String[] args) {
        Atleta at1= new Atleta("Jonathan Quishpe","ecuador", 21,"folleteo sin condóm, trio con dos chicas");
        SistemaOlimpiadas olimpiadas = new SistemaOlimpiadas(10, 10);
        Deporte deporte1 = new Deporte("Follar", 5);
        olimpiadas.añadirDeporte(deporte1);
        olimpiadas.registrarAtleta(at1);
        Evento event = new Evento("Folleteo","01/05/2024", 2);
        event.añadirAtleta(at1);
        deporte1.añadirEvento(event);
        olimpiadas.mostrarSistema();
    }
    
}
