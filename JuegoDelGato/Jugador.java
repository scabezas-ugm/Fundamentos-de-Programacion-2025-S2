package JuegoDelGato;

public class Jugador {
    
    private String nombre;
    private String rut;
    private char caracter;

    public Jugador(){
        this.nombre = "Sin Nombre";
        this.rut = "Sin RUT";
        this.caracter = '-';
    }

    // accesadores
    public String getNombre(){
        return this.nombre;
    }

    public String getRut(){
        return this.rut;
    }

    public char getCaracter(){
        return this.caracter;
    }

    // mutadores

    public void setNombre(String _n){
        this.nombre = _n;
    }

    public void setRut(String _n){
        this.rut = _n;
    }

    public void setCaracter(char _n){
        this.caracter = _n;
    }

    public String toString(){
        return "Jugador\nNombre: " + this.nombre + "\nRUT: " + this.rut + "\nJuega con: " + this.caracter;
    }
}
