package javaapplication1;
/**
 * @author Erick Abel Casamin Ramirez
 */
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese una calificación entre 0 y 10: ");
        double calificacion = scanner.nextDouble();
        
        if (calificacion >= 9 && calificacion <= 10) {
            System.out.println("Excelente");
        } else if (calificacion >= 8 && calificacion < 9) {
            System.out.println("Muy Bueno");
        } else if (calificacion >= 7 && calificacion < 8) {
            System.out.println("Bueno");
        } else if (calificacion >= 5 && calificacion < 7) {
            System.out.println("Regular");
        } else if (calificacion >= 0 && calificacion < 5) {
            System.out.println("Deficiente");
        } else {
            System.out.println("Calificación fuera del rango establecido (0 - 10).");
        }
    }
}
