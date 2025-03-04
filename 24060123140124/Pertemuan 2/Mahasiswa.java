/*  Nama File   : Mahasiswa.java 
    Deskripsi   : Kodingan ini adalah atribut dan method dalam class Mahasiswa
    Pembuat     : Muhammad Paruda Pradayan / 24060123140124
    Tanggal     : 28 - Februari - 2025
*/

import java.util.ArrayList;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String prodi;
    private ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    // Konstruktor tanpa parameter
    public Mahasiswa() {
        this.nim = "";
        this.nama = "";
        this.prodi = "";
        this.listMatkul = new ArrayList<>();
        this.dosenWali = new Dosen();
        this.kendaraan = new Kendaraan();
    }

    // Konstruktor dengan parameter
    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatkul = new ArrayList<>();
        this.dosenWali = new Dosen();
        this.kendaraan = new Kendaraan();
    }

    // Selektor
    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getProdi() {
        return prodi;
    }

    public Dosen getDosenWali() {
        return dosenWali;
    }

    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    public ArrayList<MataKuliah> getListMatkul() {
        return listMatkul;
    }

    // Mutator
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

    // Method untuk menambahkan mata kuliah
    public void tambahMatkul(MataKuliah matkul) {
        listMatkul.add(matkul);
    }

    // Method untuk menghapus mata kuliah
    public void hapusMatkul(MataKuliah matkul) {
        listMatkul.remove(matkul);
    }

    // Method untuk mendapatkan jumlah SKS dari listMatkul
    public int getJumlahSKS() {
        int total = 0;
        for (MataKuliah matkul : listMatkul) {
            total += matkul.getsks();
        }
        return total;
    }

    // Method untuk mendapatkan jumlah mata kuliah yang diambil
    public int getJumlahMatKul() {
        return listMatkul.size();
    }

    // Method untuk menampilkan data mahasiswa (printMhs)
    public void printMhs() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }

    // Method untuk menampilkan detail data mahasiswa (printDetailMhs)
    public void printDetailMhs() {
        printMhs();
        System.out.println("Daftar Mata Kuliah:");
        for (MataKuliah mk : listMatkul) {
            System.out.println("  ID: " + mk.getidMatkul() + ", Nama: " + mk.getnama() + ", SKS: " + mk.getsks());
        }
        System.out.println("Dosen Wali: " + dosenWali.getnama() + " (NIP: " + dosenWali.getnip() + ", Prodi: " + dosenWali.getprodi() + ")");
        System.out.println("Kendaraan: " + kendaraan.getjenis() + " (No. Plat: " + kendaraan.getnoPlat() + ")");
    }
}