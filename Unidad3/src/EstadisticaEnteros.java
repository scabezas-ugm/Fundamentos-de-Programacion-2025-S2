public class EstadisticaEnteros {
    private int minimo;
    private int maximo;
    private float promedio;

    // constructor por defecto
    public EstadisticaEnteros() {}

    public int getMinimoLista(int[] lista) {
        this.minimo = lista[0]; // toma el primer valor de la lista
        for (int i = 1; i < lista.length; i++) {
            if(lista[i] < this.minimo){
                this.minimo = lista[i];
            }
        }
        return this.minimo;
    }

    public int getMaximoLista(int[] lista) {
        this.maximo = lista[0]; // toma el primer valor de la lista
        for (int i = 1; i < lista.length; i++) {
            if(lista[i] > this.maximo){
                this.maximo = lista[i];
            }
        }
        return this.maximo;
    }

    public float getPromedioLista(int[] lista) {
        float suma = lista[0]; // tomamos el primer valor
        for (int i = 1; i < lista.length; i++) {
            suma += lista[i];
        }
        this.promedio = suma / lista.length;
        return this.promedio;
    }

    public EstadisticaEnteros getEstadisticasLista(int [] lista){
        this.minimo = getMinimoLista(lista);
        this.maximo = getMaximoLista(lista);
        this.promedio = getPromedioLista(lista);
        return this;
    }

    public int getMinimo(){
        return this.minimo;
    }
    public int getMaximo(){
        return this.maximo;
    }
    public float getPromedio(){
        return this.promedio;
    }
}
