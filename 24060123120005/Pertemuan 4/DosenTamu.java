/*
    Nama File : DosenTamu.java
    Deskripsi : Kelas yang merepresentasikan dosen tamu dengan NIDK dan masa kontrak berakhir
    Pembuat   : Patricia Gabrielle Yudianto
    NIM       : 24060123120005
    Tanggal   : 17 Maret 2025
*/


import java.time.LocalDate;

public class DosenTamu extends Pegawai {
    private String nidk;
    private String fakultas;
    private LocalDate kontrakBerakhir;

    public DosenTamu(String nip, String nama, LocalDate tglLahir, LocalDate tmt, double gajiPokok, String nidk,
            String fakultas, LocalDate kontrakBerakhir) {
        super(nip, nama, tglLahir, tmt, gajiPokok);
        this.nidk = nidk;
        this.fakultas = fakultas;
        this.kontrakBerakhir = kontrakBerakhir;
    }

    public double hitungTunjangan() {
        return 0.025 * gajiPokok;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIDK: " + nidk);
        System.out.println("Jabatan: Dosen Tamu");
        System.out.println("Fakultas: " + fakultas);
        System.out.println("Kontrak Berakhir: " + kontrakBerakhir.format(formatter));
        System.out.println();
    }
}
