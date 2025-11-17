# Evaluación 2: Fundamentos de Programación

### 1. Encabezado del Documento

**Universidad:** Universidad Gabriela Mistral
**Asignatura:** Fundamentos de Programación
**Docente:** Sebastián Cabezas Ríos
**Evaluación:** Proyecto 1 - "Batalla Naval en Consola"
**Unidad Evaluada:** Unidad 3: Lenguaje Java
**Plazo de Entrega:** 30 de noviembre

---

### 2. Introducción y Objetivo del Proyecto

**Objetivo General:**
Desarrollar una aplicación de consola en Java que simule una versión simplificada del juego "Batalla Naval" (Hundir la Flota) para dos jugadores.

**Objetivos de Aprendizaje:**
El estudiante deberá demostrar competencia en:
* La **creación y manipulación de arreglos bidimensionales** (matrices) para representar los tableros de juego.
* El **diseño e implementación de métodos** para modularizar la lógica del juego (inicializar tableros, colocar barcos, procesar disparos, etc.).
* El **paso de argumentos a métodos**, especialmente el paso de arreglos.
* La **implementación del modelo de manipulación de errores** (`try-catch`) para la entrada de datos del usuario.
* El **manejo del ámbito y visibilidad** de las variables (locales, de clase) y métodos (`private`, `public`).

---

### 3. Requisitos Funcionales (El Juego)

El juego debe cumplir con las siguientes reglas:

1.  **Tablero:** El juego se desarrolla en un tablero de $10 \times 10$ casillas.
2.  **Jugadores:** Es un juego para dos jugadores (Jugador 1 y Jugador 2), que jugarán por turnos en la misma consola.
3.  **Flota (Simplificada):** Cada jugador tendrá una flota de **5 barcos**. Para simplificar el proyecto, cada barco ocupará **una sola casilla** ($1 \times 1$).
4.  **Fases del Juego:** El juego tendrá dos fases principales:
    * **Fase 1: Colocación de Barcos:**
        * Se debe "limpiar" la consola entre el turno de colocación del Jugador 1 y el Jugador 2 para que no vean las posiciones del oponente.
        * Cada jugador debe ingresar las coordenadas (fila y columna) para cada uno de sus 5 barcos.
    * **Fase 2: Batalla:**
        * Los jugadores se turnan para "disparar" ingresando coordenadas.
        * El sistema debe informar si el disparo fue "Agua", "Tocado" o "Tocado y Hundido". (Dado que los barcos son de $1 \times 1$, "Tocado" es lo mismo que "Hundido").
5.  **Tableros de Cada Jugador:** Cada jugador debe gestionar dos tableros:
    * **Tablero Propio:** Donde coloca sus barcos y ve los disparos del oponente.
    * **Tablero de Disparos:** Donde registra sus propios disparos (aciertos y fallos) para saber dónde ha disparado.
6.  **Condición de Victoria:** El primer jugador que logre hundir los 5 barcos del oponente gana la partida.

---

### 4. Requisitos Técnicos (La Implementación)

1.  **Entorno:** El proyecto debe ser desarrollado en Java.
2.  **Arreglos Bidimensionales:**
    * Se deben usar **4 arreglos bidimensionales** (`char[][]` o `int[][]` es lo recomendado) para los tableros:
        * `tableroPropioP1`
        * `tableroDisparosP1`
        * `tableroPropioP2`
        * `tableroDisparosP2`
3.  **Simbología:** Se debe usar una leyenda clara en la consola. Se sugiere:
    * `'~'` : Agua (casilla sin explorar).
    * `'B'` : Barco (solo visible en el tablero propio).
    * `'X'` : Tocado (barco impactado).
    * `'O'` : Agua (disparo fallido).
4.  **Modularidad (Métodos):** El código debe estar **altamente modularizado**. La lógica **NO** debe estar toda dentro del `main`. Se requiere la creación de, al menos, los siguientes métodos (`private static`):
    * `void inicializarTablero(char[][] tablero)`: Rellena un tablero con el carácter de "agua" (`'~'`).
    * `void mostrarTablero(char[][] tablero, boolean esPropio)`: Muestra el tablero en consola. Si `esPropio` es `false`, no debe mostrar la posición de los barcos (`'B'`).
    * `void colocarBarcos(char[][] tablero, Scanner scanner)`: Pide al jugador las coordenadas para sus 5 barcos y los coloca en su tablero.
    * `boolean procesarDisparo(char[][] tableroEnemigo, char[][] tableroDisparos, int fila, int col)`: Verifica el disparo. Actualiza el `tableroEnemigo` (con 'X' o 'O') y el `tableroDisparos` del jugador (con 'X' o 'O'). Retorna `true` si fue un acierto, `false` si fue agua.
5.  **Manejo de Errores (Obligatorio):**
    * Se debe usar un bloque `try-catch` para manejar la excepción `InputMismatchException` (si el usuario ingresa texto en lugar de números para las coordenadas).
    * Se debe validar (con `if`) que las coordenadas ingresadas (para barcos y disparos) estén **dentro de los límites** del tablero ($0$ al $9$).
    * Se debe validar que un jugador **no dispare dos veces a la misma casilla**.
    * Se debe validar que un jugador **no coloque dos barcos en la misma casilla**.

---

### 5. Sugerencias y Consideraciones

* **Limpiar la Consola:** Para ocultar los tableros entre turnos, puede imprimir 50 líneas en blanco (`System.out.println();`) en un bucle. Esto "empujará" el tablero anterior fuera de la vista.
* **Gestión de Turnos:** Use un bucle `while` para la Fase 2 (Batalla) que se ejecute mientras `barcosRestantesP1 > 0` y `barcosRestantesP2 > 0`.
* **Entrada de Datos:** Use la clase `Scanner` para leer las coordenadas desde la consola. Se recomienda crear **una única instancia** de `Scanner` al inicio del `main`.

---

### 6. Desafío

* **Barcos de Diferente Tamaño:** Implementar barcos de tamaños variables (ej. 1 Portaviones de 4 casillas, 1 Acorazado de 3, etc.). Esto requiere lógica adicional para la orientación (horizontal/vertical) y la validación de superposición.

---

### 7. Rúbrica de Evaluación (100 Puntos)

| Criterio | Puntaje Máximo | Descripción |
| :--- | :--- | :--- |
| **1. Uso de Arreglos Bidimensionales** | 25 Puntos | Declara, inicializa y manipula correctamente los 4 tableros (matrices) para la lógica del juego. |
| **2. Modularidad y Métodos** | 30 Puntos | El código está bien estructurado en métodos (como los solicitados). Se utiliza correctamente el paso de argumentos (especialmente los arreglos). |
| **3. Lógica del Juego Funcional** | 25 Puntos | El programa funciona: se pueden colocar barcos, los turnos alternan, los disparos se registran correctamente y el juego detecta al ganador. |
| **4. Manejo de Errores y Validaciones** | 15 Puntos | Implementa `try-catch` para entradas no numéricas Y valida lógicamente los límites del tablero, disparos repetidos y colocación de barcos. |
| **5. Claridad y Comentarios** | 5 Puntos | El código es legible, usa nombres de variables descriptivos y tiene comentarios explicando las partes complejas. |
| **TOTAL** | **100 Puntos** | |

---

### 8. Entregables

* Comprimir la carpeta completa del proyecto en un archivo `.zip`.
* Subir el archivo `.zip` a la plataforma Blackboard antes de la fecha y hora límite.

# Fundamentos de Programación
## 2025 Semestre 2
### Sebastián Cabezas Ríos

### Proyecto en Firebase

Para compilar código JAVA, se debe agregar el package JDK.

```nix
packages = [
    pkgs.jdk
];
```
