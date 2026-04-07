//Nombre: Johnny Brandon Escobar Garcia
//Carnet: 7690-25-1502

public class Jugador {

    private final String nombre;
    private final char simbolo;

    public Jugador(String nombre, char simbolo){
        this.nombre = nombre;
        this.simbolo = simbolo;

    }

    public String getNombre(){
        return nombre;
    }

    public char getSimbolo(){
        return simbolo;
    }

}