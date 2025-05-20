/*
File         : Manusia.java
Deskripsi    : Kelas dasar untuk Manusia
Pembuat      : Novanza Edgar Wibowo / 24060123130055
Tanggal      : 22 Maret 2025
*/

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Manusia {
    protected String nama;
    protected Date tglMulaiKerja;
    protected String alamat;
    protected int pendapatan;
    
    protected static int counterMns = 0;
    
    public Manusia(String nama, String tglMulaiKerja, String alamat, int pendapatan) {
        this.nama = nama;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        this.tglMulaiKerja = parseDate(tglMulaiKerja);
        counterMns++;
    }
    
    // Method untuk parsing tanggal (format: dd-MM-yyyy)
    protected Date parseDate(String dateStr) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        try {
            return sdf.parse(dateStr);
        } catch(ParseException e) {
            System.out.println("Error parsing date: " + dateStr);
            return new Date();
        }
    }
    
    // Menghitung masa kerja: (tahun sekarang - tahun mulai kerja) + konstanta digit
    public int hitungMasaKerja(int digit) {
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        int currentYear = Integer.parseInt(sdf.format(now));
        int startYear = Integer.parseInt(sdf.format(tglMulaiKerja));
        return (currentYear - startYear) + digit;
    }
    
    public void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Mulai Kerja: " + tglMulaiKerja);
        System.out.println("Alamat: " + alamat);
        System.out.println("Pendapatan: " + pendapatan);
    }
    
    public static int getCounterMns() {
        return counterMns;
    }
}
