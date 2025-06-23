/* Nama File : ReadSerializedPerson.java
*  Deskripsi : Program untuk serialisasi objek person
*  Pembuat : Muhammad Shafwan Raihan S_24060123140120
*  Tanggal : 19 / 05 / 2025
*/

import java.io.*;

public class ReadSerializedPerson {
    public static void main(String[] args) {
        Person person = null;
        try{
            FileInputStream f = new FileInputStream("person.ser");
            ObjectInputStream s = new ObjectInputStream(f);
            person = (Person)s.readObject();
            s.close();
            System.out.println("Serialized person name = "+person.getName());
        }catch(Exception ioe) {
            ioe.printStackTrace();
        }
    }
}
