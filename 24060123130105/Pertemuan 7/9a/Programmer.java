/*
 * Nama : Nadzif Silakhudin
 * NIM : 24060123130105
 * Nama File : Progammer.java
 * Tanggal : 27 April 2025
 */
public class Programmer extends Pegawai {
    private int bonus = 450000;

    public Programmer(String nama) {
        this.nama = nama;
    }

    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus : " + bonus);
    }
}
