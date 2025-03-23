/* Nama File    : Mahasiswa.java
 * Deskripsi    : berisi atribut dan method dalam class mahasiswa
 * Pembuat      : Novanza Edgar Wibowo / 24060123130055
 * Tanggal      : 4 Maret 2025
 */

public class Mahasiswa {
    private String nim;
    private String nama;
    private String prodi;
    private final MataKuliah[] listMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;
    private int jumlahMatKul;

    // Konstruktor tanpa parameter
    public Mahasiswa() {
        this.nim = "";
        this.nama = "";
        this.prodi = "";
        this.listMatKul = new MataKuliah[50];
        this.jumlahMatKul = 0;
        this.dosenWali = null;
        this.kendaraan = null;
    }

    // Konstruktor dengan parameter
    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatKul = new MataKuliah[50];
        this.jumlahMatKul = 0;
        this.dosenWali = null;
        this.kendaraan = null;
    }

    // Selektor dan Mutator
    public String getNim() { 
        return nim; 
    }

    public void setNim(String nim) { 
        this.nim = nim; 
    }

    public String getNama() { 
        return nama; 
    }

    public void setNama(String nama) { 
        this.nama = nama; 
    }

    public String getProdi() { 
        return prodi; 
    }

    public void setProdi(String prodi) { 
        this.prodi = prodi; 
    }

    public Dosen getDosenWali() { 
        return dosenWali; 
    }

    public void setDosenWali(Dosen dosenWali) { 
        this.dosenWali = dosenWali; 
    }

    public Kendaraan getKendaraan() { 
        return kendaraan; 
    }

    public void setKendaraan(Kendaraan kendaraan) { 
        this.kendaraan = kendaraan; 
    }
    
    // Method untuk menambahkan mata kuliah
    public void addMatKul(MataKuliah matkul) {
        if (jumlahMatKul < 50) {
            listMatKul[jumlahMatKul] = matkul;
            jumlahMatKul++;
        } else {
            System.out.println("Mata kuliah penuh");
        }
    }


    // Method untuk mendapatkan total SKS
    public int getJumlahSKS() {
        int totalSks = 0;
        for (int i = 0; i < jumlahMatKul; i++) { // Iterate only up to jumlahMatKul
            totalSks += listMatKul[i].getSks();
        }
        return totalSks;
    }    

    // Method untuk mendapatkan jumlah mata kuliah
    public int getJumlahMatKul() {
        return jumlahMatKul;
    }


    // Method untuk mencetak data dasar mahasiswa
    public void printMhs() {
        System.out.println("Nim: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }

    // Method untuk mencetak detail mahasiswa
    public void printDetailMhs() {
        printMhs();
        System.out.println("Daftar Mata Kuliah:");
        for (int i = 0; i < jumlahMatKul; i++) {
            System.out.println("- " + listMatKul[i].getNama());
        }
        if (dosenWali != null) {
            System.out.println("Dosen Wali: " + dosenWali.getNama());
        }
        if (kendaraan != null) {
            System.out.println("Kendaraan: " + kendaraan.getNoPlat() + " (" + kendaraan.getJenis() + ")");
        }
    }
}