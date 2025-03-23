// Nama File : Mahasiswa.java
// Nama : Rafi Deandra
// NIM : 240122140122

public class Mahasiswa {
    private String nim;
    private String nama;
    private String prodi;
    private Matakuliah[] listMatKul; 
    private int jumlahMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;
    
    //Method
    public Mahasiswa() {
        this.nim = "";
        this.nama = "";
        this.prodi = "";
        this.listMatKul = new Matakuliah[50];
        this.jumlahMatKul = 0;
        this.dosenWali = null;
        this.kendaraan = null;
    }

    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatKul = new Matakuliah[50];
        this.jumlahMatKul = 0;
        this.dosenWali = null;
        this.kendaraan = null;
    }
    
    //Selektor
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

    //Mutator
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
    
    public void addMatKul(Matakuliah matkul) {
        if (jumlahMatKul < 50) {
            listMatKul[jumlahMatKul] = matkul;
            jumlahMatKul++;
        } else {
            System.out.println("Mata kuliah sudah penuh!");
        }
    }
    
    public int getJumlahSKS() {
        int totalSKS = 0;
        for (int i = 0; i < jumlahMatKul; i++) {
            totalSKS += listMatKul[i].getSks();
        }
        return totalSKS;
    }
    
    public int getJumlahMatKul() {
        return jumlahMatKul;
    }

    public void printMhs() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }
    
    public void printDetailMhs() {
        printMhs();
        System.out.println("Mata Kuliah yang Diambil:");
        for (int i = 0; i < jumlahMatKul; i++) {
            System.out.println("- " + listMatKul[i].getNama());
        }
    
        if (dosenWali != null) {
            System.out.println("Dosen Wali: " + dosenWali.getnama());
        } else {
            System.out.println("Dosen Wali: Tidak ada");
        }
    
        if (kendaraan != null) {
            System.out.println("Kendaraan: " + kendaraan.getnoPlat() + " - " + kendaraan.getjenis());
        } else {
            System.out.println("Kendaraan: Tidak ada");
        }
    }
}