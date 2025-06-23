/* Nama File : KontrolSenjata.java
*  Deskripsi : Atribut dan method class KontrolSenjata
*  Pembuat : Muhammad Shafwan Raihan S_24060123140120
*  Tanggal : 07 / 05 / 2025
*/

package com.mycompany.senjata;

public class KontrolSenjata {
    /*--------ATRIBUT--------*/
    private Senjata senjata;

    /*--------METHOD--------*/
    // Konstruktor dengan parameter
    public KontrolSenjata(Senjata s) {
        this.senjata = s;
    }

    // Method isAdaPeluru() yang menghasilkan True jika ada peluru dalam senjata
    public boolean isAdaPeluru() {
        return senjata.getPeluru() > 0;
    }

    // Method isiPeluru() untuk menambah jumlah peluru ke senjata
    public void isiPeluru(int jumlahPeluru) {
        senjata.setPeluru(jumlahPeluru);
        System.out.println(">> Peluru berhasil ditambah: " + jumlahPeluru);
    }

    // Method menembak() untuk melakukan tembakan
    public void menembak(int jumlah) {
        System.out.println(">> Siap menembak " + jumlah + " kali");
        for (int i = 0; i < jumlah; i++) {
            if (isAdaPeluru()) {
                System.out.println(senjata.getBunyi());
                senjata.setPeluru(-1);
            } else {
                System.out.println("Peluru Habis");
            }
        }
        System.out.println(">> Peluru sisa: " + senjata.getPeluru());
    }

    // Method menusuk() untuk melakukan tusukan
    public void menusuk() {
        if (senjata.isMenusuk()) {
            System.out.println("Menusuk musuh!");
        } else {
            System.out.println("Bayonet tidak terpasang");
        }
    }

    // Method pasangBayonetk() untuk memasang bayonet
    public void pasangBayonet() {
        senjata.setMenusuk(true);
    }
}

