import java.util.Scanner;
public class Game {   
    
    // Metodo para posicionar los barcos
    public void tablero() {
            String[][] lista= {{" "," "," "," "," "," "," "," "," "},{" "," "," "," "," "," "," "," "," "},{" "," "," "," "," "," "," "," "," "},{" "," "," "," "," "," "," "," "," "},{" "," "," "," "," "," "," "," "," "},
            {" "," "," "," "," "," "," "," "," "},{" "," "," "," "," "," "," "," "," "},{" "," "," "," "," "," "," "," "," "},{" "," "," "," "," "," "," "," "," "}};
            System.out.println("                         Jugador 1");
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
    }
    // Metodo para posicionar los tiros.
    public void tiros() {

    }
    // Función principal
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        // Usamos la clase BufferedReader para leer cadenas de texto
        Game Game = new Game(); // Se crea un objeto
        Game.tablero();
    }
}
