package javaapplication1;
/**
 * @author Erick Abel Casamin Ramirez
 */
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;
        
        do {
            System.out.print("Ingrese la contraseña: ");
            password = scanner.nextLine();
            
            if (!password.equals("java2026")) {
                System.out.println("Contraseña incorrecta. Intente nuevamente.");
            }
        } while (!password.equals("java2026"));
        
        System.out.println("Acceso concedido.");
    }
}
