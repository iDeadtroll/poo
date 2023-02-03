
package prueba;

public class P1 {
    public static void main (String[] args){
        // Convertir una cadena de caracteres String en un tipo primitivo mumerico entero
        
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        
        // Convertir una cadena de caracteres String en un tipo primitivo numerico decimal
        
        float r = Float.parseFloat(args[0]);
        float n = Float.parseFloat(args[1]);
        
        // Convertir una cadena de caracteres String en un tipo primitivo numerico decimal grande
        
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        
        // Convertir una cadena de caracteres Strins en un tipo primitivo numerico entero grande
        
        long z = Long.parseLong(args[0]);
        long t = Long.parseLong(args[1]);
        
        int sumaEntero = a + b;
        System.out.println("La suma de " + args[0] + " y " + args[1] + " es igual a: " + sumaEntero);
        
        float sumaFloat = r + n;
        System.out.println("La suma de " + args[0] + " y " + args[1] + " con 1 decimal es igual a: " + sumaFloat);
        
        double sumaDouble = x + y;
        System.out.println("La suma de " + args[0] + " y " + args[1] + " con 1 decimal es igual a: " + sumaDouble);
        
        long sumaLong = z + t;
        System.out.println("La suma de " + args[0] + " y " + args[1] + " es igual a: " + sumaLong);
        /*
        Integer suma = new Integer(2); 
       */
    }
    
}
