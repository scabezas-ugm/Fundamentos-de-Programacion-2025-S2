

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumerosDivisoresFuncionesApp {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int numero = leer.nextInt();
        // System.out.println("Numero ingresado: " + numero);
        List<Integer> listaDivisores = getDivisores(numero);
        // List<Integer> listaDivisores = getDivisoresV2(numero);
        System.out.println("Los divisores de " + numero + " son: " + listaDivisores);
    }

    public static List<Integer> getDivisores(int numero) {
        ArrayList<Integer> listaDivisores = new ArrayList<Integer>();
        for (int div = 1; div <= numero; div++) {
            if (numero % div == 0) {
                listaDivisores.add(div);
            }
        }
        return listaDivisores;
    }

    public static List<Integer> getDivisoresV2(int numero) {
        ArrayList<Integer> listaDivisores = new ArrayList<Integer>();
        listaDivisores.add(1);
        for (int div = 2; div <= (numero / 2); div++) {
            if (numero % div == 0) {
                listaDivisores.add(div);
            }
        }
        listaDivisores.add(numero);
        return listaDivisores;
    }
}
