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
}