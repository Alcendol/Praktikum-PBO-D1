/* Nama File : Mahasiswa.java
 * Deskripsi : Berisi atribut dan method dalam class Mahasiswa
 * Pembuat   : Naifah Athika Swedy / 24060123140142
 * Tanggal   : Rabu, 26 Februari 2025
 * */

package pertemuanDua;

public class Mahasiswa {
    //atribut 
    private String nim;
    private String nama;
    private String prodi;
    private MataKuliah[] listMatkul;
    private int jumlahMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    //konstruktor tanpa parameter
    public Mahasiswa(){
        this.nim = "";
        this.nama = "";
        this.prodi = "";
        this.listMatkul = new MataKuliah[50];
        this.jumlahMatkul = 0;
        this.dosenWali = null;
        this.kendaraan = null;

    }
     //kosntruktor dengan parameter
     public Mahasiswa(String nim,String nama,String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatkul = new MataKuliah[50];
        this.jumlahMatkul = 0;
        this.dosenWali = null;
        this.kendaraan = null;
     }

     //selektor dan mutator 
     public String getnim(){
        return nim;
     }

     public void setnim(String nim){
        this.nim = nim;
     }

     public String getnama(){
        return nama;
     }

     public void setnama(String nama){
        this.nama = nama;
     }

     public String prodi(){
        return prodi;
     }

     public void setprodi(String prodi){
        this.prodi = prodi;
     }

     public Dosen dosenwali(){
        return dosenWali;
     }

     public void setdosenwali(Dosen dosenWali){
        this.dosenWali = dosenWali;
     }

     public Kendaraan getKendaraan() {
        return kendaraan;
     }

     public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    //method unutk menambhakan mata kuliah ke dalam array 
    public void addmatkul(MataKuliah mataKuliah){
        if (jumlahMatkul < 50){
            listMatkul [jumlahMatkul] = mataKuliah;
            jumlahMatkul++;
        }else{
            System.out.println("mata kuliah sudah penuh");
        }
    }

    //method unutk mendapatkan jumlah totoal sks
    public int getjumlahsks(){
        int totalsks = 0;
        for (int i = 0; i < jumlahMatkul; i++){
            totalsks += listMatkul[i].getsks();
        }
        return totalsks;
    }

    //method unutk menssapkan jumlah mata kuliah yang di ambil 
   public int getjumlahmatkul(){
     return jumlahMatkul;
   }

   //menampilkan detail mahasiswa 
   public void printMhs(){
     System.out.println( "NIM : " + nim + ", Nama : " + nama + ", prodi : " + prodi);
   }

   //menampilkan detail mahasiswa 
   public void printDetailMhs(){
      System.out.println( "NIM : " + nim + ", Nama : " + nama + ", prodi : " + prodi);
      System.out.println("Mata Kuliah Yang Diambil : ");
      for (int i = 0; i < jumlahMatkul;i++){
         System.out.println("- " + listMatkul[i].getnama() + " (" + listMatkul[i].getsks() + " SKS)");
      }
      System.out.println("Dosen Wali: " + (dosenWali != null ? dosenWali.getNama() : "Belum ditentukan"));
      System.out.println("Kendaraan: " + (kendaraan != null ? kendaraan.getjenis() : "Belum ditentukan"));
   }   
}
