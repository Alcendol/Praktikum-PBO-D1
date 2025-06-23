/* Nama File : SerializePerson.java
*  Deskripsi : Program untuk serialisasi objek person
*  Pembuat : Muhammad Shafwan Raihan S_24060123140120
*  Tanggal : 19 / 05 / 2025
*/

import java.io.*;

//class person
class Person implements Serializable{
    private String name;
    public Person(String n) {
        name = n;
    }
    public String getName() {
        return name;
    }
}
//class SerializePerson
public class SerializePerson {
    public static void main(String[] args) {
        Person person = new Person("Panji");
        try{
            FileOutputStream f= new FileOutputStream("person.ser");
            ObjectOutputStream s = new ObjectOutputStream(f);
            s.writeObject(person);
            System.out.println("Selesai menulis objek person");
            s.close();
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
