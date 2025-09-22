import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Hello");
        System.out.println("World!");

        // Consumo de la Biblioteca
        // 1. Se crea la instancia del objeto BibliotecaFundamentos
        // 2. La instancia se llamara bf (es nuestro acceso)
        // 3. Se implementa la funcion isPar, pasando un argumento como parametro
        BibliotecaFundamentos bf = new BibliotecaFundamentos();
        int num = 2;
        System.out.println("El numero " + num + " es par? " + bf.isPar(num));
        List<Integer> listaDivisores = bf.getDivisoresV2(num);
        System.out.println("Los divisores de " + num + " son: " + listaDivisores);
        System.out.println("La cantidad de divisores son: " + listaDivisores.size());
        if (listaDivisores.size()==2) {
            System.out.println("El numero " + num + " es primo");
        } else {
            System.out.println("El numero " + num + " NO es  primo");
        }
        System.out.println("=====================");
        num = 7;
        System.out.println("El numero " + num + " es primo? " + bf.isPrimo(num));
    }
}