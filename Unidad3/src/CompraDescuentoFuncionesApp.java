import java.util.Scanner;

// ¿qué pasa si ahora hay 2 o 3 condiciones de descuento?
// Example:
// por compras igual o superior a 20.000 -> 5%
// por compras igual o superior a 50.000 -> 15%
// por compras igual o superior a 100.000 -> 20%

public class CompraDescuentoFuncionesApp {

    public static void main(String[] args) {
        int montoCompra;
        float descuento = (float) 0.15, totalApagar;
        Scanner leer = new Scanner(System.in); // Create a Scanner object
        System.out.println("=== COMPRA DESCUENTO ===");
        System.out.println("Ingrese el monto de la compra, para saber si aplica no el descuento: ");
        montoCompra = leer.nextInt();

        // con funciones
        if (isDescuentoAprobado(montoCompra, 50000)) {
            System.out.println("Se aplicó un 15% de descuento");
            totalApagar = getAplicarDescuento(montoCompra, descuento);
        } else {
            totalApagar = montoCompra;
        }
        System.out.println("Total a pagar: $ " + totalApagar);

        System.out.println("=== RESPUESTA A PREGUNTAS ===");

        if (isDescuentoAprobado(montoCompra, 100000)) {
            System.out.println("Se aplicó un 20% de descuento");
            totalApagar = getAplicarDescuento(montoCompra, (float) 0.2);
        } else if (isDescuentoAprobado(montoCompra, 50000)) {
            System.out.println("Se aplicó un 15% de descuento");
            totalApagar = getAplicarDescuento(montoCompra, (float) 0.15);
        } else if (isDescuentoAprobado(montoCompra, 20000)) {
            System.out.println("Se aplicó un 5% de descuento");
            totalApagar = getAplicarDescuento(montoCompra, (float) 0.05);
        } else {
            totalApagar = montoCompra;
        }

        System.out.println("Total a pagar: $ " + totalApagar);
    }

    public static int getAplicarDescuento(int monto, float descuento) {
        return (int) (monto - (monto * descuento));
    }

    public static boolean isDescuentoAprobado(int montoCompra, int montoMinimo) {
        return montoCompra >= montoMinimo ? true : false;
    }

}
