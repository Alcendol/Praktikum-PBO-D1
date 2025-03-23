/* Nama File    : Mahasiswa.java
 * Deskripsi    : Berisi atribut dan method dalam class Mahasiswa
 * Pembuat      : Patricia Gabrielle Yudianto
 * Tanggal      : 2 Maret 2025
 */

import java.util.ArrayList;

public class Mahasiswa {
    // ATRIBUT
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatkul; // Pakai ArrayList biar gak perlu mikir mau ukurannya berapa, sama bisa di add
                                      // dan remove
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    // METHOD

    // kontruktor
    public Mahasiswa() {
        this.nim = "";
        this.nama = "";
        this.prodi = "";
        this.listMatkul = new ArrayList<>(); // Inisialisasi ArrayList dengan list kosong
    }

    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatkul = new ArrayList<>(); // Inisialisasi ArrayList dengan list kosong
    }

    // selektor
    public String getNim() {
        return this.nim;
    }

    public String getNama() {
        return this.nama;
    }

    public String getProdi() {
        return this.prodi;
    }

    public int getJumlahSKS() {
        int i;
        int totalSks = 0;

        for (i = 0; i < listMatkul.size(); i++) {
            totalSks = totalSks + listMatkul.get(i).getSks();
        }
        return totalSks;
    }

    public int getJumlahMatKul() {
        return listMatkul.size();
    }

    public Dosen getDosenWali() {
        return this.dosenWali;
    }

    public Kendaraan getKendaraan() {
        return this.kendaraan;
    }

    // mutator
    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    // lainnya
    public void addMatkul(MataKuliah newMatkul) {
        listMatkul.add(newMatkul); // .add untuk nambahin objek newMatkul bertipe MataKuliah ke dalem list punya
                                   // listMatkul, dipake kalo mau nambahin banyak objek ke dalam sebuah atribut
                                   // (misal satu doang gaperlu .add, langung pake this.blabla = blabla; aja)
    }

    public void printMhs() {
        System.out.println("Mahasiswa : " + this.nama + "(" + this.nim + ") - " + this.prodi);
    }

    public void printDetailMhs() {
        System.out.println("Nim : " + this.nim);
        System.out.println("Nama : " + this.nama);
        System.out.println("Prodi : " + this.prodi);

        System.out.println("Daftar Mata Kuliah : ");
        int i = 0;
        for (i = 0; i < getJumlahMatKul(); i++) {
            System.out.println("- " + listMatkul.get(i).getNama());
        }
        System.out.println(
                "Data Dosen Wali : " + dosenWali.getNama() + "," + dosenWali.getNip() + "," + dosenWali.getProdi());
        System.out.println("Data Kendaraaan : " + kendaraan.getNoPlat() + "," + kendaraan.getJenis());
    }
}