/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tictactoe;
import Class.Board;
import Class.Player;
import Class.TicTacToe;
import java.util.Scanner;

/**
 * 
 * @author Kevin Sibaja Granados
 * @author Yordany Navarro Hernandez
 * @author James Arias Avalos
 * @author Jonathan Alfaro Herrera
 */

public class ThreeStripes {

    /**
     * @param args the command line arguments
     * 
     */
    static Scanner teclado = new Scanner(System.in);
    /**
     * 
     * este codigo presenta un tablero para el juego de TicTacToe, trae su 
     * funcion de jugar con 2 personas, J1 y J2 que viene de la clase Player.
     * Se muestra quien es el ganador o si hay un empate.
     */
    public static void main(String[] args) {
        TicTacToe callTTT = new TicTacToe();
        Player a=new Player();
        Board b = new Board();
        int row, column;
        
        boolean posValida, correcto;

        /*No salimos hasta que uno gane o no haya mas posibilidades 
        en el tablero de juego
        
        */
        while (!callTTT.endGame()) {

            do {

                //mostramos al jugador que le toca el turno 
                callTTT.showCurrentShift();

                //muestra el tablero de la partida para empezar a jugar
                callTTT.showBoard();

                correcto = false;
                row = askLocation("Elija la fila");
                column = askLocation("Elija la columna");

                //Validamos la posicion  que el usuario desea llegar
                posValida = callTTT.validatePosition(row, column);

                //Si es valido, comprobamos que no haya ningun simbolo
                if (posValida) {

                    /*Si no contiene simbolo, significa que es correcto,
                    valida si la posicion es valida
                    */
                    if (!callTTT.placeValue(row, column)) {
                        correcto = true;
                    } else {
                        System.out.println("Esta posicion ya esta ocupada");
                    }
                } else {
                    System.out.println("La posicion no es valida");
                }

                //Mientras no sea correcto, no se puede salir del do while
            } while (!correcto);
           

            /*
            depende del turno de la partida, inserta un simbolo u otro del
            del jugador 1 o jugador 2
            */
            callTTT.insert(row, column, a);

            callTTT.changeShift();
        }

        //Muestra el tablero en el cual se esta jugando
        callTTT.showBoard();
        

        //Mostramos el ganador de la partida
        callTTT.sampleWinner(a);
       
        
        

    }
    /*
    Este metodo funciona para que el usuario digite la row y column del 
    espacio que desea colocar su simbolo
    */
     public static int askLocation(String message) {

        System.out.println(message);
        int number = teclado.nextInt();

        return number-1;

    }

   

    
}
