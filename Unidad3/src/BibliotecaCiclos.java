import java.util.Scanner;

public class BibliotecaCiclos {

    // Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por
    // ejemplo,
    // si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
    // * * * *
    // * * * *
    // * * * *
    // * * * *
    // METODO PQ ES UN VOID
    public void dibujarCuadrado(int lado) {
        // System.out.println("dibujarCuadrado: " + lado);
        System.out.println("== CUADRADO ==");
        for (int i = 0; i < lado; i++) {
            // System.out.print("i ");
            for(int j = 0; j < lado; j++){
                //System.out.print("j["+j+"]");
                System.out.print("* ");
            }
            System.out.println("");
        }
        // salto de linea final para que no se vea mal
        System.out.println("");
    }

    // Diagonal Principal
    public void dibujarDiagonalPrincipal(int lado) {
        System.out.println("== DIAGONAL PRINCIPAL ==");
        for(int fila = 0; fila < lado; fila++){
            for(int columna = 0; columna < lado; columna++){
                if (fila == columna){
                    System.out.print("X ");
                }else{
                    System.out.print("_ ");
                }
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        BibliotecaCiclos bc = new BibliotecaCiclos();
        boolean condicion = true;
        do {
            System.out.print("Ingrese un numero para generar la matriz: ");
            int numero = leer.nextInt();
            bc.dibujarCuadrado(numero);
            bc.dibujarDiagonalPrincipal(numero);
            System.out.print("¿Desea continuar ingrese 1? / para salir ingrese 0 | Ingrese opción: ");
            int salir = leer.nextInt();
            if (salir == 0) {
                condicion = false;
            }
        } while (condicion);
    }
}
