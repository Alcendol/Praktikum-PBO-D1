/*
 * Nama File    : Programmer.java
 * Deskripsi    : Subkelas dari Pegawai yang menambahkan atribut bonus dan override method tampilData().
 * Pembuat      : Nayaka Fauzan Prasetyo / 24060123140195
 * Tanggal      : 26 april 2025
 */

 class Programmer extends Pegawai {

    private final int bonus = 450000;


    // Constructor
    public Programmer(String nama) {
        super(nama);
    }


    // Override method tampilData untuk menambahkan informasi bonus
    @Override
    public void tampilData() {
        System.out.println(
            "Nama : " + this.nama +
            ", Gaji pokok : " + this.gajiPokok
        );
        System.out.println(
            "Bonus : " + this.bonus
        );
    }

}
