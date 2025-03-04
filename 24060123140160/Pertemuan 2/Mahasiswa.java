/* Nama File   : Mahasiswa.java
 * Deskripsi   : Kelas Mahasiswa yang menangani data mahasiswa serta mengelola relasi dengan MataKuliah, Dosen, dan Kendaraan.
 * Pembuat     : Pieter Mikha Pangondian Partogi Sihombing/24060123140160
 * Tanggal     : Senin, 3 Februari 2025
 */

 package tugas2;

 import java.util.ArrayList;
 
 public class Mahasiswa {
     // Atribut private untuk data mahasiswa
     private String nim;
     private String nama;
     private String prodi;
     private int jumlMatkul;
     private ArrayList<MataKuliah> listMatKul;
     private Dosen dosenwali;
     private Kendaraan kendaraan;
     
     // Konstruktor default: menginisialisasi list mata kuliah dan jumlah mata kuliah
     public Mahasiswa() {
         this.listMatKul = new ArrayList<>();
         this.jumlMatkul = 0;
     }
     
     // Konstruktor dengan parameter: mengatur nim, nama, dan prodi
     public Mahasiswa(String nim, String nama, String prodi) {
         this.nim = nim;
         this.nama = nama;
         this.prodi = prodi;
         this.listMatKul = new ArrayList<>();
         this.jumlMatkul = 0;
     }
     
     // Selektor untuk nim, nama, dan prodi
     public String getNim() {
         return this.nim;
     }
     public String getNama() {
         return this.nama;
     }
     public String getProdi() {
         return this.prodi;
     }
     
     // Selektor untuk dosen wali dan kendaraan
     public Dosen getDosenWali() {
         return this.dosenwali;
     }
     public Kendaraan getKendaraan() {
         return this.kendaraan;
     }
     
     // Mutator untuk mengubah nim, nama, dan prodi
     public void setNim(String nim) {
         this.nim = nim;
     }
     public void setNama(String nama) {
         this.nama = nama;
     }
     public void setProdi(String prodi) {
         this.prodi = prodi;
     }
     
     // Mutator untuk menetapkan dosen wali dan kendaraan
     public void setDosenWali(Dosen dosenwali) {
         this.dosenwali = dosenwali;
     }
     public void setKendaraan(Kendaraan kendaraan) {
         this.kendaraan = kendaraan;
     }
     
     // Method untuk menambahkan mata kuliah ke dalam daftar (ArrayList)
     public void addMatkul(MataKuliah newMatKul) {
         listMatKul.add(newMatKul);
         jumlMatkul++;
     }
     
     // Method untuk menghitung total SKS dari semua mata kuliah yang diambil
     public int getJumlSKS() {
         int totalSKS = 0;
         for (MataKuliah matkul : listMatKul) {
             totalSKS += matkul.getSks();
         }
         return totalSKS;
     }
     
     // Method untuk mendapatkan jumlah mata kuliah yang diambil
     public int getJumlMatkul() {
         return jumlMatkul;
     }
     
     // Method untuk mencetak data dasar mahasiswa
     public void printMhs() {
         System.out.println("NIM: " + nim);
         System.out.println("Nama: " + nama);
         System.out.println("Prodi: " + prodi);
     }
     
     // Method untuk mencetak detail lengkap mahasiswa, termasuk mata kuliah, dosen wali, dan kendaraan
     public void printDetailMhs() {
         System.out.println("NIM: " + nim);
         System.out.println("Nama: " + nama);
         System.out.println("Prodi: " + prodi);
         // Menampilkan daftar mata kuliah yang diambil
         for (int i = 0; i < listMatKul.size(); i++) {
             System.out.println(listMatKul.get(i).getNama());
         }
         // Menampilkan nama dosen wali
         System.out.println("Dosen Wali: " + dosenwali.getNama());
         // Menampilkan nomor plat kendaraan
         System.out.println("Kendaraan: " + kendaraan.getnoplat());
     }
 }
 