
package epdfinal2324;

public class SimulacionOlimpiadas {

    public static void main(String[] args) {
        Atleta at1= new Atleta("Jonathan Quishpe","ecuador", 21,"folleteo sin condóm, trio con dos chicas");
        System.out.println(at1);
        Medalla m1 = new Medalla(1,"Folleteo sin condóm");
        at1.añadirMedalla(m1);
        System.out.println(at1);
        Medalla m2 = new Medalla(2,"trio con dos chicas");
        at1.añadirMedalla(m2);
        System.out.println(at1);
    }
    
}
