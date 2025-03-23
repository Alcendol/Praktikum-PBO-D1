// Nama : Muhammad Mahdi Buntarwatangan
// NIM  : 24060123130062
// Lab : D1
// Nama File : Mahasiswa.java
package petemuan2.permahasiswaan;

import java.util.ArrayList;

public class Mahasiswa {
    //Atribut
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    //Konstruktor tanpa parameter
    public Mahasiswa(){
        this.nim = "";
        this.nama = "";
        this.prodi = "";
        this.listMatkul = new ArrayList<>();
    }

    //Konstruktor dengan parameter
    public Mahasiswa(String nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatkul = new ArrayList<>();
    }

    //Selektor nim mahasiswa
    public String getNIM(){
        return this.nim;
    }
    //Selektor nama mahasiswa
    public String getNama(){
        return this.nama;
    }
    //Selektor prodi mahasiswa
    public String getProdi(){
        return this.prodi;
    }
    //Selektor dosenWali
    public Dosen getDosenWali(){
        return this.dosenWali;
    }
    //Selektor kendaraan
    public Kendaraan getKendaraan(){
        return this.kendaraan;
    }

    //Mutator nama mahasiswa
    public void setNamaMahasiswa(String nama){
        this.nama = nama;
    }
    //Mutator nim mahasiswa
    public void setNIMMahasiswa(String nim){
        this.nim = nim;
    }
    //mutator prodi mahasiswa
    public void setProdiMahasiswa(String prodi){
        this.prodi = prodi;
    }
    //Mutator dosenWali mahasiswa
    public void setDosenWali(Dosen dosenWali){
        this.dosenWali = dosenWali;
    }
    //Mutator kendaraan mahasiswa
    public void setKendaraan(Kendaraan kendaraan){
        this.kendaraan = kendaraan;
    }

    //Method addMatkul
    public void addMatkul(MataKuliah matkul){
        listMatkul.add(matkul);
    }
    //Method get jumlah SKS yang diambil mahasiswa
    public Integer getJumlahSKSMahasiswa(){
        Integer i, totalSKS = 0;
        for(i = 0; i < listMatkul.size(); i++){
            totalSKS += listMatkul.get(i).getSKSMatkul();
        }
        return totalSKS;
    }
    //Method get jumlah matkul mahasiswa
    public Integer getJumlahMatkul(){
        Integer i, jumlahMatkul = 0;
        for (i = 0; i < listMatkul.size(); i++){
            if(listMatkul.get(i) != null){
                jumlahMatkul += 1;
            }
        }
        return jumlahMatkul;
    }
    //Method print mahasiswa
    public void printMhs(){
        System.out.println("NAMA : " + getNama());
        System.out.println("NIM : " + getNIM());
        System.out.println("Prodi : " + getProdi());
    }
    //Method print detail mahasiswa
    public void printDetailMhs(){
        System.out.println("Mahasiswa : ");
        System.out.println("NAMA : " + getNama());
        System.out.println("NIM : " + getNIM());
        System.out.println("Prodi : " + getProdi());
        System.out.println("---------------------------------");
        System.out.println("Dosen Wali : " );
        System.out.println("Nama : " + getDosenWali().get_nama());
        System.out.println("NIP : " + getDosenWali().get_nip());
        System.out.println("Prodi :" + getDosenWali().get_prodi());
        System.out.println("---------------------------------");
        System.out.println("Daftar mata kuliah : ");
        int i;
        for(i = 0; i < listMatkul.size(); i++){
            System.out.println(listMatkul.get(i).getNamaMatkul() + " " + listMatkul.get(i).getSKSMatkul() + " " + "SKS");
        }
        System.out.println("Total Matkul : " + getJumlahMatkul());
        System.out.println("Total SKS : " + getJumlahSKSMahasiswa());
        System.out.println("---------------------------------");
        System.out.println("Data kendaraan : ");
        System.out.println("Nomor Plat : " + getKendaraan().getNoPlat());
        System.out.println("Jenis : " + getKendaraan().getJenisKendaraan());
    }
}
