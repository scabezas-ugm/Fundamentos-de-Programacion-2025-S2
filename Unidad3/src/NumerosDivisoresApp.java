import java.util.List;
import java.util.Scanner;

public class NumerosDivisoresApp {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int numero = leer.nextInt();
        System.out.println("Numero ingresado: " + numero);
        System.out.println("Los divisores de " + numero + " son: ");
        for (int divisor = 1; divisor <= numero; divisor++) {
            if (numero % divisor == 0) {
                System.out.println("D: " + divisor);
            }
        }
    }
}
