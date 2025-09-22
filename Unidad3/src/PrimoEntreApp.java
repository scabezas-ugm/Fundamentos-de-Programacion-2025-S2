import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimoEntreApp {
    public static void main(String[] args) {
        List<Integer> listaPrimos = new ArrayList<Integer>();
        int inicio, fin;
        BibliotecaFundamentos bf = new BibliotecaFundamentos();
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el numero inicial: ");
        inicio = leer.nextInt();
        System.out.print("Ingrese el numero final: ");
        fin = leer.nextInt();
        for(int i = inicio; i <= fin; i++){
            if(bf.isPrimo(i)){
                listaPrimos.add(i);
            }
        }
        System.out.println("Los numeros primos entre " + inicio + " y " + fin + " son:");
        System.out.println(listaPrimos);
    }
}
