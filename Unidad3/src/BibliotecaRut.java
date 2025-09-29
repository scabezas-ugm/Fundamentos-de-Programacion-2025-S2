public class BibliotecaRut {
    // Paso1:
    // Seleccionar los Números del RUT sin el Dígito Verificador, ni puntos
    // Ejemplo: 27.962.409
    public String paso1(String rut) {
        // System.out.println("Estoy en Paso1: " + rut);
        String respuesta = "";
        for (int i = 0; i < rut.length() - 2; i++) {
            // recorremos el rut, caracter por caracter
            if (rut.charAt(i) != '.') {// si es distinto de punto el contenido, entonces lo veo
                //System.out.println("posicion [" + i + "] digito: [" + rut.charAt(i) + "]");
                respuesta = respuesta + rut.charAt(i);
            }
        }
        return respuesta;
    }
    // Paso 2: 
    // Reordenar los Números de Derecha a Izquierda
    // Ejemplo: 9 0 4 2 6 9 7 2
    public String paso2(String rut) {
        String respuesta = "";
        for(int i=rut.length()-1; i>= 0; i--){
                //System.out.println("posicion [" + i + "] digito: [" + rut.charAt(i) + "]");
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
    public int paso3(String rut) {
        int respuesta = 0;
        // System.out.println("En Paso 3:");
        int secuencia[] = {2, 3, 4, 5, 6, 7};
        // recorremos el string del rut y multiplicamos la secuencia
        int j=0;
        for (int i = 0; i < rut.length(); i++) {
            int suma = Character.getNumericValue(rut.charAt(i)) * secuencia[j];
            // System.out.println(rut.charAt(i)+"x"+secuencia[j] + "=" + suma);
            j++;
            if (j == secuencia.length){
                j = 0;
            }
            respuesta += suma;
        }
        // idea loca: digito x multiplicador manualmente
        //System.out.println(rut.charAt(0)+"x" + 2 + "=" + Character.getNumericValue(rut.charAt(0)) * 2);
        //System.out.println(rut.charAt(1)+"x" + 3 + "=" + Character.getNumericValue(rut.charAt(1)) * 3);
        //System.out.println(rut.charAt(2)+"x" + 4 + "=" + Character.getNumericValue(rut.charAt(2)) * 4);
        //System.out.println(rut.charAt(3)+"x" + 5 + "=" + Character.getNumericValue(rut.charAt(3)) * 5);
        //System.out.println(rut.charAt(4)+"x" + 6 + "=" + Character.getNumericValue(rut.charAt(4)) * 6);
        //System.out.println(rut.charAt(5)+"x" + 7 + "=" + Character.getNumericValue(rut.charAt(5)) * 7);
        //System.out.println(rut.charAt(6)+"x" + 2 + "=" + Character.getNumericValue(rut.charAt(6)) * 2);
        //System.out.println(rut.charAt(7)+"x" + 3 + "=" + Character.getNumericValue(rut.charAt(7)) * 3);
        return respuesta;
    }

    public boolean paso2_5(String rut){
        // Verificará si es solo números.
        for (int i = 0; i < rut.length(); i++) {
            if (!Character.isDigit(rut.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    // Funcion Final
    public boolean validar(String rut) {
        // System.out.println("El rut que llega a validar: " + rut);
        // cuando tiene puntos: 11 a 12 caracteres
        // cuando no tiene puntos: 9 a 10 caract ere s
        // System.out.println("Tamaño del String: " + rut.length());
        if (rut.length() >= 9 && rut.length() <= 12) {
            String digitoVerificador = rut.substring(rut.length() - 1);
            // System.out.println("DV: " + digitoVerificador);
            // System.out.println("Digito Verificador: " + digitoVerificador);
            // pasa por cada paso
            String paso_1 = paso1(rut);
            System.out.println("Respuesta Paso 1: " + paso_1);
            String paso_2 = paso2(paso_1);
            System.out.println("Respuesta Paso 2: " + paso_2);
            System.out.println("Respuesta Paso 2.5: " + paso2_5(paso_2));
            if (paso2_5(paso_2)){
                int paso_3 = paso3(paso_2);
                System.out.println("Respuesta Paso 3: " + paso_3);
                return true;
            }
            return false;
        } else {
            return false;
        }
    }
}
