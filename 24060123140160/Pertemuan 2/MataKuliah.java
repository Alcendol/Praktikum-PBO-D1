/* Nama File   : MataKuliah.java
 * Deskripsi   : Kelas MataKuliah untuk mengelola informasi mata kuliah, meliputi ID, nama, dan jumlah SKS.
 * Pembuat     : Pieter Mikha Pangondian Partogi Sihombing/24060123140160
 * Tanggal     : Senin, 3 Februari 2025
 */

 package tugas2;

 public class MataKuliah {
     // Atribut private untuk data mata kuliah
     private String id;
     private String nama;
     private Integer sks;
     
     // Konstruktor default: inisialisasi dengan nilai awal kosong dan 0 SKS
     public MataKuliah() {
         this.id = "";
         this.nama = "";
         this.sks = 0;
     }
     
     // Konstruktor dengan parameter: mengatur ID, nama, dan SKS berdasarkan input
     public MataKuliah(String id, String nama, Integer sks) {
         this.id = id;
         this.nama = nama;
         this.sks = sks;
     }
     
     // Selektor untuk mendapatkan informasi mata kuliah
     public String getId() {
         return this.id;
     }
     public String getNama() {
         return this.nama;
     }
     public Integer getSks() {
         return this.sks;
     }
     
     // Mutator untuk mengubah nilai-nilai atribut mata kuliah
     public void setId(String id) {
         this.id = id;
     }
     public void setNama(String nama) {
         this.nama = nama;
     }
     public void setSks(Integer sks) {
         this.sks = sks;
     }
 }
 