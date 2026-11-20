package javaapplication1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        
        System.out.print("Ingrese su carrera: ");
        String carrera = scanner.nextLine();
        
        System.out.print("Ingrese su estatura (en metros): ");
        double estatura = scanner.nextDouble();
        
        System.out.println("\n--- Datos Ingresados ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Carrera: " + carrera);
        System.out.println("Estatura: " + estatura + " m");
    }
}

