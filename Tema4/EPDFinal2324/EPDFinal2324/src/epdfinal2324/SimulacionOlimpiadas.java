
package epdfinal2324;

public class SimulacionOlimpiadas {

        public static void main(String[] args) {

                SistemaOlimpiadas sistema = new SistemaOlimpiadas(20, 5);

                // Crear algunos deportes
                Deporte natacion = new Deporte("Natación", 3);
                Deporte tenis = new Deporte("Tenis", 3);

                // Añadir deportes al sistema
                sistema.añadirDeporte(natacion);
                sistema.añadirDeporte(tenis);

                // Crear eventos
                Evento eventoTenis1 = new Evento("1ª Semifinal Individual", "25/07/2024", 10);
                Evento eventoTenis2 = new Evento("2ª Semifinal Individual", "25/07/2024", 10);
                Evento eventoTenis3 = new Evento("Final Individual", "28/07/2024", 10);
                Evento eventoNatacion = new Evento("100m Libres Natación", "24/07/2024", 10);

                // Añadir eventos a los deportes
                natacion.añadirEvento(eventoNatacion);
                tenis.añadirEvento(eventoTenis1);
                tenis.añadirEvento(eventoTenis2);
                tenis.añadirEvento(eventoTenis3);

                // Crear atletas
                Atleta atletaNat1 = new Atleta("Jenny Thompson", "USA", 31, "Natación individual");
                Atleta atletaNat2 = new Atleta("Laure Manaudou", "Francia", 25, "Natación individual");
                Atleta atletaNat3 = new Atleta("Mireia Belmonte", "USA", 34, "Natación individual");
                Atleta atletaTen1 = new Atleta("Rafael Nadal", "España", 37, "Tenis individual, Tenis dobles");
                Atleta atletaTen2 = new Atleta("Novak Djokivik", "Servia", 36, "Tenis individual");
                Atleta atletaTen3 = new Atleta("Carlos Alcaraz", "España", 20, "Tenis individual, Tenis dobles");
                Atleta atletaTen4 = new Atleta("Jannik Sinner", "Italia", 22, "Tenis individual, Tenis dobles mixto");

                // Registrar atletas en el sistema
                sistema.registrarAtleta(atletaNat1);
                sistema.registrarAtleta(atletaNat2);
                sistema.registrarAtleta(atletaNat3);
                sistema.registrarAtleta(atletaTen1);
                sistema.registrarAtleta(atletaTen2);
                sistema.registrarAtleta(atletaTen3);
                sistema.registrarAtleta(atletaTen4);

                // Añadir atletas a eventos
                eventoNatacion.añadirAtleta(atletaNat1);
                eventoNatacion.añadirAtleta(atletaNat2);
                eventoNatacion.añadirAtleta(atletaNat3);
                eventoTenis1.añadirAtleta(atletaTen1);
                eventoTenis1.añadirAtleta(atletaTen2);
                eventoTenis2.añadirAtleta(atletaTen3);
                eventoTenis2.añadirAtleta(atletaTen4);

                // Simular resultados y añadir medallas
                atletaNat1.añadirMedalla(new Medalla(Medalla.ORO, "100m Mariposa"));
                atletaTen1.añadirMedalla(new Medalla(Medalla.PLATA, "Dobles Mixto"));
                atletaTen1.añadirMedalla(new Medalla(Medalla.ORO, "Tenis Individual"));

                // Mostrar el sistema

                sistema.mostrarSistema();
                // sistema.medallasTotales();
        }

}
