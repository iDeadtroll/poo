
package examenPooCorregido;

public class Principal {
    public static void main(String[] args){
        Fecha fechaActual = Fecha.hoy();
        System.out.println("La fecha actual es: " + fechaActual.toString());
        
        Gimnasio g = new Gimnasio();
        try {
            g.anadirAbonado("Carmen", "Lozano Alonso", "22222222B");
            g.anadirAbonado(new Persona("Luis", "Ramirez Lopez", "11111111A"));
            g.anadirAbonado("Antonia", "Martinez Garcia", "33333333C");
            g.anadirAbonado("Carmen", "Lozano Alonso", "22222222B");
        } catch (AbonadoException e) {
            System.out.println(e.getMessage());
        }
        g.eliminarAbonado(2, new Fecha(28, 5, 2023));
        g.ordenarAbonados(new ComparadorAntiguedadAbonado());
        System.out.println(g);
    }
}
