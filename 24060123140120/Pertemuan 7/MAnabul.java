/* Nama File : MAnabul.java
*  Deskripsi : Main program MAnabul
*  Pembuat : Muhammad Shafwan Raihan S_24060123140120
*  Tanggal : 27 / 04 / 2025
*/

package Pertemuan7b;

public class MAnabul {
    public static void main(String[] args) {
        /*--------KAMUS--------*/
        Anabul kucing = new Kucing("Kucing");
        Anabul anjing = new Anjing("Anjing");
        Anabul burung = new Burung("Burung");

        /*--------ALGORITMA--------*/
        // Pemanggilan method suara dan gerakan Kucing
        kucing.infoNamaHewan();
        kucing.suara();
        kucing.gerakan();

        // Pemanggilan method suara dan gerakan Anjing
        System.out.println(" ");
        anjing.infoNamaHewan();
        anjing.suara();
        anjing.gerakan();

        // Pemanggilan method suara dan gerakan Burung
        System.out.println(" ");
        burung.infoNamaHewan();
        burung.suara();
        burung.gerakan();
    }
}
