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
                
                return true;
            }
            return false;
        } else {
            return false;
        }
    }
}
