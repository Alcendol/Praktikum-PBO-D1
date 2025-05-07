/* Nama File : Senjata.java
*  Deskripsi : Atribut dan method class Senjata
*  Pembuat : Muhammad Shafwan Raihan S_24060123140120
*  Tanggal : 07 / 05 / 2025
*/

package com.mycompany.senjata;

public class Senjata {
    /*--------ATRIBUT--------*/
    private String bunyi;
    private boolean menusuk;
    private int peluru;

    /*--------METHOD--------*/
    // Konstruktor dengan parameter
    public Senjata(String bunyi) {
        this.bunyi = bunyi;
        this.peluru = 0;
        this.menusuk = false;
    }

    // Selektor bunyi
    public String getBunyi() {
        return bunyi;
    }

    // Selektor peluru
    public int getPeluru() {
        return peluru;
    }

    // Selektor menusuk
    public boolean isMenusuk() {
        return menusuk;
    }

    // Mutator menusuk
    public void setMenusuk(boolean menusuk) {
        this.menusuk = menusuk;
    }

    // Mutator peluru
    public void setPeluru(int peluru) {
        this.peluru += peluru;
    }
}
