/*
 * File         : Datum.java
 * Penulis      : Muhammad Paruda Pradayan / 24060123140124
 * Tgl          : 5 Mei 2025
 */


package anabulhewan;

public class Datum<T> {
    private T isi;
    public Datum() { }
    public Datum(T isi) {
        this.isi = isi;
    }
    public T getIsi() {
        return isi;
    }
    public void setIsi(T isi) {
        this.isi = isi;
    }
}