// Nama File : Mahasiswa.java
// Deskripsi : Atribut dan Method class Mahasiswa
// Pembuat : Muhammad Shafwan Raihan S
// Tanggal : 27 / 02 / 2025

import java.util.ArrayList;

public class Mahasiswa {

    /*----------ATRIBUT----------*/
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    /*----------METHOD----------*/
    // Konstruktor tanpa parameter
    public Mahasiswa() {
        this.nim = "";
        this.nama = "";
        this.prodi = "";
        this.listMatKul = new ArrayList<>();
    }

    // Konstruktor dengan parameter
    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatKul = new ArrayList<>();
    }
    
    // Selektor NIM
    public String getnim(){
        return nim;
    }

    // Selektor nama
      public String getnama(){
        return nama;
    }

    // Selektor prodi
    public String getprodi(){
        return prodi;
    }

    // Selektor dosenWali
    public Dosen getdosenWali(){
        return dosenWali;
    }

    // Selektor kendaraan
    public Kendaraan getKendaraan(){
        return kendaraan;
    }
    
    // Mutator nim
    public void setnim(String nim){
        this.nim = nim;
    }

    // Mutator nama
    public void setnama(String nama){
        this.nama = nama;
    }
    
    // Mutator prodi
    public void setprodi(String prodi){
        this.prodi = prodi;
    }
    
    // Mutator dosenWali
    public void setdosenwali(Dosen dosenWali){
        this.dosenWali = dosenWali;
    }

    // Mutator kendaraan
    public void setkendaraan(Kendaraan kendaraan){
        this.kendaraan = kendaraan;
    }

    // Method addMatkul
    public void addMatkul(MataKuliah newMatkul){
        listMatKul.add(newMatkul);
    }

    // Method getJumlahSKS
    public int getJumlahSKS(){
        int totalSKS = 0;
        for (MataKuliah matkul : listMatKul) {
            totalSKS += matkul.getSks();
        }
        return totalSKS;
    }

    // Method getMatkul
    public int getjumlahMatkul(){
        return listMatKul.size();
    }

    // Method printMhs
    public void printMhs(){
        System.out.println("Nim     : " + nim);
        System.out.println("Nama    : " + nama);
        System.out.println("Prodi   : " + prodi);
    }

    // Method printDetailMhs
    public void printDetailMhs() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        System.out.println("Mata Kuliah yang Diambil: ");
        for (MataKuliah matkul : listMatKul) {
            System.out.println("  - " + matkul);
        }
        System.out.println(dosenWali);
        System.out.println(kendaraan);
    }
}
    
