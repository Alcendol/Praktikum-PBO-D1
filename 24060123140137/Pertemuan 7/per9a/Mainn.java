/*
 * Nama File    : Mainn.java
 * Deskripsi    : Main program untuk mendemonstrasikan polymorphism inclusion:
 *                menyimpan Programmer dan Manager sebagai Pegawai,
 *                lalu memanggil tampilData() secara uniform.
 * Pembuat      : Noval Putra Barliyanda / 24060123140137
 * Tanggal      : 26 April 2025
 */

import java.util.ArrayList;

public class Mainn {
    public static void main(String[] args) {
        Pegawai pegawai1 = new Programmer("Mira");
        Pegawai pegawai2 = new Manager("Joko");
        Pegawai pegawai3 = new Manager("Argo");
        ArrayList<Pegawai> emps = new ArrayList<>();
        emps.add(pegawai1);
        emps.add(pegawai2);
        emps.add(pegawai3);
        for (Pegawai emp : emps) {
            emp.tampilData();
        }
    }
}

/*  
   1) Polimorfisme bikin kita cukup nyimpen semua objek Programmer & Manajer ke list Pegawai,
      trus manggil emp.tampilData() aja; JVM otomatis milih versi bonus atau tunjangan, 
      jadi kode main singkat dan ga ribet if-else.

   2) Kalo mau nambah pegawai4, pegawai5 tapi ga pake polimorfisme, kita kudu bedain jenis
      pegawai pake if-else atau list terpisah, bikin kode makin panjang & rawan salah; 
      dengan polimorfisme cukup emps.add(pegawaiBaru) dan loop lama masih jalan mulus. 
*/