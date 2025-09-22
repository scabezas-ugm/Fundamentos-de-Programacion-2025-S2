import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimoEntreApp {
    public static void main(String[] args) {
        int inicio, fin;
        BibliotecaFundamentos bf = new BibliotecaFundamentos();
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el numero inicial: ");
        inicio = leer.nextInt();
        System.out.print("Ingrese el numero final: ");
        fin = leer.nextInt();
        System.out.println("Los numeros primos entre " + inicio + " y " + fin + " son:");
        System.out.println(bf.getPrimosEntre(inicio, fin));
    }
}
