/*
 * Nama File : SerializePerson.java
 * Deskripsi : Menyimpan objek Person ke berkas person.ser (Java serialization)
 * Pembuat   : Noval Putra Barliyanda / 24060123140137
 * Tanggal   : 20 Mei 2025
 */
import java.io.*;
class Person implements Serializable {
    private static final long serialVersionUID = 1L; // Tambahkan ini
    private String name;
    public Person(String n) { name = n; }
    public String getName() { return name; }
}

public class SerializePerson {
    public static void main(String[] args) {

        Person p = new Person("Noval");

        try (ObjectOutputStream oos =
                 new ObjectOutputStream(new FileOutputStream("person.ser"))) {

            oos.writeObject(p);
            System.out.println("Selesai nulisin objek person");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// Untuk mengkompilasi dan menjalankan program, gunakan perintah berikut:
// javac SerializePerson.java
// java SerializePerson