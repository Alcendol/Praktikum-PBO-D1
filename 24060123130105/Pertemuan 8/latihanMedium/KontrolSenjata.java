/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanMedium;

/**
 *
 * @author ACER
 */
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
