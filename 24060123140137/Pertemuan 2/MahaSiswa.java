// Nama : Noval putra barliyanda
// NIM  : 24060123140137
// Lab : D1
// Nama File : MahaSiswa.java

package pertemuan2;

public class MahaSiswa {
    private String nim;
    private String nama;
    private String prodi;
    private MataKuliah[] listMatKul;
    private int jumlahMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    // Konstruktor tanpa parameter
    public MahaSiswa() {
        this.listMatKul = new MataKuliah[50];
        this.jumlahMatkul = 0;
    }

    // Konstruktor dengan parameter
    public MahaSiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatKul = new MataKuliah[50];
        this.jumlahMatkul = 0;
    }

    // Getter
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

    // Setter
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
    public void addMatKul(MataKuliah matkul) {
        if (jumlahMatkul < 50) {
            this.listMatKul[jumlahMatkul] = matkul;
            jumlahMatkul++;
        } else {
            System.out.println("MahaSiswa tidak dapat mengambil lebih dari 50 mata kuliah.");
        }
    }

    // Method untuk menghitung jumlah SKS yang diambil
    public int getJumlahSKS() {
        int totalSks = 0;
        for (int i = 0; i < jumlahMatkul; i++) {
            totalSks += listMatKul[i].getSks();
        }
        return totalSks;
    }

    // Method untuk menghitung jumlah mata kuliah yang diambil
    public int getJumlahMatKul() {
        return jumlahMatkul;
    }

    // Method untuk menampilkan informasi dasar mahasiswa
    public void printMhs() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }

    // Method untuk menampilkan informasi lengkap mahasiswa
    public void printDetailMhs() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        System.out.println("Dosen Wali: " + (dosenWali != null ? dosenWali.getNama() : "Belum ada"));

        System.out.println("Mata Kuliah yang diambil:");
        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println("- " + listMatKul[i].getNama() + " (" + listMatKul[i].getSks() + " SKS)");
        }

        System.out.println("Total SKS: " + getJumlahSKS());

        if (kendaraan != null) {
            System.out.println("Kendaraan: " + kendaraan.getJenis() + " dengan nomor plat " + kendaraan.getNoPlat());
        } else {
            System.out.println("Tidak memiliki kendaraan.");
        }
    }
}
