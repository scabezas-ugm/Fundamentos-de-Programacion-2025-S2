import java.util.Scanner;

public class RutApp {
    public static void main(String[] args) {
        // Scanner leer = new Scanner(System.in);
        BibliotecaRut bRut = new BibliotecaRut();
        
        // System.out.print("Ingrese un rut:");
        // String rut = leer.nextLine();

        //System.out.println("El rut ingresado es: " + rut);
        // System.out.println("Rut ["+rut+"] valido? " + bRut.validar(rut));
        String rut = "27.962.409-2";
        System.out.println("Rut ["+rut+"] valido? " + bRut.validar(rut));
        rut = "27.962.409-1";
        System.out.println("Rut ["+rut+"] valido? " + bRut.validar(rut));
        rut = "19566120-0";
        System.out.println("Rut ["+rut+"] valido? " + bRut.validar(rut));
        rut = "19566120-K";
        System.out.println("Rut ["+rut+"] valido? " + bRut.validar(rut));
        rut = "11.634.582-k";
        System.out.println("Rut ["+rut+"] valido? " + bRut.validar(rut));
        rut = "11634582-K";
        System.out.println("Rut ["+rut+"] valido? " + bRut.validar(rut));
        
    }
}
