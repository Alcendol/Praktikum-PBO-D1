/* Nama File : Anabul.java
 * Deskripsi : Berisi atribut dan method dalam class Anabul
 * Pembuat   : Naifah Athika Swedy / 24060123140142
 * Tanggal   : Rabu, 7 Mei 2025
 * */

package pertemuanDelapan;

public abstract class Anabul {
    protected String nama;

    protected Anabul(String nama) {
        this.nama = nama;
    }

    public abstract void bergerak();   
    public abstract void bersuara();   
}