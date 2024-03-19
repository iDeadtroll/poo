package Ejemplo2;

public class Principal {
    public static void main(String[] args) throws Exception {
        Persona p1 = new Persona("María", "Pérez López", 25);
        Persona p2 = new Persona("Antonio", "García Gil", 22);
        Persona p3 = p1;
        Persona copiaP1 = (Persona) p1.clone();
        Persona p4 = new Persona("Antonio", "García Gil", 22);
        System.out.println("Persona 1: " + p1);
        System.out.println("Persona 1: " + p1.getNombre() + " " + p1.getApellidos() + " (" + p1.getEdad() + ")");
        System.out.println("Persona 2: " + p1.toString());
        // Comparación Identidad --> EJERCICIO: VER TODAS LAS POSIBILIDADES con p1 y p3
        if (p2 == p4)

            System.out.println("Son la misma persona (mismo objeto)");

        else

            System.out.println("Son distintos objetos de tipo Persona");
        // Comparación de igualdad --> EJERCICIO: VER TODAS LAS POSIBILIDADES con p1 y
        // p3
        if (p2.equals(p4))

            System.out.println("Son Personas iguales, aunque podrían ser distintos objetos");

        else

            System.out.println("Son Personas distintas, y por tanto también distintos objetos");

    }
}
