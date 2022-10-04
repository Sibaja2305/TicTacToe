package Class;

public class Person {

    private String nombre;

    public Person() {
    }

    public Person(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Person{" + "nombre=" + nombre + '}';
    }
    

   
    
}
