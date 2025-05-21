/**
 * File : Person.java
 * Deskripsi : Person database model (Serializable)
 */
import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = 1L;  // Add serialVersionUID
    private int id;
    private String name;

    public Person(String n) {
        this.name = n;
    }

    public Person(int i, String n) {
        this.id = i;
        this.name = n;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}