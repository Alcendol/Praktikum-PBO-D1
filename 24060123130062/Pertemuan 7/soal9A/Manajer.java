package soal9A;
//NAMA : MUHAMMAD MAHDI BUNTARWATANGAN
//NIM : 24060123130062
public class Manajer extends Pegawai{
    private int tunjangan = 7000000;

    Manajer(String nama){
        super(nama);
    }

    @Override
    public void tampilData(){
        super.tampilData();
        System.out.println("Tunjangan : " + this.tunjangan);
    }
}
