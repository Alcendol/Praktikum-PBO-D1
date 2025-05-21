package com.mycompany.latihantutorial;

public class Senjata {
    private String bunyi;
    private Boolean menusuk;
    private int peluru;
    
    public Senjata(String bunyi){
        this.bunyi = bunyi;
        this.menusuk = false;
        this.peluru = 0;
    }
    
    public String getBunyi(){
        return bunyi;
    }
    
    private void setBunyi(String bunyi){
        this.bunyi = bunyi;
    }
    
    public int getPeluru(){
        return peluru;
    }
    
    public void setPeluru(int jumlah){
        this.peluru = jumlah;
    }
    
    private Boolean isMenusuk(){
        return menusuk;
    }
    
    private void setMenusuk(Boolean menusuk){
        this.menusuk = menusuk;
    }
    
    public void menembak(int jumlah){
        for(int i = 0; i < jumlah; i++){
            System.out.print(getBunyi() + " ");
        }
        System.out.print("");
    }
    
    public void pasangBayonet(){
        setMenusuk(true);
        System.out.print("Bayonet terpasang ");
    }
    
    public String menusuk(){
        if(isMenusuk()){
            return "Jleb!!!";
        }else{
            return "Bayonet belum terpasang! ";
        }
    }  
}
