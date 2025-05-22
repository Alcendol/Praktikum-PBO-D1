/*
 * File      : KontrolSenjata.java
 * Fungsi    : Mengoperasikan objek Senjata (isi peluru & tembak).
 * Penulis   : Pieter Mikha Pangondian Partogi S / 24060123140160
 * Tanggal   : 5 Mei 2025
 */
package per8senjata;

public class KontrolSenjata {

    private final Senjata senjata;

    public KontrolSenjata(Senjata s) {
        senjata = s;
    }

    /* cek apakah masih ada peluru */
    public boolean isAdaPeluru() {
        return senjata.getPeluru() > 0;
    }

    /* isi ulang */
    public void isiPeluru(int jml) {
        senjata.setPeluru(jml);
        System.out.println(">> Peluru berhasil ditambah: " + jml);
    }

    /* aksi tembak */
    public void menembak(int banyak) {
        System.out.println(">> Siap menembak " + banyak + " kali");

        if (!isAdaPeluru()) {                   // kosong sejak awal
            System.out.println("Peluru Habis");
            return;
        }

        for (int i = 0; i < banyak; i++) {
            if (isAdaPeluru()) {
                System.out.println(senjata.getBunyi());
                senjata.setPeluru(senjata.getPeluru() - 1);
            } else {
                System.out.println("Gagal tembak, Peluru Habis");
                break;
            }
        }
        System.out.println(">> Peluru sisa: " + senjata.getPeluru());
    }
}
