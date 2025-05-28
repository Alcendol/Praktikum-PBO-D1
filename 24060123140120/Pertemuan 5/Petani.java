/* Nama File : Petani.java
*  Deskripsi : Atribut dan Method class Petani
*  Pembuat : Muhammad Shafwan Raihan S_24060123140120
*  Tanggal : 20 / 03 / 2025
*/

package pertemuan5;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Petani extends Manusia implements Pajak {

    /*--------ATRIBUT--------*/
    private String asal_kota;
    private static int counterPetani; // Menghitung jumlah instansiasi objek Petani
    
    /*--------METHOD--------*/
    // Konstruktor tanpa parameter
    public Petani() {
        this.asal_kota = "";
    }

    // Konstruktor dengan parameter
    public Petani(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    // Selektor asal_kota
    public String getAsal_kota() {
        return asal_kota;
    }

    // selektor counterPetani
    public static int getCounterPetani() {
        return counterPetani;
    }

    // Mutator asal_kota
    public void setAsal_kota(String asal_kota) {
        this.asal_kota = asal_kota;
    }
    
    // Implementasi Abstract Method hitungMasaKerja() yang mengembalikan hasil perhitungan masa kerja Petani
    @Override
    public int hitungMasaKerja() {
        return (int) ChronoUnit.YEARS.between(getTgl_mulai_kerja(), LocalDate.now()) + 1;
    }
    
    // Implementasi Interface Method hitungPajak() yang mengembalikan hasil perhitungan pajak Petani
    @Override
    public double hitungPajak() {
        return 0; 
    }
    
    // Method cetakInfo() yang menampilkan seluruh informasi atribut dari class Petani
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Asal Kota: " + getAsal_kota());
        System.out.println("Masa Kerja: " + hitungMasaKerja());
        System.out.println("Pajak: " + hitungPajak());
    }
}