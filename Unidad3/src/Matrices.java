import java.util.Random;

class Matrices {
    public static void main(String[] args) {
        System.out.println("Matrices en Java");
        // declaración / definición de la matriz
        int tamano1 = 5;
        int[][] matriz0 = new int[3][2];
        int[][] matrizCuadrada1 = new int[tamano1][tamano1];
        // declaración con inicialización de datos
        String[][] matrizCuadrada2 = {
                { "X", "X", "X", "X", "X" },
                { "X", "X", "X", "X", "X" },
                { "X", "X", "X", "X", "X" },
                { "X", "X", "X", "X", "X" },
                { "X", "X", "X", "X", "X" }
        };
        boolean[][] matrizCuadrada3 = {
                { true, false, false, false, false },
                { false, true, false, false, false },
                { false, false, true, false, false },
                { false, false, false, true, false },
                { false, false, false, false, true },
        };
        // Implementación del método
        mostrarMatriz(matrizCuadrada2);
        mostrarMatriz(matrizCuadrada3);
        mostrarMatriz(matrizCuadrada3, "X", "_");
        mostrarMatriz(matrizCuadrada3, "😃", "🙈");
        poblarMatrizRandom(matrizCuadrada3);
        mostrarMatriz(matrizCuadrada3, "😃"," ");
        sobreEscribirDiagonalPrincipal(matrizCuadrada3);
        mostrarMatriz(matrizCuadrada3, "X","_");
        sobreEscribirDiagonalSecundaria(matrizCuadrada3);
        mostrarMatriz(matrizCuadrada3, "X","_");
    }

    public static void mostrarMatriz(String[][] matriz) {
        System.out.println("Metodo (void) Mostrar matriz");
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {
                System.out.print(matriz[f][c] + " ");
            }
            System.out.println();
        }
    }

    public static void mostrarMatriz(boolean[][] matriz) {
        System.out.println("Metodo (void) Mostrar matriz");
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {
                System.out.print(matriz[f][c] + " ");
            }
            System.out.println();
        }
    }

    public static void mostrarMatriz(boolean[][] matriz, String verdadero, String falso) {
        System.out.println("Metodo (void) Mostrar matriz");
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {
                if (matriz[f][c]) {
                    System.out.print(verdadero + " ");
                } else {
                    System.out.print(falso + " ");
                }
            }
            System.out.println();
        }
    }

    public static void poblarMatrizRandom(boolean [][] matriz){
        // instancia del objeto random
        Random aleatorio = new Random();
        // System.out.println("Poblado de Matriz");
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[0].length; c++) {
                matriz[f][c] = aleatorio.nextBoolean();
            }
        }
    }

    public static void sobreEscribirDiagonalPrincipal(boolean [][]matriz) {
        System.out.println("== DIAGONAL PRINCIPAL ==");
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {
                if (f == c) {
                    matriz[f][c] = true;
                } else {
                    matriz[f][c] = false;
                }
            }
        }
    }
    
    public static void sobreEscribirDiagonalSecundaria(boolean [][] matriz) {
        System.out.println("== DIAGONAL SECUNDARIA ==");
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {
                if (f + c == matriz.length - 1) {
                    matriz[f][c] = true;
                } else {
                    matriz[f][c] = false;
                }
            }
        }
    }
}
