/*  Nama File   : manusia.java
 *  Deskripsi   : Program yang menampilkan kelas Pengusaha dengan atribut dan metode untuk merepresentasikan objek Pengusaha, termasuk ID Usaha, perhitungan pajak, dan masa kerja.
 *  Pembuat     : Naifah Athika Swedy / 24060123140187
 *  Tanggal     : 23 Maret 2025
*/

package pertemuanLima;
import java.time.LocalDate;

public class pengusaha extends manusia implements pajak{
    //ATRIBUT
    private static int counterPengusaha = 0;
    private String idUsaha;

    //KONSTRUKTOR
    public pengusaha(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String idUsaha){
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.idUsaha = idUsaha;
        counterPengusaha++;
    }

    //SELEKTOR (GETTER)
    public static int getCounterPengusaha(){
        return counterPengusaha;
    }

    public String getIdUsaha(){
        return idUsaha;
    }

    //MUTATOR (SETTER)
    public void setIdUsaha(String idUsaha){
        this.idUsaha = idUsaha;
    }

    //METHOD PERHITUNGAN
    @Override
    public double hitungPajak(){
        return 0.15 * pendapatan;
    }

    public int hitungMasaKerja(){
        return LocalDate.now().getYear() - tglMulaiKerja.getYear() + 5; // 5 adalah digit ke-13 NIM
    }

    //METHOD CETAK INFO
    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("ID Usaha            : " + getIdUsaha());
        System.out.println("Pajak               : " + hitungPajak());
        System.out.println("Masa Kerja          : " + hitungMasaKerja() + " tahun");
    }
}