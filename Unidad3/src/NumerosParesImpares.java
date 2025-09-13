import java.util.Scanner;

public class NumerosParesImpares {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int numero = leer.nextInt();
        // Mostrando los numeros desde 1 hasta el número ingresado
        for (int divisor = 1; divisor <= numero; divisor++) {

            // numeros pares
            if (divisor % 2 == 0) {
                System.out.println("P: " + divisor);
            }
            // numeros impares
            if (divisor % 2 != 0) {
                System.out.println("I: " + divisor);
            }
        }
    }
}
