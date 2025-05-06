package latihanMedium;

public class KontrolSenjata {
    
    Senjata senjata;
    
    public KontrolSenjata(Senjata s){
        if (s == null) {
            throw new IllegalArgumentException("Objek Senjata tidak boleh null");
        }
        senjata = s;
    }
    
    public boolean isAdaPeluru(){
        return senjata.getPeluru() > 0;
    }
    
    public void isiPeluru(int jumPeluru){
        if (jumPeluru < 0) {
            System.out.println("Jumlah peluru tidak boleh negatif");
            return;
        }
        senjata.setPeluru(jumPeluru);
    }
    
    public void menembak(int jumlah){
        if (jumlah <= 0) {
            System.out.println("Jumlah tembakan harus lebih dari 0");
            return;
        }
        
        System.out.println("Siap menembak " + jumlah + " kali");
        
        for (int i = 0; i < jumlah; i++) {
            if (isAdaPeluru()) {
                System.out.println(senjata.getBunyi());
                senjata.setPeluru(senjata.getPeluru() - 1);
            } else {
                System.out.println("Gagal tembak, Peluru Habis");
                break;
            }
        }
    }
}
