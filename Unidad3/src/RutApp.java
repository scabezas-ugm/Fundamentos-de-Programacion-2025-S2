import java.util.Scanner;

public class RutApp {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        BibliotecaRut bRut = new BibliotecaRut();
        
        System.out.print("Ingrese un rut:");
        String rut = leer.nextLine();

        //System.out.println("El rut ingresado es: " + rut);
        System.out.println("Rut ["+rut+"] valido? " + bRut.validar(rut));
    }
}
