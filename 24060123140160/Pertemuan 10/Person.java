/*
 * Nama File : Person.java
 * Deskripsi : Model entitas Person dengan id dan nama
 * Pembuat   : Pieter Mikha Pangondian Partogi Sihombing / 24060123140160
 * Tanggal   : 20 Mei 2025
 */
public class Person {

    private int    id;
    private String name;

  
    public Person(String n) {
        name = n;
    }



    public Person(int i, String n) {
        id   = i;
        name = n;
    }


    public int    getId()   { return id;   }
    public String getName() { return name; }
}