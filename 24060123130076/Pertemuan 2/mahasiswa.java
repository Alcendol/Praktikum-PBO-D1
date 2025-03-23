/*Nama: Muhammad Helmi Abdulbaqi */
/*NIM: 24060123130076 */

import java.util.ArrayList;

public class mahasiswa {
    //atribut
    private String NIM;
    private String nama;
    private String prodi;
    private ArrayList<MataKuliah> listMatkul;
    private dosen dosenWali;
    private kendaraan kendaraan;


    //konstruktor tanpa parameter
    public mahasiswa(){
        this.NIM = "";
        this.nama = "";
        this.prodi = "";
        this.listMatkul = new ArrayList<>();
        this.dosenWali = null;
        this.kendaraan = null;

    }
     //kosntruktor dengan parameter
     public mahasiswa(String NIM,String nama,String prodi){
        this.NIM = NIM;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatkul = new ArrayList<>();
        this.dosenWali = null;
        this.kendaraan = null;
     }

     //method
     public String getNim(){
        return NIM;
     }

     public void setNim(String NIM){
        this.NIM = NIM;
     }

     public String getNama(){
        return nama;
     }

     public void setNama(String nama){
        this.nama = nama;
     }

     public String prodi(){
        return prodi;
     }

     public void setProdi(String prodi){
        this.prodi = prodi;
     }

     public dosen dosenwali(){
        return dosenWali;
     }

     public void setDosenwali(dosen dosenWali){
        this.dosenWali = dosenWali;
     }

     public kendaraan getKendaraan() {
        return kendaraan;
     }

     public void setKendaraan(kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    public int getJumlahMatkul(){
        return listMatkul.size();
      }


    public void addMatkul(MataKuliah matkul) {
        if (listMatkul.size() < 50) {
            listMatkul.add(matkul);
        } else {
            System.out.println("Mata kuliah tidak dapat ditambahkan. Maksimal 50 mata kuliah.");
        }
    }

    public int getJumlahSKS() {
        int totalSKS = 0;
        for (int i = 0; i < listMatkul.size(); i++) { 
            totalSKS += listMatkul.get(i).getSKS();  
        }
        return totalSKS;
    }

    public void printMhs(){
        System.out.println( "NIM : " + NIM + ", Nama : " + nama + ", prodi : " + prodi);
      }
    
      
    public void printDetailMhs() {
        System.out.println("NIM : " + NIM + ", Nama : " + nama + ", Prodi : " + prodi);
        
        System.out.println("Mata Kuliah Yang Diambil: ");
        for (int i = 0; i < listMatkul.size(); i++) {  // Gunakan listMatkul.size() untuk mendapatkan jumlah mata kuliah
            System.out.println("- " + listMatkul.get(i).getNama() + " (" + listMatkul.get(i).getSKS() + " SKS)");
        }
    
        System.out.println("Dosen Wali: " + (dosenWali != null ? dosenWali.getNama() : "Belum ditentukan"));
        System.out.println("Kendaraan: " + (kendaraan != null ? kendaraan.getJenis() : "Belum ditentukan"));
    }
    


}


