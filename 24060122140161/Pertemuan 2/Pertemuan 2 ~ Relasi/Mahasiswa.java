public class Mahasiswa {
    private String nama;
    private String nim;
    private String prodi;
    private MataKuliah[] listMatkul; 
    private Dosen dosenWali;
    private Kendaraan kendaraan;
    private int jumlahMatkul; 

    public Mahasiswa() {
        this.nama = "";
        this.nim = "";
        this.prodi = "";
        this.listMatkul = new MataKuliah[50]; 
        this.jumlahMatkul = 0; 
    }

    public Mahasiswa(String nama, String nim, String prodi) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.listMatkul = new MataKuliah[50];
        this.jumlahMatkul = 0;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public void setDosen(Dosen newDosen) {
        this.dosenWali = newDosen;
    }

    public void setKendaraan(Kendaraan newKendaraan) {
        this.kendaraan = newKendaraan;
    }

    public String getNim() {
        return this.nim;
    }

    public String getNama() {
        return this.nama;
    }

    public String getProdi() {
        return this.prodi;
    }

    public Dosen getDosenWali() { 
        return this.dosenWali;
    }

    public Kendaraan getKendaraan() {
        return this.kendaraan;
    }

    public void addMatkul(MataKuliah newMatkul) {
        if (jumlahMatkul < 50) { 
            listMatkul[jumlahMatkul] = newMatkul;
            jumlahMatkul++;
        } else {
            System.out.println("Kapasitas mata kuliah sudah penuh (maks 50)!");
        }
    }

    public void printDetailMhs() {
        System.out.println("Nim: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);

        System.out.println("Daftar Mata Kuliah:");
        for (int i = 0; i < jumlahMatkul; i++) {
            if (listMatkul[i] != null) { 
                System.out.println("Nama Mata Kuliah: " + listMatkul[i].getNama());
                System.out.println("SKS: " + listMatkul[i].getSks());
            }
        }

        if (dosenWali != null) {
            System.out.println("Dosen Wali - NIP: " + dosenWali.getNip());
            System.out.println("Dosen Wali - Nama: " + dosenWali.getNama());
            System.out.println("Dosen Wali - Prodi: " + dosenWali.getProdi());
        }

        if (kendaraan != null) {
            System.out.println("Kendaraan - No. Plat: " + kendaraan.getNoPlat());
            System.out.println("Kendaraan - Jenis: " + kendaraan.getJenis());
        }
    }

    public int getJumlahMatkul() {
        return jumlahMatkul;
    }

    public int getJumlahSks() {
        int totalSks = 0;
        for (int i = 0; i < jumlahMatkul; i++) {
            if (listMatkul[i] != null) {
                totalSks += listMatkul[i].getSks();
            }
        }
        return totalSks;
    }
}