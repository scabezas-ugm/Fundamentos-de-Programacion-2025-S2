package JuegoDelGato;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        Jugador j1 = new Jugador();
        Jugador j2 = new Jugador();

        char [][] matriz = new char[3][3];
        char caracterLlenado = '_';
        boolean respuesta = false;
        int opcionJuego = 0;

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
            System.out.println("Ingrese opcion para jugar del jugador1 ["+j1.getNombre()+"]:");
            System.out.println("1) Para X");
            System.out.println("2) Para O");
            System.out.print("Ingrese 1 o 2: ");
            opcionJuego = leer.nextInt();
        } while (opcionJuego < 1 || opcionJuego > 2);
        if(opcionJuego==1){
            j1.setCaracter('X');
            j2.setCaracter('O');
        }else{
            j1.setCaracter('O');
            j2.setCaracter('X');
        }

        // informacion de los jugadores
        // System.out.println(j1.toString());
        // System.out.println(j2.toString());
        
        llenarMatriz(matriz, caracterLlenado);
        mostrarMatriz(matriz);
        respuesta = validarJugada(matriz, caracterLlenado, 'X', 1, 1);
        if (respuesta){
            System.out.println("Se agrego :) - Siguiente jugador");
        }else{
            System.out.println(":( No se agrego - el mismo jugador");
        }
        mostrarMatriz(matriz);
        respuesta = validarJugada(matriz, caracterLlenado, 'O', 1, 1);
        if (respuesta){
            System.out.println("Se agrego :) - Siguiente jugador");
        }else{
            System.out.println(":( No se agrego - el mismo jugador");
        }
        mostrarMatriz(matriz);
        
    }

    public static void llenarMatriz(char [][]m, char llenado){
        for (int f = 0; f < m.length; f++) {
            for (int c = 0; c < m.length; c++) {
                m[f][c] = llenado;
            }
        }
    }

    public static void mostrarMatriz(char [][]m){
        for (int f = 0; f < m.length; f++) {
            for (int c = 0; c < m.length; c++) {
                System.out.print(" " + m[f][c]);
            }
            System.out.println();
        }
    }

    public static boolean validarJugada(char [][]m, char llenado, char jugada, int ejeX, int ejeY){
        for (int f = 0; f < m.length; f++) {
            for (int c = 0; c < m.length; c++) {
                if (f == ejeX && c == ejeY){
                    if (m[f][c] == llenado){
                        m[f][c] = jugada;
                        return true;
                    }else{
                        return false;
                    }
                }
            }
        }
        return false;
    }

    
}
