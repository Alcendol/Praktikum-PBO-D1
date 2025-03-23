/* Nama File   : Kendaraan.java
 * Deskripsi   : Kelas Kendaraan yang menangani data kendaraan, seperti nomor plat dan jenis kendaraan.
 * Pembuat     : Pieter Mikha Pangondian Partogi Sihombing/24060123140160
 * Tanggal     : Senin, 3 Februari 2025
 */

 package tugas2;

 public class Kendaraan {
     // Atribut private untuk nomor plat dan jenis kendaraan
     private String noplat;
     private String jenis;
     
     // Konstruktor default: menginisialisasi atribut dengan nilai default (kosong)
     public Kendaraan() {
         this.noplat = "";
         this.jenis = "";
     }
     
     // Konstruktor dengan parameter: mengatur nomor plat dan jenis sesuai input
     public Kendaraan(String noplat, String jenis) {
         this.noplat = noplat;
         this.jenis = jenis;
     }
     
     // Selektor untuk mendapatkan nomor plat dan jenis kendaraan
     public String getnoplat() {
         return this.noplat;
     }
     public String getjenis() {
         return this.jenis;
     }
     
     // Mutator untuk mengubah nomor plat dan jenis kendaraan
     public void setnoplat(String noplat) {
         this.noplat = noplat;
     }
     public void setjenis(String jenis) {
         this.jenis = jenis;
     }
 }
 