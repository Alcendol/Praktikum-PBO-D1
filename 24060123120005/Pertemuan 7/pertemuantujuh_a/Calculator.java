/*
 * Nama File : Calculator.java
 * Deskripsi : Contoh untuk Ad Hoc - Overloading
 * Pembuat : Patricia Gabrielle Yudianto
 * Tanggal : 27 April 2025
 */

/*Syarat method overloading:
- Nama method sama.
- Daftar parameter (jumlah atau tipe) berbeda.
- Boleh berbeda tipe pengembalian, tapi compiler membedakannya lewat signature parameter. */

public class Calculator {
    // Overloading berdasarkan jumlah parameter
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloading berdasarkan tipe parameter
    public double add(double a, double b) {
        return a + b;
    }
}