package Class;
/**
 * 
 * Esta clase contiene el board y el empthy que es el vacio para el tablero y 
 * contiene sus get y set y su toString
 * 
 */
public class Board {

    private char board ;

    private char empty;

    public Board() {
    }

    public Board(char board, char empty) {
        this.board = board;
        this.empty = empty;
    }

    /**
     * @return the board
     */
    public char getBoard() {
        return board;
    }

    /**
     * @param board the board to set
     */
    public void setBoard(char board) {
        this.board = board;
    }

    /**
     * @return the empty
     */
    public char getEmpty() {
        return empty;
    }

    /**
     * @param empty the empty to set
     */
    public void setEmpty(char empty) {
        this.empty = empty;
    }

    @Override
    public String toString() {
        return "Board{" + "board=" + board + ", empty=" + empty + '}';
    }
    
}
