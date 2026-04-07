//Nombre: Johnny Brandon Escobar Garcia
//Carnet: 7690-25-1502

public final class Tablero {
    
    private char[][] tablero;

    public Tablero(){
        tablero = new char [10][10];
        reiniciar();
    }

    public void reiniciar(){

        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                    tablero[i][j]='-';

            }        
        }
    }

    public void mostrar(){

        System.out.println("\nTABLERO\n");
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                System.out.print(tablero[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("\nEStudiante: Johnny");
        System.out.println("Carnet: 7690-25-1502\n");
    }

    public boolean colocar(int fila, int col, char simbolo){
        if(tablero[fila][col]=='-'){
            tablero[fila][col]=simbolo;
            return true;
        }

        return false;
    }
        
    public char[][] getTablero(){
        return tablero;
    }

    public void setTablero(char[][] t){
        tablero=t;
    }

    public boolean verificar(char s){
            
        for(int i=0;i<10;i++){
            for(int j=0;j<8;j++){
                    
                if(tablero[i][j]==s &&
                    tablero[i][j+1]==s &&
                    tablero[i][j+2]==s)
                    return true;
            }
        }
        for(int i=0;i<8;i++){
            for(int j=0;j<10;j++){
                    
                if(tablero[i][j]==s &&
                    tablero[i+1][j]==s &&
                    tablero[i+2][j]==s)
                    return true;
            }
        }
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){

                if(tablero[i][j]==s &&
                    tablero[i+1][j+1]==s &&
                    tablero[i+2][i+2]==s)
                    return true;
            }
        }
        for(int i=2;i<10;i++){   
            for(int j=0;j<8;j++){

                if(tablero[i][j]==s &&
                    tablero[i-1][j+1]==s &&
                    tablero[i-2][j+2]==s)
                    return true;
            }
        }
        return false;    
    }
}