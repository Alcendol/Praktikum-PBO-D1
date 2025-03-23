package pertemuanlima;
/*  Nama File   : PNS.java
 *  Deskripsi   : Program untuk menunjukkan kelas PNS yang memuat atribut dan method untuk merepresentasikan objek PNS, 
 *                termasuk informasi NIP, perhitungan pajak, dan masa kerja.
 *  Pembuat     : Nazla Azzahra Hermana / 24060123120038
 *  Tanggal     : 23 Maret 2025
*/
import java.time.LocalDate;

public class PNS extends manusia implements pajak{
    //ATRIBUT
    private static int counterPNS = 0;
    private String nip;

    //KONSTRUKTOR
    public PNS(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String nip) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    //SELEKTOR (GETTER)
    public static int getCounterPNS(){
        return counterPNS;
    }

    public String getNIP(){
        return nip;
    }

    //MUTATOR (SETTER)
    public void setNIP(String nip){
        this.nip = nip;
    }

    //METHOD PERHITUNGAN
    @Override
    public double hitungPajak(){
        return 0.10 * pendapatan;
    }

    public int hitungMasaKerja(){
        return LocalDate.now().getYear() - tglMulaiKerja.getYear() + 6; // 6 adalah digit ke-14 NIM
    }

    //METHOD CETAK INFO
    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("NIP                 : " + getNIP());
        System.out.println("Pajak               : " + hitungPajak());
        System.out.println("Masa Kerja          : " + hitungMasaKerja() + " tahun");
    }
}
