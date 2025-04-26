/*
 * Nama File    : Main.java
 * Deskripsi    : Program untuk testing
 * Pembuat      : Muhammad Firzi Ryadi / 24060123140202
 * Tanggal      : 24 April 2025
 */
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Pegawai pegawai1 = new Programmer("Mira");
        Pegawai pegawai2 = new Manager("Joko");
        Pegawai pegawai3 = new Manager("Argo");

        ArrayList<Pegawai> emp = new ArrayList<>();
        emp.add(pegawai1);
        emp.add(pegawai2);
        emp.add(pegawai3);

        for (Pegawai e : emp) {
            e.tampilData();
            System.out.println();
        }
    }
}

/* 
 * 1. POlimorfisme di sini memungkinkan kita memperlakukan semua objek programmer
 * dan Manager ke dalam satu tipe induk yaitu Pegawai
 * 2. Jika tidak menggunakan polimorfisme di sini,kita harus membuat list terpisah
 * untuk masing masing jenis pegawai.
*/