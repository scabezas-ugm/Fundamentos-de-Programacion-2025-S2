//github.com/scabezas-ugm
import java.util.Scanner; // Biblioteca, que contiene métodos y funciones
// que permiten leer datos desde la consola (terminal). Permite interactuar
// con el usuario.

public class NotasApp { // La clase del archivo, debe ser el mismo nombre
    // del archivo, si es notasapp.java, entonces la clase se debería
    // llamar: notasapp

    public static void main(String[] args) { // Método (void) principal (main),
        // hace que una clase, sea EJECUTABLE.

        // Supongamos 3 notas, debemos calcular el promedio
        float n1, n2, n3, promedio;
        
        // Metodo de entrada de datos
        Scanner leer = new Scanner(System.in); // Create a Scanner object
        // - Scanner: Clase, puede tener métodos y funciones
        // - leer: instancia de la clase (mi "variable"), es un tipo de dato
        // abstracto. Es lo que ocuparé para leer de la consola / terminal
        // - new: aca indicamos que es una nueva instancia, se reserva
        // el espacio en memoria para poder ser utilizada.
        // - System.in: argumento o parámetro para construir el Objeto

        System.out.print("Ingrese Nota1: "); // Mostrar mensajes
        // al usuario por la consola / terminal
        n1 = leer.nextFloat(); // asignar en la variable n1 el valor leido,
        // que será un float (número decimal)
        System.out.print("Ingrese Nota2: ");
        n2 = leer.nextFloat();
        System.out.print("Ingrese Nota3: ");
        n3 = leer.nextFloat();
        promedio = getPromedio3(n1, n2, n3); // funcion, que recibe 3 parametros
        // de tipo de dato float. y retorna el promedio de esos 3 parametros.

        System.out.println("El promedio final es: " + promedio);
        /*if (promedio >= 4) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }*/
        if (isAprobado(promedio, 4)){
            System.out.println("Aprobado");
        }else{
            System.out.println("Reprobado");
        }
    }

    public static float getPromedio3(float nota1, float nota2, float nota3) {
        // System.out.println("Estoy en getPromedio3");
        return (nota1 + nota2 + nota3) / 3;
    }

    public static boolean isAprobado(float valor, float minimo){
        if (valor >= minimo){
            return true;
        }
        return false;
    }
}
