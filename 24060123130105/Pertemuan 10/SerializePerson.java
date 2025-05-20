/**
 * File : SerializePerson.java
 * Deskripsi : Program untuk serialisasi objek Person
 */

 import java.io.*;

 // class Person
 class Person implements Serializable {
     private String name;
 
     public Person(String n) {
         name = n;
     }
 
     public String getName() {
         return name;
     }
 }
 
 // class SerializePerson
 public class SerializePerson {
     public static void main(String[] args) {
         Person person = new Person("Panji");
         Person person2 = new Person("laim");
         try {
             FileOutputStream f = new FileOutputStream("person.ser");
             ObjectOutputStream s = new ObjectOutputStream(f);
             s.writeObject(person);
             s.writeObject(person2);
             System.out.println("selesai menulis objek person");
             s.close();
         } catch (IOException e) {
             e.printStackTrace();
         }
     }
 }
 