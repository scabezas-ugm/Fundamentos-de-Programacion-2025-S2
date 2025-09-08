import java.util.Scanner;

public class UserApp {

    public static void main(String[] args) {
        // variables
        User credenciales = new User();
        // lectura de datos
        Scanner leer = new Scanner(System.in); // Create a Scanner object
        System.out.println("=== CONTROL DE ACCESO ===");
        System.out.print("Ingrese Usuario: ");
        credenciales.setUsername(leer.nextLine());
        System.out.print("Ingrese Contraseña: ");
        credenciales.setPassword(leer.nextLine());

        System.out.println("¿Las credenciales son correctas?: " + credenciales.isCorrectas(credenciales));

    }
    
}
