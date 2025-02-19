package generarnumerosaleatorios;

import java.util.Scanner;
import java.util.Random;

public class GenerarNumerosAleatorios {
    
    // Función para generar una secuencia de números aleatorios en un rango dado
    public static int[] generarNumeros(int rangoMin, int rangoMax, int cantidad) {
        Random rand = new Random();
        int[] secuencia = new int[cantidad];
        
        for (int i = 0; i < cantidad; i++) {
            secuencia[i] = rand.nextInt(rangoMax - rangoMin + 1) + rangoMin; // Genera un número dentro del rango
        }
        
        return secuencia;
    }
    
    // Función para calcular el promedio de una secuencia de números
    public static double calcularPromedio(int[] secuencia) {
        int suma = 0;
        
        for (int num : secuencia) {
            suma += num;
        }
        
        return (double) suma / secuencia.length;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario los rangos y cantidad de números
        System.out.println("Ingrese el valor mínimo del primer rango:");
        int min1 = scanner.nextInt();
        System.out.println("Ingrese el valor máximo del primer rango:");
        int max1 = scanner.nextInt();
        
        System.out.println("Ingrese el valor mínimo del segundo rango:");
        int min2 = scanner.nextInt();
        System.out.println("Ingrese el valor máximo del segundo rango:");
        int max2 = scanner.nextInt();
        
        System.out.println("¿Cuántos números aleatorios desea generar en cada rango?");
        int cantidad = scanner.nextInt();
        
        // Generar las secuencias de números aleatorios
        int[] secuencia1 = generarNumeros(min1, max1, cantidad);
        int[] secuencia2 = generarNumeros(min2, max2, cantidad);
        
        // Calcular los promedios
        double promedio1 = calcularPromedio(secuencia1);
        double promedio2 = calcularPromedio(secuencia2);
        
        // Mostrar los resultados
        System.out.println("\nSecuencia 1: ");
        for (int num : secuencia1) {
            System.out.print(num + " ");
        }
        System.out.println("\nPromedio de la secuencia 1: " + promedio1);
        
        System.out.println("\nSecuencia 2: ");
        for (int num : secuencia2) {
            System.out.print(num + " ");
        }
        System.out.println("\nPromedio de la secuencia 2: " + promedio2);
        
        scanner.close();
    }
}

