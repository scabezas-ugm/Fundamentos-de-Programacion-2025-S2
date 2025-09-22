import java.util.ArrayList;
import java.util.List;

public class BibliotecaFundamentos {
    /*
     * Biblioteca de Funciones para trabajar en otras aplicaciones
     */
    public List<Integer> getDivisoresV2(int numero) {
        /*
         * List<Integer> listaDivisores = getDivisoresV2(numero);
         * System.out.println("Los divisores de " + numero + " son: " + listaDivisores);
         */
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

    public boolean isPar(int numero){
        /*
         * int num = 25;
         * System.out.println("El numero " + num + " es par? " + isPar(num));
         */
        return numero % 2 == 0;
    }
}
