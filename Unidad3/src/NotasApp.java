import java.util.Scanner;

public class NotasApp {
    public static void main(String[] args) {
        // Supongamos 3 notas, debemos calcular el promedio
        float n1, n2, n3, promedio;
        // Metodo de entrada de datos
        Scanner leer = new Scanner(System.in); // Create a Scanner object
        System.out.print("Ingrese Nota1: ");
        n1 = leer.nextFloat();
        System.out.print("Ingrese Nota2: ");
        n2 = leer.nextFloat();
        System.out.print("Ingrese Nota3: ");
        n3 = leer.nextFloat();
        promedio = getPromedio3(n1, n2, n3);
        System.out.println("El promedio final es: " + promedio);
        /*if (promedio >= 4) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }*/
        if (isAprobado(promedio, 4)){
            System.out.println("Aprobado");
        }else{
            System.out.println("Reprobado");
        }
    }

    public static float getPromedio3(float nota1, float nota2, float nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }

    public static boolean isAprobado(float valor, float minimo){
        if (valor >= minimo){
            return true;
        }
        return false;
    }
}
