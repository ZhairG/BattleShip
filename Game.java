import java.util.Scanner;
public class Game {   
    Scanner sc = new Scanner(System.in);     
    int PJ=1, PJ2=2;
    // Metodo para crear el tablero de los jugadores
    public void tablero() {
            String[][] lista1= {{" "," "," "," "," "," "," "," "," "},{" "," "," "," "," "," "," "," "," "},{" "," "," "," "," "," "," "," "," "},{" "," "," "," "," "," "," "," "," "},{" "," "," "," "," "," "," "," "," "},
            {" "," "," "," "," "," "," "," "," "},{" "," "," "," "," "," "," "," "," "},{" "," "," "," "," "," "," "," "," "},{" "," "," "," "," "," "," "," "," "}};
            System.out.println("                         Jugador 1");
            System.out.println("     A     B     C     D     E     F     G     H     I");
            System.out.println("  -------------------------------------------------------");
            for (int fila = 0; fila < lista1.length; fila++) {
                System.out.print(fila+" ");
                for (int columna = 0; columna < lista1[fila].length; columna++) {
                     System.out.print("|  "+lista1[fila][columna]+"  ");
                }
                System.out.println("|");
                System.out.println("  -------------------------------------------------------");
            }
    }
    // Metodo para crear el tablero de los enemigos.
    public void tablero2() {
        String[][] lista= {{" "," "," "," "," "," "," "," "," "},{" "," "," "," "," "," "," "," "," "},{" "," "," "," "," "," "," "," "," "},{" "," "," "," "," "," "," "," "," "},{" "," "," "," "," "," "," "," "," "},
        {" "," "," "," "," "," "," "," "," "},{" "," "," "," "," "," "," "," "," "},{" "," "," "," "," "," "," "," "," "},{" "," "," "," "," "," "," "," "," "}};
        System.out.println("                      Campo del Enemigo");
        System.out.println("     A     B     C     D     E     F     G     H     I");
            System.out.println("  -------------------------------------------------------");
            for (int fila = 0; fila < lista.length; fila++) {
                System.out.print(fila+" ");
                for (int columna = 0; columna < lista[fila].length; columna++) {
                     System.out.print("|  "+lista[fila][columna]+"  ");
                }
                System.out.println("|");
                System.out.println("  -------------------------------------------------------");
            }
            tiros();
    }
    // Metodo para posicionar los tiros.
    public void tiros() {
       
    }
    // Función principal
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        Game Game = new Game(); 
        
        Game.tablero();
        int barcos=3;
        while (barcos>0) {
            System.out.print("Elija el tamaño de sus barcos: ");
            int tam=sc.nextInt();
            // Codigo para elegir el tamaño de los barcos y su posicion en la tabla.
            break;
        }
        Game.tablero2();
    }
}
