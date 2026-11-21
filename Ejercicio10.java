package javaapplication1;
/**
 * @author Erick Abel Casamin Ramirez
 */
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        
        System.out.println("Ingrese 10 números enteros:");
        for (int i = 1; i <= 10; i++) {
            System.out.print("Número " + i + ": ");
            int numero = scanner.nextInt();
            suma += numero;
        }
        
        double promedio = (double) suma / 10;
        
        System.out.println("\n--- Resultados ---");
        System.out.println("Suma total: " + suma);
        System.out.println("Promedio: " + promedio);
    }
}
