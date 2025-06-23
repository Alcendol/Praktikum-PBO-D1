/* Nama File    : DosenTamu.java
 * Deskripsi    : berisi class Dosen Tamu
 * Pembuat      : Novanza Edgar Wibowo / 24060123130055
 * Tanggal      : 15 Maret 2025
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

 public class DosenTamu extends Dosen {
    private final String NIDK;
    private final LocalDate kontrakBerakhir;

    public DosenTamu(String NIP,String NIDK,String nama,String tglLahir,String TMT,double gajiPokok,String Fakultas,String kontrakBerakhir){
        super(NIP, nama, tglLahir, TMT, gajiPokok, Fakultas);
        this.NIDK = NIDK;
        this.kontrakBerakhir = LocalDate.parse(kontrakBerakhir, DateTimeFormatter.ofPattern("d-M-yyyy"));
    }
    public double getTunjangan() {
        return 0.025 * gajiPokok;
    }
    @Override
    public void printInfo() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("d MMMM yyyy");
        System.out.println("NIP : " + NIP);
        System.out.println("NIDK : " + NIDK);
        System.out.println("Nama : " + nama);
        System.out.println("Tanggal Lahir : " + tglLahir.format(fmt));
        System.out.println("TMT : " + TMT.format(fmt));
        System.out.println("Jabatan : Dosen Tamu");
        System.out.println("Fakultas : " + Fakultas);
        System.out.println("Kontrak Berakhir : " + kontrakBerakhir.format(fmt));
        System.out.println("Gaji Pokok : Rp " + gajiPokok);
        System.out.println("Tunjangan : Rp " + getTunjangan());
    }}