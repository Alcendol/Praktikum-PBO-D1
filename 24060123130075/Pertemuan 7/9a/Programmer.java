public class Programmer extends Pegawai {
    protected int bonus = 450000;

    public Programmer(String nama) {
        super(nama);
    }

    @Override
    public void tampilData() {
        System.out.println("Nama : " + nama + ", Gaji pokok : " + gajiPokok);
        System.out.println("Bonus : " + bonus);
    }
}
