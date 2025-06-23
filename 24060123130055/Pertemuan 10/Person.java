/**
 * File : Person.java
 * Deskripsi : Person database model
 * Pembuat      : Novanza Edgar Wibowo / 24060123130055
 * Tanggal      : 20 Mei 2025
 */

public class Person {
    private int id;
    private String name;

    // Constructor untuk person baru (tanpa id)
    public Person(String n) {
        this.name = n;
    }

    // Constructor untuk person dengan id
    public Person(int i, String n) {
        this.id = i;
        this.name = n;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}
