/**
 * File         : Pegawai.java
 * Deskripsi    : Superclass untuk Dosen dan Tendik
 * Pembuat      : Muhammad Helmi Abdulbaqi
 * Tanggal      : 18 Maret 2025
 */

 class Pegawai {
    protected String NIP;
    protected String nama;
    protected String tanggalLahir;
    protected String TMT;
    protected double gajiPokok;

    public Pegawai(String NIP,String nama, String tanggalLahir, String TMT, double gajiPokok ){
       this.NIP = NIP;
       this.nama = nama;
       this.tanggalLahir = tanggalLahir;
       this.TMT = TMT;
       this.gajiPokok = gajiPokok;
    }

    //selektor dan mutator 
    public String getNIP(){
        return NIP;
    }
    public void setNIP(String NIP){
        this.NIP = NIP;
    }

    public String getnama(){
        return nama;
    }
    public void setnama(String nama){
        this.nama=nama;
    }

    public String gettanggalLahir(){
        return tanggalLahir;
    }
    public void settanggalLahir(String tanggalLahir){
        this.tanggalLahir = tanggalLahir;
    }

    public String getTMT(){
        return TMT;
    }
    public void setTMT(String TMT){
        this.TMT = TMT;
    }

    public double getgajiPokok(){
        return gajiPokok;
    }
    public void setgajiPokok(double gajiPokok){
        this.gajiPokok = gajiPokok;
    }

    public void printInfo(){
        System.out.println("NIP : " + getNIP());
        System.out.println("nama : " + getnama());
        System.out.println("tanggal lahir : " + gettanggalLahir());
        System.out.println("TMT : " + getTMT());
        System.out.println("gaji pokok Rp : " + getgajiPokok());
    }
}
