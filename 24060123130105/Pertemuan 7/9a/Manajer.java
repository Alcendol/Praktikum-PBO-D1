
public class Manajer extends Pegawai{
    
    private int tunjangan = 700000;
    

    public Manajer(String nama) {
        this.nama = nama;
    }

    public void tampilData(){
        super.tampilData();
        System.out.println("Tunjangan : " + tunjangan);
    }

    
}
