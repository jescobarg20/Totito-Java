import java.util.Scanner;

public class Juego {
    
    private Jugador jugador1;
    private Jugador jugador2;
    private final Tablero tablero;
    private Jugador turno;

    Scanner sc=new Scanner(System.in);

    public Juego(){
        tablero=new Tablero();
    }

    public void nuevoJuego(){
        System.out.print("Nombre jugador 1: ");
        String n1=sc.nextLine();

        System.out.print("Simbolo jugador 1:");
        char s1=sc.nextLine().charAt(0);

        System.out.print("Nombre jugador 2: ");
        String n2=sc.nextLine();

        System.out.print("Simbolo juador 2: ");
        char s2=sc.nextLine().charAt(0);

        jugador1=new Jugador(n1,s1);
        jugador2=new Jugador(n2,s2);

        turno=jugador1;
    }

    public void jugar(){

        boolean jugando=true;

        while(jugando){
            tablero.mostrar();
            
            System.out.println("Turno de "+turno.getNombre());

            System.out.print("Fila: ");
            int f=sc.nextInt();

            System.out.print("Columna: ");
            int c=sc.nextInt();

            sc.nextLine();

            tablero.colocar(f,c,turno.getSimbolo());

            if(tablero.verificar(turno.getSimbolo())){
                tablero.mostrar();

                System.out.println("GANADOR "+turno.getNombre());
                jugando=false;
                break;
            }

            turno=(turno==jugador1)?jugador2:jugador1;

            System.out.println("1 Continuar");
            System.out.println("2 Guardar");
            System.out.println("3 Salir");

            int op=sc.nextInt();
            sc.nextLine();

            if(op==2){
                ArchivoPartida.guardar(this);
            }
            if(op==3){
                jugando=false;
            }
        }
    }

    public Jugador getJugador1(){return jugador1;}
    public Jugador getJugador2(){return jugador2;}
    public Tablero getTablero(){return tablero;}

    public void setJugador1(Jugador j){jugador1=j;}
    public void setJugador2(Jugador j){jugador2=j;}
}
