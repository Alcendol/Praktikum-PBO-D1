package pertemuanlima;
/*  Nama File   : petani.java
 *  Deskripsi   : Program untuk menunjukkan kelas petani yang memuat atribut dan method untuk merepresentasikan objek pengusaha, 
 *                termasuk informasi identitas usaha, perhitungan pajak, dan masa kerja.
 *  Pembuat     : Nazla Azzahra Hermana / 24060123120038
 *  Tanggal     : 23 Maret 2025
*/
import java.time.LocalDate;

public class petani extends manusia implements pajak{
    //ATRIBUT
    private static int counterPetani = 0;
    private String daerahTani;

    //KONSTRUKTOR 
    public petani(String nama, LocalDate tglMulaiKerja, String alamat, double pendapatan, String daerahTani) {
        super(nama, tglMulaiKerja, alamat, pendapatan);
        this.daerahTani = daerahTani;
        counterPetani++;
    }

    //SELEKTOR (GETTER)
    public static int getCounterPetani(){
        return counterPetani;
    }

    public String getDaerahTani(){
        return daerahTani;
    }

    //MUTATOR (SETTER) 
    public void setDaerahTani(String daerahTani){
        this.daerahTani = daerahTani;
    }

    //METHOD PERHITUNGAN
    @Override
    public double hitungPajak(){
        return 0; //Petani tidak dikenakan pajak
    }

    public int hitungMasaKerja(){
        return LocalDate.now().getYear() - tglMulaiKerja.getYear();
    }

    //METHOD CETAK INFO
    @Override
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println("Daerah Tani         : " + getDaerahTani());
        System.out.println("Pajak               : " + hitungPajak());
        System.out.println("Masa Kerja          : " + hitungMasaKerja() + " tahun");
    }
}
