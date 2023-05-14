package problema3_ampliado;
//import problema3_ampliado_poo;
//import epd1.problemas.poo.Cuadrado;

import problema3_ampliado_poo.Cuadrado;
import problema3_ampliado_poo.IFigura;
import problema3_ampliado_poo.Triangulo;

//import epd1.problemas.poo.IFigura;
//import epd1.problemas.poo.Triangulo;

/**
 *
 * @author mamisho
 */
public class Problema3 {
    public static void main(String[] args) {
        Cuadrado c3 = new Cuadrado(3, "Cuadradito");
        
        // Acceso al prototipo de la clase EJEMPLO
        /*
        String classWithPackageName = c1.getClass().getName();
        String className = c1.getClass().getSimpleName();
        Field fields[] = c1.getClass().getDeclaredFields();
        System.out.println(classWithPackageName);
        System.out.println(className);
        System.out.println(fields[0].getName());
        */
        
        // Ejemplo de acceso al prototipo que está definido
        System.out.println("\n *************** C1 ***************");
        Cuadrado c1 = new Cuadrado();
        System.out.println(c1.getLado());
        c1.setLado(101);
        System.out.println(c1.getLado());
        
        
        
        System.out.println("\n *************** C2 ***************");
        Cuadrado c2 = new Cuadrado(5);
        c2.printArea();
        c2.printPerimetro();
        /*
        try {
            c2.calcularArea();
        } catch(UnsupportedOperationException ex) {
            System.out.println("No se ha implementado");
        }*/
        System.out.println(c2.calcularArea());
        
        
        System.out.println("\n *************** C4 ***************");
        Cuadrado c4 = new Cuadrado(-20);
        System.out.println(c4.getLado());
        
        System.out.println("\n *************** C5 ***************");
        Cuadrado c5 = new Cuadrado(-20, "Mi otro Cuadradito");
        System.out.println(c5.getLado());
        
        System.out.println("\n *************** C6 ***************");
        IFigura c6 = new Cuadrado(6);
        System.out.println(c6.calcularArea());
        
        if(c6.getTotalLados() == 4) {
            System.out.println("Soy un Cuadrado");
        }
        
        
        System.out.println("---------------TRIANGULO----------------");
        System.out.println("\n *************** T1 ***************");
        Triangulo t1 = new Triangulo(-1, -5);
        
        System.out.println("\n *************** T2 ***************");
        Triangulo t2 = new Triangulo(1, 2);
        System.out.println(t2.getBase());
        System.out.println(t2.getAltura());
        
        System.out.println("\n *************** T3 ***************");
        Triangulo t3 = new Triangulo(1, 2);
        t3.printPerimetro();
        t3.printArea();
        
        System.out.println("\n *************** T4 ***************");
        IFigura t4 = new Triangulo(5,8);
        System.out.println(t4.calcularArea());
        if(t4.getTotalLados() == 3) {
            System.out.println("Soy un triangulo");
        }
        
        System.out.println("\n *************** CASTINGS ***************");
        IFigura f2 = new Cuadrado(10);
        IFigura f3 = new Triangulo(1,2);
        
        System.out.println(f2.getTotalLados());
        System.out.println(f2.calcularArea());
        f2 = f3;
        System.out.println(f2.getTotalLados());
        System.out.println(f2.calcularArea());
        System.out.println(f3.getTotalLados());
        System.out.println(f3.calcularArea());
        
        if (t2 == t3){
            System.out.println("Son iguales");
        }
        else{
            System.out.println("No son iguales");
        }
    }
}
