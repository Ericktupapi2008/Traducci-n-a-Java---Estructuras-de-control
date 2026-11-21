package javaapplication1;
/**
 * @author Erick Abel Casamin Ramirez
 */
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantidad = 0;
        double suma = 0;
        int numero;
        
        System.out.println("Ingrese números positivos (ingrese un número negativo para terminar):");
        
        while (true) {
            numero = scanner.nextInt();
            if (numero < 0) {
                break; // Rompe el ciclo si el número es negativo
            }
            suma= suma+numero;
            cantidad++;
        }
        
        System.out.println("\n--- Resultados ---");
        System.out.println("Cantidad de números ingresados: " + cantidad);
        System.out.println("Suma total: " + suma);
    }
}
