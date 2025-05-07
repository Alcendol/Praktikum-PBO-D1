/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author LENOVO
 */
public class KontrolSenjata {
    private Senjata senjata;

    public KontrolSenjata(Senjata s) {
        this.senjata = s;
    }

    public boolean isAdaPeluru() {
        return senjata.getPeluru() > 0;
    }

    public void isiPeluru(int jumPeluru) {
        senjata.setPeluru(senjata.getPeluru() + jumPeluru);
        System.out.println(">> Peluru berhasil ditambah: " + jumPeluru);
    }

    public void menembak(int jumlah) {
        System.out.println(">> Siap menembak " + jumlah + " kali");
        for (int i = 0; i < jumlah; i++) {
            if (isAdaPeluru()) {
                System.out.println(senjata.getBunyi());
                senjata.setPeluru(senjata.getPeluru() - 1);
            } else {
                System.out.println("Gagal tembak, Peluru Habis");
            }
        }
        System.out.println(">> Peluru sisa: " + senjata.getPeluru());
    }

    public String menusuk() {
        if (senjata.isMenusuk()) {
            return "Menusuk dengan bayonet";
        } else {
            return "Bayonet belum terpasang";
        }
    }

    public void pasangBayonet() {
        senjata.setMenusuk(true);
    }

}

/*Nama: Muhammad Helmi Abdulbaqi
 * NIM: 24060123130076
 * LAB: D1
 */


    
