/*
 * Nama File : SerializePerson.java
 * Deskripsi : Menyimpan objek Person ke berkas person.ser (Java serialization)
 * Pembuat   : Pieter Mikha Pangondian Partogi Sihombing / 24060123140160
 * Tanggal   : 20 Mei 2025
 */
import java.io.*;
class Person implements Serializable {
    private String name;
    public Person(String n) { name = n; }
    public String getName() { return name; }
}

public class SerializePerson {
    public static void main(String[] args) {

        Person p = new Person("Andi");

        try (ObjectOutputStream oos =
                 new ObjectOutputStream(new FileOutputStream("person.ser"))) {

            oos.writeObject(p);
            System.out.println("Selesai menulis objek person");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}