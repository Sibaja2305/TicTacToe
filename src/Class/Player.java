package Class;
/**
 * 
 * Este contiene 2 varibles de tipo char que es J1 y J2, esta clase contiene para
 * J1=x y J2=o y solo contiene su get porque ya tiene su simbolo puesto para cada
 * uno y el toString.
 */
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

    
    @Override
    public String toString() {
        return "Player{" + "j1=" + J1 + ", j2=" + J2 + '}';
    }

}
