package Class;

public class Player extends Person {

    private final static char J1 = 'x';

    private final static char J2 = 'o';

    public Player() {
    }

    public Player(String nombre) {
        super(nombre);

    }

    /**
     * @return the j1
     */
    public char getJ1() {
        return J1;
    }

    /**
     * @param j1 the j1 to set
     */
    /**
     * @return the j2
     */
    public char getJ2() {
        return J2;
    }

    /**
     * @param j2 the j2 to set
     */
    @Override
    public String toString() {
        return "Player{" + "j1=" + J1 + ", j2=" + J2 + '}';
    }

}
