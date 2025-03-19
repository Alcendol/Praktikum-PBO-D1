/* Nama File : Pengusaha.java
*  Deskripsi : Atribut dan Method class Pengusaha
*  Pembuat : Muhammad Shafwan Raihan S_24060123140120
*  Tanggal : 20 / 03 / 2025
*/

package pertemuan5;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pengusaha extends Manusia implements Pajak {

    /*--------ATRIBUT--------*/
    private String npwp;
    private static int counterPengusaha; // Menghitung jumlah instansiasi objek Pengusaha
    
    /*--------METHOD--------*/
    // Konstruktor tanpa parameter
    public Pengusaha() {
        this.npwp = "";
    }

    // Konstruktor dengan parameter
    public Pengusaha(String nama, LocalDate tgl_mulai_kerja, String alamat, double pendapatan, String npwp) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }
    
    // Selektor npwp
    public String getNpwp() {
        return npwp;
    }

    // Selektor counterPengusaha
    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    // Mutator npwp
    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }

    // Implementasi Abstract Method hitungMasaKerja() yang mengembalikan hasil perhitungan masa kerja Pengusaha
    @Override
    public int hitungMasaKerja() {
        return (int) ChronoUnit.YEARS.between(getTgl_mulai_kerja(), LocalDate.now()) + 2;
    }
    
    // Implementasi Interface Method hitungPajak() yang mengembalikan hasil perhitungan pajak Pengusaha
    @Override
    public double hitungPajak() {
        return 0.15 * getPendapatan();
    }
    
    // Method cetakInfo() yang menampilkan seluruh informasi atribut dari class Pengusaha
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NPWP: " + getNpwp());
        System.out.println("Masa Kerja: " + hitungMasaKerja());
        System.out.println("Pajak: " + hitungPajak());
    }
}