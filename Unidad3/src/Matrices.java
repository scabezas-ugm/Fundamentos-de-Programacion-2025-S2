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
        mostrarMatriz(matrizCuadrada3, "😃", "🙈");
        sobreEscribirDiagonalPrincipal(matrizCuadrada3);
        mostrarMatriz(matrizCuadrada3, "😃", "🙈");
        sobreEscribirDiagonalSecundaria(matrizCuadrada3);
        mostrarMatriz(matrizCuadrada3, "😃", "🙈");
        sobreEscribirContornos(matrizCuadrada3);
        mostrarMatriz(matrizCuadrada3, "😃", "🙈");
        sobreEscribirEscalonadaPrincipal(matrizCuadrada3);
        mostrarMatriz(matrizCuadrada3, "😃", "🙈");
        sobreEscribirRelojVerticalV2(matrizCuadrada3);
        mostrarMatriz(matrizCuadrada3, "😃", "🙈");
        sobreEscribirRelojHorizontalV2(matrizCuadrada3);
        mostrarMatriz(matrizCuadrada3, "😃", "🙈");
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

    public static void poblarMatrizRandom(boolean[][] matriz) {
        // instancia del objeto random
        Random aleatorio = new Random();
        // System.out.println("Poblado de Matriz");
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[0].length; c++) {
                matriz[f][c] = aleatorio.nextBoolean();
            }
        }
    }

    public static void sobreEscribirDiagonalPrincipal(boolean[][] matriz) {
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

    public static void sobreEscribirDiagonalSecundaria(boolean[][] matriz) {
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

    public static void sobreEscribirContornos(boolean[][] matriz) {
        System.out.println("== DIBUJAR CONTORNOS ==");
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[0].length; columna++) {
                if ((fila == 0 || fila == matriz.length - 1) || (columna == 0 || columna == matriz.length - 1)) {
                    matriz[fila][columna] = true;
                } else {
                    matriz[fila][columna] = false;
                }
            }
        }
    }

    public static void sobreEscribirEscalonadaPrincipal(boolean[][] matriz) {
        System.out.println("== DIBUJAR ESCALONADA PRINCIPAL ==");
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz.length; columna++) {
                if (fila <= columna) {
                    matriz[fila][columna] = true;
                } else {
                    matriz[fila][columna] = false;
                }
            }
        }
    }

    public static void sobreEscribirRelojVerticalV2(boolean[][] matriz) {
        System.out.println("== RELOJ VERTICAL VERSION 2 ==");
        int espacios = 0;
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz.length; columna++) {
                if (espacios <= columna && columna <= (matriz.length - 1 - espacios)) {
                    matriz[fila][columna] = true;
                } else {
                    matriz[fila][columna] = false;
                }
            }
            if (fila < matriz.length / 2) {
                espacios++;
            } else {
                espacios--;
            }
        }
    }

    public static void sobreEscribirRelojHorizontalV2(boolean[][] matriz) {
        System.out.println("== RELOJ HORIZONTAL ==");
        int espacios = 0;
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz.length; columna++) {
                if (espacios <= columna - 1 && columna <= (matriz.length - 2 - espacios)) {
                    matriz[fila][columna] = true;
                } else {
                    matriz[fila][columna] = false;
                }
            }
            if (fila < matriz.length / 2) {
                espacios++;
            } else {
                espacios--;
            }
        }
    }
}
