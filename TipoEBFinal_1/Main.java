public class Main {

    public static void main(String[] args) throws AbonadoException{

        Gimnasio g = new Gimnasio();
        try {
            g.añadirAbonado("Juan", "García", "12345678A");
            g.añadirAbonado("Pedro", "Gómez", "87654321B");
            g.añadirAbonado("Ana", "Martínez", "12345678A");
        } catch (AbonadoException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(g);
        g.eliminarAbonado(1, new Fecha(1, 1, 2025));
        g.ordenarAbonados(new ComparadorAntiguedadAbonado());
        System.out.println(g);
    }

}
