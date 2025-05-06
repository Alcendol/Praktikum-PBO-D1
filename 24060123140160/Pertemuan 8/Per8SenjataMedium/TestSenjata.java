/*
 * File      : TestSenjata.java
 * Deskripsi : Main program demonstrasi
 * Penulis   : Pieter Mikha Pangondian Partogi S / 24060123140160
 * Tanggal   : 5 Mei 2025
 */
package per8senjata;

public class TestSenjata {
    public static void main(String[] args) {

        Senjata ak47 = new Senjata("TAR");
        Senjata m16  = new Senjata("DOR");

        KontrolSenjata kontrolAK47 = new KontrolSenjata(ak47);
        KontrolSenjata kontrolM16  = new KontrolSenjata(m16);

        /* sesi AK‑47 */
        kontrolAK47.menembak(2);   // peluru kosong
        kontrolAK47.isiPeluru(3);  // isi 3
        kontrolAK47.menembak(5);   // coba tembak 5

        System.out.println("================================");

        /* sesi M‑16 */
        kontrolM16.menembak(1);    // peluru kosong
        kontrolM16.isiPeluru(5);   // isi 5
        kontrolM16.menembak(2);    // tembak 2
    }
}
