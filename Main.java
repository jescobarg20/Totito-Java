//Nombre: Johnny Brandon Escobar Garcia
//Carnet: 7690-25-1502

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        Juego juego=new Juego();

        OUTER:
        while (true) {
            System.out.println("\nMenu");
            System.out.println("1 Nuevo Juego");
            System.out.println("2 Cargar Partida");
            System.out.println("3 Salir");
            
            final int op=sc.nextInt();
            sc.nextLine();
            
            switch (op) {
                case 1 -> {
                    juego.nuevoJuego();
                    juego.jugar();
                }
                case 2 -> {
                    ArchivoPartida.cargar(juego);
                    juego.jugar();
                }
                default -> {
                    break OUTER;
                }
            }
        }
    }
}
