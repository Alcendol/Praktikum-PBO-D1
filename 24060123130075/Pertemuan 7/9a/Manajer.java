public class Manajer extends Pegawai {
    protected int tunjangan = 700000;

    public Manajer(String nama) {
        super(nama);
    }

    @Override
    public void tampilData() {
        System.out.println("Nama : " + nama + ", Gaji pokok : " + gajiPokok);
        System.out.println("Tunjangan : " + tunjangan);
    }
}