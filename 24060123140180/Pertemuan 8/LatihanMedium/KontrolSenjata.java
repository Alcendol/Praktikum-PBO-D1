package LatihanMedium;

public class KontrolSenjata {
    Senjata senjata;

    public KontrolSenjata(Senjata s) {
        senjata = s;
    }

    public boolean isAdaPeluru(){
        return senjata.getPeluru() > 0;
    }

    public void isiPeluru(int jumPelor){
        senjata.setPeluru(jumPelor);
    }

    public void menembak(int jumlah){
        System.out.println("Siap Tembak "+ jumlah + " kali");

        for (int i = 0; i < jumlah; i++){
            if (isAdaPeluru()){
                System.out.println(senjata.getBunyi());
                senjata.setPeluru(senjata.getPeluru()-1);
            } else{
                System.out.println("Gagal tembak, Peluru habis!");
                break;
            }
        }

    }
    
}
