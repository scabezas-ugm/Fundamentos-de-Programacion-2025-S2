package JuegoDelGato;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        Jugador j1 = new Jugador();
        Jugador j2 = new Jugador();

        char[][] matriz = new char[3][3];
        char caracterLlenado = '_';
        boolean respuesta = false, terminado = false;
        int opcionJuego = 0, turnos = 8;

        System.out.println("Ingrese Jugador 1:");
        System.out.print("Nombre: ");
        j1.setNombre(leer.nextLine());
        System.out.print("RUT: ");
        j1.setRut(leer.nextLine());

        System.out.println("Ingrese Jugador 2:");
        System.out.print("Nombre: ");
        j2.setNombre(leer.nextLine());
        System.out.print("RUT: ");
        j2.setRut(leer.nextLine());

        do {
            System.out.println("Ingrese opcion para jugar del jugador1 [" + j1.getNombre() + "]:");
            System.out.println("1) Para X");
            System.out.println("2) Para O");
            System.out.print("Ingrese 1 o 2: ");
            opcionJuego = leer.nextInt();
        } while (opcionJuego < 1 || opcionJuego > 2);
        if (opcionJuego == 1) {
            j1.setCaracter('X');
            j2.setCaracter('O');
        } else {
            j1.setCaracter('O');
            j2.setCaracter('X');
        }

        // informacion de los jugadores
        // System.out.println(j1.toString());
        // System.out.println(j2.toString());

        llenarMatriz(matriz, caracterLlenado);

        Jugador juegaAhora;
        if (j1.getCaracter() == 'X') {
            juegaAhora = j1;
        } else {
            juegaAhora = j2;
        }
        // Ahora comienza el juego
        while (!terminado) {
            // Parte el juego, el jugador de las "X"
            boolean respuestaJugada;
            // define quien parte. Parten las X
            do {
                respuestaJugada = jugada(matriz, caracterLlenado, juegaAhora, leer);
            } while (!respuestaJugada);

            // un juego termina, si un jugador gana o se acaban los turnos
            if (turnos < 1 || gana(matriz, caracterLlenado, juegaAhora)) {
                terminado = true;
            }

            if (juegaAhora == j1) {
                juegaAhora = j2;
            } else {
                juegaAhora = j1;
            }
            // System.out.println("TURNO: [" + turnos + "]");
            turnos--;
        }
        // mostrarMatriz(matriz);

        /*
         * mostrarMatriz(matriz);
         * respuesta = validarJugada(matriz, caracterLlenado, 'O', 1, 1);
         * if (respuesta) {
         * System.out.println("Se agrego :) - Siguiente jugador");
         * } else {
         * System.out.println(":( No se agrego - el mismo jugador");
         * }
         * mostrarMatriz(matriz);
         */

    }

    public static void llenarMatriz(char[][] m, char llenado) {
        for (int f = 0; f < m.length; f++) {
            for (int c = 0; c < m.length; c++) {
                m[f][c] = llenado;
            }
        }
    }

    public static void mostrarMatriz(char[][] m) {
        for (int f = 0; f < m.length; f++) {
            for (int c = 0; c < m.length; c++) {
                System.out.print(" " + m[f][c]);
            }
            System.out.println();
        }
    }

    public static boolean jugada(char[][] m, char llenado, Jugador j, Scanner leer) {
        mostrarMatriz(m);
        System.out.print("Jugada de [" + j.getNombre() + "] Ingrese coordenada X: ");
        int coordenadaX = leer.nextInt();
        System.out.print("Jugada de [" + j.getNombre() + "] Ingrese coordenada Y: ");
        int coordenadaY = leer.nextInt();

        boolean respuesta = validarJugada(m, llenado, j.getCaracter(), coordenadaX, coordenadaY);
        if (respuesta) {
            // System.out.println("Se agrego :) - Siguiente jugador");
            return true;
        } else {
            System.out.println("Error: :( No se agrego, el turno sigue siendo de " + j.getNombre());
            return false;
        }
    }

    public static boolean validarJugada(char[][] m, char llenado, char jugada, int ejeX, int ejeY) {
        // agregar la X o el O. En la coordada. no valida quien gana
        for (int f = 0; f < m.length; f++) {
            for (int c = 0; c < m.length; c++) {
                if (f == ejeX && c == ejeY) {
                    if (m[f][c] == llenado) {
                        m[f][c] = jugada;
                        return true;
                    } else {
                        return false;
                    }
                }
            }
        }
        return false;
    }

    public static boolean gana(char[][] m, char llenado, Jugador j) {
        int contadorDP = 0, contadorDS = 0, contadorF0 = 0, contadorF1 = 0, contadorF2 = 0, contadorC0 = 0, contadorC1 = 0, contadorC2 = 0;
        for (int f = 0; f < m.length; f++) {
            for (int c = 0; c < m.length; c++) {
                if (f == c && m[f][c] == j.getCaracter()) { // diagonal principal
                    contadorDP++;
                }
                if (f + c == 2 && m[f][c] == j.getCaracter()) { // digaonal secundaria
                    contadorDS++;
                }
                if (f == 0 && m[f][c] == j.getCaracter()) {// fila 0
                    contadorF0++;
                }
                if (f == 1 && m[f][c] == j.getCaracter()) {// fila 0
                    contadorF1++;
                }
                if (f == 2 && m[f][c] == j.getCaracter()) {// fila 0
                    contadorF2++;
                }
                if (c == 0 && m[f][c] == j.getCaracter()) {// fila 0
                    contadorC0++;
                }
                if (c == 1 && m[f][c] == j.getCaracter()) {// fila 0
                     contadorC1++;
                }
                if (c == 2 && m[f][c] == j.getCaracter()) {// fila 0
                    contadorC2++;
                }
            }
        }

        if (contadorDP == 3 || contadorDS == 3 || contadorF0 == 3 || contadorF1 == 3 || contadorF2 == 3 || contadorC0 == 3 || contadorC1 == 3 || contadorC2 == 3) {
            mostrarMatriz(m);
            System.out.println("Ganador [" + j.getNombre() + "]");
            return true;
        }
        return false;
    }

}
