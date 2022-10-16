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
 * @author Jonathan Alfaro Herrera Este Clase es el Main donde se llaman todas
 * las subclases para utilizar los metodos que se necitan para que el juego
 * pueda funcionar correctamente
 *
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
     * funcion de jugar con 2 personas, J1 y J2 que viene de la clase Player. Se
     * muestra quien es el ganador o si hay un empate.
     */
    public static void main(String[] args) {
        menu();

    }

    /**
     * Este metodo funciona para que el usuario digite la row y column del
     * espacio que desea colocar su simbolo
     *
     * @param message
     * @return
     */
    public static int askLocation(String message) {

        System.out.println(message);
        int number = teclado.nextInt();

        return number - 1;

    }

    public static int location(String mensaje) {

        int number = (int) (Math.random() * 3);

        return number;

    }

    private static void menu() {
        System.out.println("1: jugador 1 vs jugador 2");
        System.out.println("2: maquina vs maquina");
        System.out.println("3: jugador vs maquina");

        int opcion = teclado.nextInt();

        switch (opcion) {
            case 1:
                TicTacToe callTTT = new TicTacToe();
                Player a = new Player();
                Board b = new Board();
                int row,
                 column;

                boolean validPos,
                 correct;

                /**
                 * no salimos de while hasta que se llene el tablero o algun
                 * jugador gane
                 */
                while (!callTTT.endGame()) {

                    do {

                        //mostramos al jugador que le toca el turno 
                        callTTT.showCurrentShift();

                        //muestra el tablero de la partida para empezar a jugar
                        callTTT.showBoard();

                        correct = false;
                        row = askLocation("Elija la fila");
                        column = askLocation("Elija la columna");

                        //Validamos la posicion  que el usuario desea llegar
                        validPos = callTTT.validatePosition(row, column);

                        //Si es valido, comprobamos que no haya ningun simbolo
                        if (validPos) {
                            /**
                             * Si no contiene simbolo, significa que es correct,
                             * valida si la posicion es valida
                             */

                            if (!callTTT.placeValue(row, column)) {
                                correct = true;
                            } else {
                                System.out.println("Esta posicion ya esta ocupada");
                            }
                        } else {
                            System.out.println("La posicion no es valida");
                        }

                        //Mientras no sea correct, no se puede salir del do while
                    } while (!correct);

                    /**
                     * depende del turno de la partida, inserta un simbolo u
                     * otro del del jugador 1 o jugador 2
                     */
                    callTTT.insert(row, column, a);

                    callTTT.changeShift();
                }

                //Muestra el tablero en el cual se esta jugando
                callTTT.showBoard();

                //Mostramos el ganador de la partida
                callTTT.sampleWinner(a);
                break;
            case 2:
                TicTacToe callTT = new TicTacToe();
                Player B = new Player();
                Board C = new Board();

                /**
                 * no salimos de while hasta que se llene el tablero o algun
                 * jugador gane
                 */
                while (!callTT.endGame()) {

                    do {

                        //mostramos al jugador que le toca el turno 
                        //muestra el tablero de la partida para empezar a jugar
                        correct = false;
                        row = location("");
                        column = location("");

                        //Validamos la posicion  que el usuario desea llegar
                        validPos = callTT.validatePosition(row, column);

                        //Si es valido, comprobamos que no haya ningun simbolo
                        if (validPos) {
                            /**
                             * Si no contiene simbolo, significa que es correct,
                             * valida si la posicion es valida
                             */

                            if (!callTT.placeValue(row, column)) {
                                correct = true;
                                if (correct == true) {
                                    callTT.showBoard();
                                    callTT.showCurrentShiftPC();

                                }
                            }

                        }

                        //Mientras no sea correct, no se puede salir del do while
                    } while (!correct);

                    /**
                     * depende del turno de la partida, inserta un simbolo u
                     * otro del del jugador 1 o jugador 2
                     */
                    callTT.insert(row, column, B);

                    callTT.changeShift();

                }

                //Muestra el tablero en el cual se esta jugando
                callTT.showBoard();
                //Mostramos el ganador de la partida
                callTT.sampleWinnerPC(B);

                break;
            case 3:
                TicTacToe callT = new TicTacToe();
                Player Q = new Player();
                Board W = new Board();

                /**
                 * no salimos de while hasta que se llene el tablero o algun
                 * jugador gane
                 */
                while (!callT.endGame()) {

                    do {

                        //mostramos al jugador que le toca el turno 
                        callT.showCurrentShiftPCVSPlayer();

                        //muestra el tablero de la partida para empezar a jugar
                        callT.showBoard();

                        correct = false;

                        if (callT.turn == true) {
                            row = askLocation("Elija la fila");
                            column = askLocation("Elija la columna");
                        } else {
                            row = location("");
                            column = location("");
                        }

                        //Validamos la posicion  que el usuario desea llegar
                        validPos = callT.validatePosition(row, column);

                        //Si es valido, comprobamos que no haya ningun simbolo
                        if (validPos) {
                            /**
                             * Si no contiene simbolo, significa que es correct,
                             * valida si la posicion es valida
                             */

                            if (!callT.placeValue(row, column)) {
                                correct = true;
                            } else {
                                System.out.println("Esta posicion ya esta ocupada");
                            }
                        } else {
                            System.out.println("La posicion no es valida");
                        }

                        //Mientras no sea correct, no se puede salir del do while
                    } while (!correct);

                    /**
                     * depende del turno de la partida, inserta un simbolo u
                     * otro del del jugador 1 o jugador 2
                     */
                    callT.insert(row, column, Q);

                    callT.changeShift();
                }

                //Muestra el tablero en el cual se esta jugando
                callT.showBoard();

                //Mostramos el ganador de la partida
                callT.sampleWinnerPCVSPlayer(Q);

                break;

            default:
                break;

        }
    }

}
