/*
 * Un sistema requiere que un usuario ingrese su nombre de usuario y contraseña. Si el nombre 
 * es 'admin' y la contraseña es 'segura123', se concede el acceso; de lo contrario, se niega.
 * Realice una función que retorna un valor booleano en el caso que las credenciales estén correctas.
 */

/*
 * PASOS: 
 * 1. Crear una nueva clase: Se hace un archivo llamado AccesoSeguroApp.java
 * 2. Levantar un método MAIN para que sea un archivo ejecutable
 * 3. Declarar una función estática que retorna un BOOLEAN llamada isCredencialesCorrectas()
 * Que recibe 2 argumentos: username y password que son de tipo de dato String
 * 4. Hacer una instancia de Scanner.
 * 5. Interactuar con el usuario, mostrando mensaje para que ingrese credenciales
 * 6. Almacenar user y pass ingresadas por el usuario
 * 7. Invocamos a la función, entregando como parámetros user y pass. Se invocará desde un
 * mensaje al usuario.
 * 8. En la función:
 * Comparar los argumentos recibidos con 'admin' y 'segura123', en caso de ser cierto
 * Retorna verdadero; caso contrario: Falso.
 */

import java.util.Scanner;

public class AccesoSeguroApp {
    public static void main(String[] args) {
        // variables
        String user, pass;
        // lectura de datos
        Scanner leer = new Scanner(System.in); // Create a Scanner object
        System.out.println("=== CONTROL DE ACCESO ===");
        System.out.print("Ingrese Usuario: ");
        user = leer.nextLine();
        System.out.print("Ingrese Contraseña: ");
        pass = leer.nextLine();

        System.out.println("¿Las credenciales son correctas?: " + isCredencialesCorrectas(user, pass));
    }

    public static boolean isCredencialesCorrectas(String username, String password) {
        // System.out.println("User: " + username);
        // System.out.println("Pass: " + password);
        // if (username == "admin" && password == "segura123") {
        // return true;
        // }
        //op1: minusculas
        if (username.toLowerCase().equals("admin") && password.equals("segura123")) {
            // pasamos todo el username a minusculas y comparamos minusculas con minusculas
            return true;
        }
        //op2: mayusculas
        // if (username.toUpperCase().equals("ADMIN") && password.equals("segura123")) {
        //     // pasamos todo el username a mayúsculas y comparamos mayúsculas con mayúsculas
        //     return true;
        // }
        return false;
    }
}
