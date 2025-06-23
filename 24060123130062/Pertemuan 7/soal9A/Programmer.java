package soal9A;
//NAMA : MUHAMMAD MAHDI BUNTARWATANGAN
//NIM : 24060123130062
public class Programmer extends Pegawai {
    private int bonus = 4500000;

    Programmer(String nama){
        super(nama);
    }

    public void tampilData(){
        super.tampilData();
        System.out.println("Bonus : " + this.bonus);
    }
}
