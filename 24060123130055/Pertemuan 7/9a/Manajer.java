/*
 File         : Manajer.java
 Deskripsi    : Subclass Pegawai yang merepresentasikan manajer, menambahkan atribut tunjangan.
 Pembuat      : Novanza Edgar Wibowo / 24060123130055
 Tanggal      : 27 April 2025
*/

public class Manajer extends Pegawai {
    private int tunjangan = 700_000;

    public Manajer(String nama) {
        super(nama);
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan: " + tunjangan);
    }
}

