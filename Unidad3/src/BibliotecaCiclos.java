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
            for (int j = 0; j < lado; j++) {
                // System.out.print("j["+j+"]");
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
        for (int fila = 0; fila < lado; fila++) {
            for (int columna = 0; columna < lado; columna++) {
                if (fila == columna) {
                    System.out.print("X ");
                } else {
                    System.out.print("_ ");
                }
            }
            System.out.println("");
        }
        System.out.println("");
    }

    // Diagonal Secundaria
    public void dibujarDiagonalSecundaria(int lado) {
        System.out.println("== DIAGONAL SECUNDARIA ==");
        for (int fila = 0; fila < lado; fila++) {
            for (int columna = 0; columna < lado; columna++) {
                if (fila + columna == lado - 1) {
                    System.out.print("X ");
                } else {
                    System.out.print("_ ");
                }
            }
            System.out.println("");
        }
        System.out.println("");
    }

    // Dibujar Contornos
    public void dibujarContornos(int lado) {
        System.out.println("== DIBUJAR CONTORNOS ==");
        for (int fila = 0; fila < lado; fila++) {
            for (int columna = 0; columna < lado; columna++) {
                if ((fila == 0 || fila == lado - 1) || (columna == 0 || columna == lado - 1)) {
                    System.out.print("X ");
                } else {
                    System.out.print("_ ");
                }
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public void dibujarEscalonadaPrincipal(int lado) {
        System.out.println("== DIBUJAR ESCALONADA PRINCIPAL ==");
        for (int fila = 0; fila < lado; fila++) {
            for (int columna = 0; columna < lado; columna++) {
                if (fila <= columna) {
                    System.out.print("X ");
                } else {
                    System.out.print("_ ");
                }
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public void dibujarRelojVertical(int lado) {
        System.out.println("== RELOJ VERTICAL ==");
        int restar=0;
        boolean incrementa=false, decrementa=false;
        for (int fila = 0; fila < lado; fila++) {
            for (int columna = 0; columna < lado; columna++) {
                // System.out.print("Fila ["+fila+"]: " + fila/2 + "Columna ["+columna+"]: " +
                // columna/2);
                //System.out.print("[" + fila + "-" + columna + "]");
                if (restar<=columna && columna <= (lado-1-restar)){
                    System.out.print("X ");
                }else{
                    System.out.print("_ ");
                }
                
                if (fila <= columna){
                    incrementa=true;
                    decrementa=false;
                }else{
                    incrementa=false;
                    decrementa=true;
                }

                /*if ((fila == (lado-1)/2 && columna == (lado-1)/2) || (fila ==0) ) {
                    System.out.print("X ");
                } else {
                    System.out.print("_ ");
                }*/
            }
            if(incrementa){
                restar++;
            }
            if (decrementa){
                restar--;
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
            // bc.dibujarCuadrado(numero);
            // bc.dibujarContornos(numero);
            // bc.dibujarDiagonalPrincipal(numero);
            // bc.dibujarDiagonalSecundaria(numero);
            // bc.dibujarEscalonadaPrincipal(numero);
            bc.dibujarRelojVertical(numero);
            System.out.print("¿Desea continuar ingrese 1? / para salir ingrese 0 | Ingrese opción: ");
            int salir = leer.nextInt();
            if (salir == 0) {
                condicion = false;
            }
        } while (condicion);
    }
}
