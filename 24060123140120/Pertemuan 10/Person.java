/* Nama File : Person.java
*  Deskripsi : Person database model
*  Pembuat : Muhammad Shafwan Raihan S_24060123140120
*  Tanggal : 19 / 05 / 2025
*/

public class Person {
    /*--------ATRIBUT-------- */
    private int id;
    private String name;

    /*--------METHOD-------- */
    // Konstruktor dengan parameter
    public Person(String n) {
        name = n;
    }

    // Konstruktor dengan parameter
    public Person(int i, String n) {
        id = i;
        name = n;
    }

    // Selektor id
    public int getid() {
        return id;
    }

    // Selektor Name
    public String getName() {
        return name;
    }
}
