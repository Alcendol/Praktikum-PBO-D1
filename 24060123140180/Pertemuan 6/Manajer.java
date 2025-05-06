package Pertemuan6;


public class Manajer extends Pegawai {
    /*=============== Atribut ===============*/
    private int tunjangan = 700000;
    
    /*=============== Method ===============*/
    public Manajer() {
        super();
    }
    public Manajer(String nama) {
        super(nama);
    }
    public int getTunjangan() {
        return tunjangan;
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan       : " + getTunjangan());
        System.out.println("Gaji Total      : " + (getGajiPokok() + getTunjangan()));
    }

}
