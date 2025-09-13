/*
 * Si una compra supera los $50.000, se aplica un 15% de descuento. Caso contrario, no se aplica
 * descuento. El sistema debe calcular el total a pagar.
 */

import java.util.Scanner;

public class CompraDescuentoApp {
    public static void main(String[] args) {
        int montoCompra;
        float descuento = (float) 0.15, totalApagar;
        Scanner leer = new Scanner(System.in); // Create a Scanner object
        System.out.println("=== COMPRA DESCUENTO ===");
        System.out.println("Ingrese el monto de la compra, para saber si aplica no el descuento: ");
        montoCompra = leer.nextInt();

        if (montoCompra >= 50000) {
            totalApagar = montoCompra - (montoCompra * descuento);
            System.out.println("Se aplicó un 15% de descuento");
        }else{
            totalApagar = montoCompra;
        }

        System.out.println("Total a pagar: $ " + totalApagar);
    }
}
