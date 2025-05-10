/*
 * Nama File    : KontrolSenjata.java
 * Deskripsi    : Kelas untuk mengontrol senjata, mengecek jumlah peluru, dan menembak dengan senjata.
 * Pembuat      : Nayaka Fauzan Prasetyo / 24060123140195
 * Tanggal      : 5 Mei 2025
 */
package latihanMedium;

public class KontrolSenjata {

    Senjata senjata;

    public KontrolSenjata(Senjata s){
        senjata = s;
    }

    public boolean isAdaPeluru(){
        return senjata.getPeluru() > 0;
    }

    public void isiPeluru(int jumPeluru){
        senjata.setPeluru(jumPeluru);
    }

    public void menembak(int jumlah){
        System.out.println("Siap menembak " + jumlah + " kali" );

        for(int i = 0 ; i < jumlah; i++ ){
            if (isAdaPeluru()){
                System.out.println(senjata.getBunyi());
                senjata.setPeluru(senjata.getPeluru()-1);
            }
            else{
                System.out.println("Gagal tembak, Peluru Habis");
                break;
            }
        }
    }
}
