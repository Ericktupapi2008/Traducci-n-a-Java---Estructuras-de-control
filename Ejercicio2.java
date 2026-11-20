package javaapplication1;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número entero: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Ingrese el segundo número entero: ");
        int num2 = scanner.nextInt();
        
        System.out.println("\n--- Resultados ---");
        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicación: " + (num1 * num2));
        
        if (num2 != 0) {
            System.out.println("División: " + ((double) num1 / num2));
            System.out.println("Residuo: " + (num1 % num2));
        } else {
            System.out.println("División: No se puede dividir entre cero.");
            System.out.println("Residuo: No definido (división por cero).");
        }
    }
}