package Eje2;

import java.util.Scanner;

public class AlmacenarLineas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de líneas a almacenar: ");
        int cantidadLineas = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        String[] vector = new String[cantidadLineas];

        for (int i = 0; i < cantidadLineas; i++) {
            System.out.print("Ingrese la línea " + (i + 1) + ": ");
            vector[i] = scanner.nextLine();
        }

        System.out.println("Las líneas almacenadas en el vector son:");
        for (int i = 0; i < cantidadLineas; i++) {
            System.out.println("Línea " + (i + 1) + ": " + vector[i]);
        }

        scanner.close();
    }
}
