import java.util.Random;

public class ListaRandom{
    public static void main(String[] args){
        int tamano = 3;
        BibliotecaFundamentos bf = new BibliotecaFundamentos();
        EstadisticaEnteros ee = new EstadisticaEnteros();
        int[] listaArray = new int[tamano];
        int[] listaArray2 = new int[tamano];
        Random aleatorio = new Random();

        //Recorrido del Array
        for(int i = 0; i < listaArray.length; i++){
            listaArray[i] = aleatorio.nextInt(50);
            listaArray2[i] = aleatorio.nextInt(50);
            System.out.println("Lista ("+i+") - Valor: " + listaArray[i]);
            System.out.println("Lista ("+i+") - Valor: " + listaArray2[i]);
        }

        // Obtener el valor minimo
        //bf.getMinimoLista(listaArray);
        //System.out.println("Valor Mínimo: " + ee.getMinimoLista(listaArray2));
        //System.out.println("Valor Máximo: " + ee.getMaximoLista(listaArray2));
        //System.out.println("Valor Promedio: " + ee.getPromedioLista(listaArray2));
        //System.out.println("===");
        EstadisticaEnteros estEnteros = new EstadisticaEnteros();
        estEnteros = estEnteros.getEstadisticasLista(listaArray2);
        //System.out.println("EE Min: " + estEnteros.getMinimo());
        //System.out.println("EE Max: " + estEnteros.getMaximo());
        //System.out.println("EE Prom: " + estEnteros.getPromedio());
        // comparar 2 listas
        System.out.println("===");
        ee = ee.getEstadisticasLista(listaArray);
        System.out.println("Minimo L1: " + ee.getMinimo() + " VS Minimo L2: " + estEnteros.getMinimo());
        System.out.println("Maximo L1: " + ee.getMaximo() + " VS Maximo L2: " + estEnteros.getMaximo());

    }
}