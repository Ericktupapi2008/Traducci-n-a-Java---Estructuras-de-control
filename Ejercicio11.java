package javaapplication1;
/**
 * @author Erick Abel Casamin Ramirez
 */
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mayor = 0;
        int menor = 0;
        
        System.out.println("Ingrese 10 números:");
        for (int i = 1; i <= 10; i++) {
            System.out.print("Número " + i + ": ");
            int numero = scanner.nextInt();
            
            if (i == 1) {
                mayor = numero;
                menor = numero;
            } else {
                if (numero > mayor) {
                    mayor = numero;
                }
                if (numero < menor) {
                    menor = numero;
                }
            }
        }
        
        System.out.println("\n--- Resultados ---");
        System.out.println("Número mayor: " + mayor);
        System.out.println("Número menor: " + menor);
    }
}
