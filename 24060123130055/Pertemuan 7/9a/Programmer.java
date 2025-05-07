/*
 File         : Programmer.java
 Deskripsi    : Subclass Pegawai yang merepresentasikan programmer, menambahkan atribut bonus.
 Pembuat      : Novanza Edgar Wibowo / 24060123130055
 Tanggal      : 27 April 2025
*/

// Subclass Programmer
public class Programmer extends Pegawai {
    private int bonus = 450_000;

    public Programmer(String nama) {
        super(nama);
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus    : " + bonus);
    }
}

