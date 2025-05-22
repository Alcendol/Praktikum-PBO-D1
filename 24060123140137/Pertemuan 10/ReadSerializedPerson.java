/*
 * Nama File : ReadSerializedPerson.java
 * Deskripsi : Membaca objek Person yang telah diserialisasi
 * Pembuat   : Noval Putra Barliyanda / 24060123140137
 * Tanggal   : 20 Mei 2025
 */
import java.io.*;

public class ReadSerializedPerson {
    public static void main(String[] args) {

        Person data = null;

        try (ObjectInputStream ois =
                 new ObjectInputStream(new FileInputStream("person.ser"))) {

            data = (Person) ois.readObject();
            System.out.println("serialized the person name = " + data.getName());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}