/*
 * File      : Senjata.java
 * Fungsi    : Menyimpan bunyi letusan, status menusuk, dan stok peluru.
 * Penulis   : Pieter Mikha Pangondian Partogi S / 24060123140160
 * Tanggal   : 5 Mei 2025
 */
package per8senjata;

public class Senjata {
    private String bunyi;
    private boolean menusuk;
    private int peluru;

    public Senjata(String bunyi) {
        this.bunyi   = bunyi;
        this.menusuk = false;
        this.peluru  = 0;
    }

    /* -------- setter / getter ringan -------- */
    public void   setBunyi(String bunyi) { this.bunyi = bunyi; }
    public String getBunyi()            { return bunyi;       }

    public void   setMenusuk(boolean menusuk) { this.menusuk = menusuk; }
    public boolean isMenusuk()                { return menusuk;         }

    public void   setPeluru(int peluru) { this.peluru = peluru; }
    public int    getPeluru()           { return peluru;        }
}
