// Nama File : Mahasiswa.java
// Deskripsi : berisis atribut dan method dalam class Mahasiswa
// Pembuat   : Nasywa Alya Kamila
// Tanggal   : 4 Maret 2025


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Mahasiswa {
    /*************** Atribut *****************/
    private String nim;
    private String namaMhs;
    private String prodiMhs;
    ArrayList<Matkul> listMatkul = new ArrayList<Matkul>();
    private Dosen dosenWali;
    private Kendaraan kendaraan;
    private static Set<Kendaraan> assignedKendaraan = new HashSet<>();
    /*************** Method *****************/
    // Constructor
    public Mahasiswa(){
        this.nim = "00000";
        this.namaMhs = "Nama Mahasiswa";
        this.prodiMhs = "Prodi Mahasiswa";
    }

    public Mahasiswa(String nim, String namaMhs, String prodiMhs, Dosen dosenWali, Kendaraan kendaraan){
        this.nim = nim;
        this.namaMhs = namaMhs;
        this.prodiMhs = prodiMhs;
    }

    // Selector / getter
    public String getNim(){
        return nim;
    }
    public String getNamaMhs(){
        return namaMhs;
    }
    public String getProdiMhs(){
        return prodiMhs;
    }
    public Dosen getDosenWali(){
        return dosenWali;
    }
    public Kendaraan getKendaraan(){
        return kendaraan;
    }
    public ArrayList<Matkul> getListMatkul(){
        return listMatkul;
    }

    // Mutator / Setter
    public void setNim(String nim){
        this.nim = nim;
    }
    public void setNamaMhs(String namaMhs){
        this.namaMhs = namaMhs;
    }
    public void setProdiMhs(String prodiMhs){
        this.prodiMhs = prodiMhs;
    }
    public void setDosenWali(Dosen dosenWali){
        this.dosenWali = dosenWali;
    }
    public void setKendaraan(Kendaraan kendaraan){
        if (this.kendaraan != null) {
            assignedKendaraan.remove(this.kendaraan);
        }
        if (kendaraan == null || !assignedKendaraan.contains(kendaraan)) {
            this.kendaraan = kendaraan;
            if (kendaraan != null) {
                assignedKendaraan.add(kendaraan);
            }
        } else {
            System.out.println("Kendaraan sudah dimiliki oleh mahasiswa lain.");
        }
    }

    // Menambahkan matakuliah kedalam list mata kuliah
    public void addmatkul(Matkul newMatkul){
        boolean exists = false;
        for (Matkul matkul : listMatkul) {
            if (matkul.getIdMatkul().equals(newMatkul.getIdMatkul())) {
                exists = true;
                break;
            }
        }
        if (!exists) {
            listMatkul.add(newMatkul);
        }
    }

    // Jumlah sks mata kuliah yang diambil mahasiswa
    public int getJumlahSks() {
        int totalSks = 0;
        for (Matkul matkul : listMatkul) {
            totalSks += matkul.getSks();
        }
        return totalSks;
    }

    // Mendapatkan jumlah mata kuliah yang diambil mahasiswa
    public int getJumlahMatkul(){
        return listMatkul.size();
    }

    // Menampilkan data mahasiswa
    public void printMhs(){
        System.out.println("NIM: " + nim);
        System.out.println("Nama Mahasiswa: " + namaMhs);
        System.out.println("Prodi Mahasiswa: " + prodiMhs);
    }

    public void printDetailMhs(){
        System.out.println("NIM: " + nim);
        System.out.println("Nama Mahasiswa: " + namaMhs);
        System.out.println("Prodi Mahasiswa: " + prodiMhs);
        System.out.println("\nDosen Wali: ");
        System.out.println("NIP: " + dosenWali.getNip());
        System.out.println("Nama Dosen: " + dosenWali.getNama());
        System.out.println("Prodi Dosen: " + dosenWali.getProdi());
        System.out.println("\nKendaraan: ");
        if (kendaraan != null) {
            System.out.println("No Plat: " + kendaraan.getNoPlat());
            System.out.println("Jenis Kendaraan: " + kendaraan.getJenis());
        } else {
            System.out.println("Tidak memiliki kendaraan.");
        }
        System.out.println("\nMata Kuliah yang diambil: ");
        int i;
        for (i = 0; i < listMatkul.size(); i++){
            System.out.println(listMatkul.get(i).getNamaMatkul());
        }  
    }
}