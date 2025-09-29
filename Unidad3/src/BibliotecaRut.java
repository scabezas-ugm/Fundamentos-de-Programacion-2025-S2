public class BibliotecaRut {
    // Paso1:
    // Seleccionar los Números del RUT sin el Dígito Verificador, ni puntos
    // Ejemplo: 27.962.409
    private String paso1(String rut) {
        // System.out.println("Estoy en Paso1: " + rut);
        String respuesta = "";
        for (int i = 0; i < rut.length() - 2; i++) {
            // recorremos el rut, caracter por caracter
            if (rut.charAt(i) != '.') {// si es distinto de punto el contenido, entonces lo veo
                // System.out.println("posicion [" + i + "] digito: [" + rut.charAt(i) + "]");
                respuesta = respuesta + rut.charAt(i);
            }
        }
        return respuesta;
    }

    // Paso 2:
    // Reordenar los Números de Derecha a Izquierda
    // Ejemplo: 9 0 4 2 6 9 7 2
    private String paso2(String rut) {
        String respuesta = "";
        for (int i = rut.length() - 1; i >= 0; i--) {
            // System.out.println("posicion [" + i + "] digito: [" + rut.charAt(i) + "]");
            respuesta = respuesta + rut.charAt(i);
        }
        return respuesta;
    }

    // Paso 3:
    // Multiplicar Cada Número por la Serie 2, 3, 4, 5, 6, 7 Repetidamente
    // Ejemplo: Entrada: 9 0 4 2 6 9 7 2
    // Ejemplo: 9x2 + 0x3 + 4x4 + 2x5 + 6x6 9x7 7x2 2x3
    // 18 + 0 + 16 + 10 + 36 + 63 + 14 + 6
    // 163
    private int paso3(String rut) {
        int respuesta = 0;
        // System.out.println("En Paso 3:");
        int secuencia[] = { 2, 3, 4, 5, 6, 7 };
        // recorremos el string del rut y multiplicamos la secuencia
        int j = 0;
        for (int i = 0; i < rut.length(); i++) {
            int suma = Character.getNumericValue(rut.charAt(i)) * secuencia[j];
            // System.out.println(rut.charAt(i)+"x"+secuencia[j] + "=" + suma);
            j++;
            if (j == secuencia.length) {
                j = 0;
            }
            respuesta += suma;
        }
        // idea loca: digito x multiplicador manualmente
        // System.out.println(rut.charAt(0)+"x" + 2 + "=" +
        // Character.getNumericValue(rut.charAt(0)) * 2);
        // System.out.println(rut.charAt(1)+"x" + 3 + "=" +
        // Character.getNumericValue(rut.charAt(1)) * 3);
        // System.out.println(rut.charAt(2)+"x" + 4 + "=" +
        // Character.getNumericValue(rut.charAt(2)) * 4);
        // System.out.println(rut.charAt(3)+"x" + 5 + "=" +
        // Character.getNumericValue(rut.charAt(3)) * 5);
        // System.out.println(rut.charAt(4)+"x" + 6 + "=" +
        // Character.getNumericValue(rut.charAt(4)) * 6);
        // System.out.println(rut.charAt(5)+"x" + 7 + "=" +
        // Character.getNumericValue(rut.charAt(5)) * 7);
        // System.out.println(rut.charAt(6)+"x" + 2 + "=" +
        // Character.getNumericValue(rut.charAt(6)) * 2);
        // System.out.println(rut.charAt(7)+"x" + 3 + "=" +
        // Character.getNumericValue(rut.charAt(7)) * 3);
        return respuesta;
    }

    private boolean paso2_5(String rut) {
        // Verificará si es solo números.
        for (int i = 0; i < rut.length(); i++) {
            if (!Character.isDigit(rut.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    // Paso 5: Dividir el Resultado por 11 y Obtener el Resto: 163 / 11 = 14,81818
    // El resultado sin decimales es 14.
    // Luego, multiplicamos 14 por 11: 14 x 11 = 154
    private int paso5(int resultadoPaso3) {
        // int respuesta=0;
        // System.out.println("En Paso 5:");
        // System.out.println(resultadoPaso3+"/11=" + (resultadoPaso3/11));
        // respuesta = (resultadoPaso3/11);
        return (resultadoPaso3 / 11) * 11;
    }

    // Paso 6: Restar Este Resultado (Paso 5) del Total (Paso 3): 163 – 154 = 9
    // (Tomar el Valor Absoluto)
    private int paso6(int resultadoPaso5, int resultadoPaso3) {
        // System.out.println("r:5: " + resultadoPaso5);
        // System.out.println("r:3: " + resultadoPaso3);
        return resultadoPaso3 - resultadoPaso5;
    }

    // Paso 7: Restar el Resultado del Paso 6 de 11: 11 – 9 = 2
    private String paso7(int resultadoPaso6) {
        String resultado = "";
        resultado = "" + (11 - resultadoPaso6);
        if (resultado.equals("11")) {
            resultado = "0";
        } else if (resultado.equals("10")) {
            resultado = "k";
        }
        return resultado;
    }

    // Funcion Final
    public boolean validar(String rut) {
        // System.out.println("El rut que llega a validar: " + rut);
        // cuando tiene puntos: 11 a 12 caracteres
        // cuando no tiene puntos: 9 a 10 caract ere s
        // System.out.println("Tamaño del String: " + rut.length());
        if (rut.length() >= 9 && rut.length() <= 12) {
            String digitoVerificador = rut.substring(rut.length() - 1).toLowerCase();
            // System.out.println("DV: " + digitoVerificador);
            // System.out.println("Digito Verificador: " + digitoVerificador);
            // pasa por cada paso
            String paso_1 = paso1(rut);
            //System.out.println("Respuesta Paso 1: " + paso_1);
            String paso_2 = paso2(paso_1);
            //System.out.println("Respuesta Paso 2: " + paso_2);
            //System.out.println("Respuesta Paso 2.5: " + paso2_5(paso_2));
            if (paso2_5(paso_2)) {
                int paso_3 = paso3(paso_2);
                //System.out.println("Respuesta Paso 3: " + paso_3);
                int paso_5 = paso5(paso_3);
                // 27.962.409-2
                //System.out.println("Respuesta Paso 5: " + paso_5);
                int paso_6 = paso6(paso_5, paso_3);
                //System.out.println("Respuesta Paso 6: " + paso_6);
                String paso_7 = paso7(paso_6); // este es mi digito verificador calculado
                //System.out.println("Respuesta Paso 7: " + paso_7);
                //System.out.println(paso_7 + " vs DV: " + digitoVerificador);
                if (paso_7.charAt(0) == digitoVerificador.charAt(0)) {
                    return true;
                }
                return false;
            }
            return false;
        } else {
            return false;
        }
    }
}
