import java.io.*;

public class ArchivoPartida {
    public static void guardar(Juego juego){
        
        try {
        
            PrintWriter pw=new PrintWriter("partida.txt");

            pw.println(juego.getJugador1().getNombre());
            pw.println(juego.getJugador1().getSimbolo());

            pw.println(juego.getJugador2().getNombre());
            pw.println(juego.getJugador2().getSimbolo());

            char[][] t=juego.getTablero().getTablero();

            for(int i=0;i<10;i++){
                for(int j=0;j<10;j++){
                    pw.print(t[i][j]);
                }
                pw.println();
            }

            pw.close();

            System.out.println("Partida gardada");
        }catch(Exception e){
            System.out.println("Error al guardar");
        }
    }

    public static void cargar(Juego juego){
        try{

            BufferedReader br=new BufferedReader(new FileReader("partida.txt"));

            String n1=br.readLine();
            char s1=br.readLine().charAt(0);

            String n2=br.readLine();
            char s2=br.readLine().charAt(0);

            juego.setJugador1(new Jugador(n1,s1));
            juego.setJugador2(new Jugador(n2,s2));

            char[][] t=new char[10][10];

            for (int i=0;i<10;i++){
                String linea=br.readLine();

                for(int j=0;j<10;j++){
                    t[i][j]=linea.charAt(j);
                }
            }

            juego.getTablero().setTablero(t);
            br.close();
            System.out.println("Partida cargada");
        }catch(Exception e){
            System.out.println("No existe partida guardada");
        }
    }
}

