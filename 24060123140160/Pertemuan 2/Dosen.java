/* Nama File   : Dosen.java
 * Deskripsi   : Kelas Dosen untuk menyimpan informasi dosen, termasuk NIP, nama, dan program studi.
 * Pembuat     : Pieter Mikha Pangondian Partogi Sihombing/24060123140160
 * Tanggal     : Senin, 3 Februari 2025
 */

 package tugas2;

 public class Dosen {
     // Atribut private untuk menyimpan data dosen
     private String nip;
     private String nama;
     private String prodi;
     
     // Konstruktor default: menginisialisasi atribut dengan nilai string kosong
     public Dosen() {
         this.nip = "";
         this.nama = "";
         this.prodi = "";
     }
     
     // Konstruktor dengan parameter: mengatur nilai berdasarkan input
     public Dosen(String nip, String nama, String prodi) {
         this.nip = nip;
         this.nama = nama;
         this.prodi = prodi;
     }
     
     // Selektor (getter)
     public String getNip() {
         return this.nip;
     }
     public String getNama() {
         return this.nama;
     }
     public String getProdi() {
         return this.prodi;
     }
     
     // Mutator (setter)
     public void setNip(String nip) {
         this.nip = nip;
     }
     public void setNama(String nama) {
         this.nama = nama;
     }
     public void setProdi(String prodi) {
         this.prodi = prodi;
     }
 }
 