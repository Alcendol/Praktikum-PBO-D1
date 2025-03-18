/*
    Nama File : Dosen.java
    Deskripsi : Kelas Dosen
    Pembuat   : Muhammad Paruda Pradayan
    NIM       : 24060123140124
    Tanggal   : 17 Maret 2025
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