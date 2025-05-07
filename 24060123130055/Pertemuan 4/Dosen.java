/* Nama File    : Dosen.java
 * Deskripsi    : berisi class Dosen
 * Pembuat      : Novanza Edgar Wibowo / 24060123130055
 * Tanggal      : 15 Maret 2025
 */

 class Dosen extends Pegawai{
    protected String Fakultas;

    public Dosen(String NIP,String nama,String tglLahir,String TMT,double gajiPokok,String Fakultas){
        super(NIP, nama, tglLahir, TMT, gajiPokok);
        this.Fakultas = Fakultas;
    }

    @Override
    public void printInfo(){}
}
