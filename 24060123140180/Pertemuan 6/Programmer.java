package Pertemuan6;



public class Programmer extends Pegawai {
    /*=============== Atribut ===============*/
    private int bonus = 450000;

    /*=============== Method ===============*/
    public Programmer() {
        super();
    }
    public Programmer(String nama) {
        super(nama);
    }
    public int getBonus() {
        return bonus;
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus           : " + getBonus());
        System.out.println("Gaji Total      : " + (getGajiPokok() + getBonus()));
    }
    
}
