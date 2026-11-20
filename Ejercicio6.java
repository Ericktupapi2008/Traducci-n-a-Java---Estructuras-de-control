package javaapplication1;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese un número entre 1 y 7: ");
        int dia = scanner.nextInt();
        
        switch (dia) {
            case 1:
                System.out.println("1. Lunes");
                break;
            case 2:
                System.out.println("2. Martes");
                break;
            case 3:
                System.out.println("3. Miércoles");
                break;
            case 4:
                System.out.println("4. Jueves");
                break;
            case 5:
                System.out.println("5. Viernes");
                break;
            case 6:
                System.out.println("6. Sábado");
                break;
            case 7:
                System.out.println("7. Domingo");
                break;
            default:
                System.out.println("Número inválido. Debe estar entre 1 y 7.");
                break;
        }
    }
}