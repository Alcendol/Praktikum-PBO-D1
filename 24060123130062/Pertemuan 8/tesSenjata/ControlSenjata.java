package com.mycompany.latihantutorial;
public class ControlSenjata {
    private Senjata senjata;
    
    public ControlSenjata(Senjata s){
        this.senjata = s;
    }
    
    public Boolean isAdaPeluru(){
        return senjata.getPeluru() > 0;
    }
    
    public void isiPeluru(int jumlahPeluru){
        senjata.setPeluru(senjata.getPeluru() + jumlahPeluru);
        System.out.println("Peluru berhasil diisi : " + jumlahPeluru);
    }
    
    public void menembak(int jumlah){
        System.out.println("Siap menembak " + jumlah + " kali");
        if(senjata.getPeluru() >= jumlah){
            for(int i = 0; i < jumlah; i++){
                System.out.println(senjata.getBunyi() + " ");
            }
            senjata.setPeluru(senjata.getPeluru()-jumlah);
            System.out.println("sisa peluru : " + senjata.getPeluru());
        }
        else if(senjata.getPeluru() > 0){
            for(int i = 0; i < jumlah; i++){
                if(senjata.getPeluru() > 0){
                    System.out.println(senjata.getBunyi() + " ");
                    senjata.setPeluru(senjata.getPeluru() - 1);
                }
                else{
                    System.out.println("Peluru habis ichikboss!!! ");
                }          
            }
            senjata.setPeluru(0);
        }
        else{
            System.out.println("Pelurunya nggak cukup ichikboss!!!");
        }
    }
}
