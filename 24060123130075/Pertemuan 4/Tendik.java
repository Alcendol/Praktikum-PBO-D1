/* Nama File    : Tendik.java
 * Deskripsi    : 
 * Pembuat      : Muhammad Irsyad Rabbani 24060123130075
 * Tanggal      : 12/3/2025
 */ 

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Tendik extends Pegawai {
    private String bidang;
    private static final int BUP = 55;

    public Tendik(String NIP,String nama,String tglLahir,String TMT,double gajiPokok,String bidang){
        super(NIP, nama, tglLahir, TMT, gajiPokok);
        this.bidang = bidang;
    }

    public double getTunjangan(){
        return 0.01 * getMasaKerja() * gajiPokok;
    }

    public LocalDate getBUP() {
        return tglLahir.plusYears(BUP).withDayOfMonth(1).plusMonths(1);
    }
    
    @Override
    public void printInfo() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("d MMMM yyyy");
        System.out.println("NIP : " + NIP);
        System.out.println("Nama : " + nama);
        System.out.println("Tanggal Lahir : " + tglLahir.format(fmt));
        System.out.println("TMT : " + TMT.format(fmt));
        System.out.println("Jabatan : Tendik");
        System.out.println("Bidang : " + bidang);
        System.out.println("Masa Kerja : " + getMasaKerja() + " tahun");
        System.out.println("BUP : " + getBUP().format(fmt));
        System.out.println("Gaji Pokok : Rp " + gajiPokok);
        System.out.println("Tunjangan : Rp " + getTunjangan());
    }
}