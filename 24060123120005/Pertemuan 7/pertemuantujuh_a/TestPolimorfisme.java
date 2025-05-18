/*
 * Nama File : Manajer.java
 * Deskripsi : Main class untuk menguji polimorfisme inclusion
 * Pembuat : Patricia Gabrielle Yudianto  
 * Tanggal : 27 April 2025
 */

import java.util.ArrayList;

public class TestPolimorfisme {
    public static void main(String[] args) {
        Pegawai pegawai = new Programmer("Mira, ");
        Pegawai pegawai2 = new Manajer("Joko, ");
        Manajer pegawai3 = new Manajer("Argo, ");

        ArrayList<Pegawai> emps = new ArrayList<>();
        emps.add(pegawai);
        emps.add(pegawai2);
        emps.add(pegawai3);

        for (Pegawai emp : emps) {
            emp.tampilData();
        }
    }
}

/*
 * 1. Outputnya sudah sama seperti yang di modul, namun saya harus rubah sedikit
 * di mainnya agar bisa sama
 * dengan output di modul (kalo pakai sama persis modul ada yang beda)
 * 2. Dengan polimorfisme kita cukup pakai satu tipe dasar (Pegawai) dan satu
 * method tampilData() untuk semua jenis
 * pegawai (Programmer, Manajer). Kode jadi lebih ringkas dan saat runtime java
 * otomatis memanggil versi tampilData()
 * yang sesuai dengan objek sebenarnya, ini membuat kode lebih mudah dibaca dan
 * diupdate (jika ingin ubah sesuatu secara
 * general)
 * 3. Tanpa polimorfisme tiap kali kita tambahkan pegawai4 atau pegawai5, kita
 * harus membuat overload baru di main
 * untuk tiap tipe, kita harus ubah banyak baris kode kalau format tampilannya
 * nanti berubah
 */