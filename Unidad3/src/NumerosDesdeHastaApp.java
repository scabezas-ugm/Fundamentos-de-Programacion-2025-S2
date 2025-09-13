import java.util.Scanner;

public class NumerosDesdeHastaApp {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int numero = leer.nextInt();
        //Mostrando los numeros desde 1 hasta el número ingresado
        for (int i = 1; i <= numero; i++) {
            System.out.println(i);
        }
    }
}
