import java.util.ArrayList;
/* Nama File    : Mahasiswa.java
 * Deskripsi    : Berisi atribut dan method dari class Mahasiswa
 * Pembuat      : Muhammad Irsyad Rabbani 24060123130075
 * Tanggal      : 26/2/2025
 */ 

public class Mahasiswa {
    /* ATRIBUR */
    private String nim;
    private String nama;
    private String prodi;
    private ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    /* METHOD */
    //konstruktor
    public Mahasiswa () {
        this.nim = "";
        this.nama = "";
        this.prodi = "";
        this.listMatkul = new ArrayList<>(50);
        this.dosenWali = new Dosen();
        this.kendaraan = new Kendaraan();
    }

    public Mahasiswa (String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatkul = new ArrayList<>(50);
        this.dosenWali = new Dosen();
        this.kendaraan = new Kendaraan();
    }

    //selektor
    public String getNim () {
        return this.nim;
    }

    public String getNama () {
        return this.nama;
    }

    public String getProdi () {
        return this.prodi;
    }

    public ArrayList<MataKuliah> getListMatkul () {
        return this.listMatkul;
    }

    public Dosen getDosen () {
        return this.dosenWali;
    }

    public Kendaraan getKendaraan () {
        return this.kendaraan;
    }

    //mutator
    public void setNim (String nim) {
        this.nim = nim;
    }

    public void setNama (String nama) {
        this.nama = nama;
    }

    public void setProdi (String prodi) {
        this.prodi = prodi;
    }

    public void setListMatkul (ArrayList<MataKuliah> listMatkul) {
        this.listMatkul = listMatkul;
    }

    public void setDosen (Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    public void setKendaraan (Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    //method lain
    public void addMatkul (MataKuliah mataKuliah) {
        if (getListMatkul().contains(mataKuliah)) {
            System.out.println("Mata kuliah sudah diambil");
        }
        else if (getListMatkul().size() >= 50) {
            System.out.println("Mata Kuliah sudah penuh");
        }
        else {
            getListMatkul().add(mataKuliah);
        }
    }

    public int getJumlahSKS () {
        int count = 0;
        for (int i = 0; i < getListMatkul().size(); i++) {
            count += getListMatkul().get(i).getSks();
        }
        return count;
    }

    public int getJumlahMatkul () {
        return getListMatkul().size();
    }

    public void printMhs () {
        System.out.println("Nama :  " + getNama());
        System.out.println("NIM :   " + getNim());
        System.out.println("Prodi : " + getProdi());
    }

    public void printDetailMhs () {
        System.out.println("Nama :  " + getNama());
        System.out.println("NIM :   " + getNim());
        System.out.println("Prodi : " + getProdi());
        System.out.println("Matkul :    ");
        
        for (int i = 0; i < getListMatkul().size(); i++) {
            System.out.println(getListMatkul().get(i).getNama());
        }

        System.out.println("Dosen Wali :    ");
        System.out.println("Nama :  " + getDosen().getNama());
        System.out.println("NIP :   " + getDosen().getNip());
        System.out.println("Prodi : " + getDosen().getProdi());
    }
    
}
