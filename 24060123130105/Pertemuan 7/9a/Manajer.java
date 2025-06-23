/*
 * Nama : Nadzif Silakhudin
 * NIM : 24060123130105
 * Nama File : Manajer.java
 * Tanggal : 27 April 2025
 */
public class Manajer extends Pegawai{
    
    private int tunjangan = 700000;
    

    public Manajer(String nama) {
        this.nama = nama;
    }

    public void tampilData(){
        super.tampilData();
        System.out.println("Tunjangan : " + tunjangan);
    }

    
}
