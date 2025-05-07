/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edgar.latihanmediums;

/**
 *
 * @author LENOVO
 */
/*
 File         : KontrolSenjata.java
 Deskripsi    : class untuk mengotnrol menembak, isi peluru, bayonet dari senjata
 Pembuat      : Novanza Edgar Wibowo / 24060123130055
 Tanggal      : 6 Mei 2025 
*/

public class KontrolSenjata {
    private Senjata senjata;

    public KontrolSenjata(Senjata s) {
        this.senjata = s;
    }

    public boolean isAdaPeluru() {
        return senjata.getPeluru() > 0;
    }

    public void isiPeluru(int jumlah) {
        senjata.setPeluru(senjata.getPeluru() + jumlah);
        System.out.println(">> Peluru berhasil ditambah: " + jumlah);
    }

    public void pasangBayonet() {
        senjata.setMenusuk(true);
    }

    public void menembak(int kali) {
        System.out.println(">> Siap menembak " + kali + " kali");
        if (!isAdaPeluru()) {
            System.out.println("Peluru Habis");
            return;
        }
        for (int i = 0; i < kali; i++) {
            if (senjata.getPeluru() > 0) {
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
