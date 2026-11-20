package javaapplication1;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número entero para generar su tabla: ");
        int numero = scanner.nextInt();
        
        System.out.println("\n--- Tabla de multiplicar del " + numero + " ---");
        for (int i = 1; i <= 12; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}