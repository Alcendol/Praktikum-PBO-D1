/* Nama File : Mahasiswa.java
 * Deskripsi : Berisi atribut,method,selektor dan mutator
 * Pembuat   : Nayaka Fauzan Prasetyo/24060123140195
 * Tanggal   : Rabu, 26 Februari 2025
 */
package pertemuan2;

import java.util.ArrayList;
public class Mahasiswa {
    //atribut
    private String nim;
    private String nama;
    private String prodi;
    private int jumlMatkul;
    ArrayList<MataKuliah> listMatKul;
    private Dosen dosenwali;
    private Kendaraan kendaraan;

    //method
    public Mahasiswa () {
        this.listMatKul = new ArrayList<>();
        this.jumlMatkul = 0;
    }
    public Mahasiswa(String nim,String nama,String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatKul = new ArrayList<>();
        this.jumlMatkul = 0;
    }

    public String getNim () {
        return this.nim;
    }
    public String getNama () {
        return this.nama;
    }
    public String getProdi () {
        return this.prodi;
    }

    public Dosen getDosenWali () {
        return this.dosenwali;
    }

    public Kendaraan getKendaraan () {
        return this.kendaraan;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public void setDosenWali (Dosen dosenwali) {
        this.dosenwali = dosenwali;
    }
    public void setKendaraan (Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }
    public void addMatkul(MataKuliah newMatKul) {
        listMatKul.add(newMatKul);
        jumlMatkul++;
    }
    public int getJumlSKS () {
        int totalSKS = 0;
        for (MataKuliah matkul : listMatKul) {
            totalSKS += matkul.getSks();
        }
        return totalSKS;
    }
    public int getJumlMatkul () {
        return jumlMatkul;
    }
    public void printMhs() {
        System.out.println("Nim: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }
    public void printDetailMhs() {
        System.out.println("Nim: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        int i;
        for (i = 0; i < listMatKul.size(); i++) {
            System.out.println(listMatKul.get(i).getNama());
        }
        System.out.println("Dosen Wali : " + dosenwali.getNama());
        System.out.println("Kendaraan : " + kendaraan.getnoplat());
    }
}
