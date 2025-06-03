/* Nama File : Anabul.java
*  Deskripsi : Atribut dan Method class Anabul
*  Pembuat : Muhammad Shafwan Raihan S_24060123140120
*  Tanggal : 27 / 04 / 2025
*/

package Pertemuan7b;

public class Anabul {
    /*--------ATRIBUT--------*/
    protected String Nama;

    /*--------METHOD--------*/
    // Konstruktor dengan parameter
    public Anabul(String Nama) {
        this.Nama = Nama;
    }

    // Selektor Nama
    public String getNama(){
        return Nama;
    }

    // Mutator Nama
    public void setNama(String Nama){
        this.Nama = Nama;
    }

    // Method suara() untuk suara hewan peliharaan
    public void suara() {
        System.out.println(" ");
    }

    // Method gerakan() untuk gerakan hewan peliharaan
    public void gerakan() {
        System.out.println(" ");
    }

    // Method infoNamaHewan() untuk menampilkan nama hewan peliharaan
    public void infoNamaHewan() {
        System.out.println("Nama hewan: " + getNama());
    }
}