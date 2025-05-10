/*
 * Nama File    : Manajer.java
 * Deskripsi    : Subkelas dari Pegawai yang menambahkan atribut tunjangan dan override method tampilData().
 * Pembuat      : Nayaka Fauzan Prasetyo / 24060123140195
 * Tanggal      : 26 april 2025
 */

 class Manajer extends Pegawai {

    private final int tunjangan = 700000;


    // Constructor
    public Manajer(String nama) {
        super(nama);
    }


    // Override method tampilData untuk menambahkan informasi tunjangan
    @Override
    public void tampilData() {
        System.out.println(
            "Nama : " + this.nama +
            ", Gaji pokok : " + this.gajiPokok
        );
        System.out.println(
            "Tunjangan : " + this.tunjangan
        );
    }

}


