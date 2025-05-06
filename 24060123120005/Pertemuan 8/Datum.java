/*
 * Nama File : Datum.java
 * Deskripsi : Kelas generic yang menyimpan satu data bertipe generik
 * Pembuat   : Patricia Gabrielle Yudianto
 * Tanggal   : 6 Mei 2025
 */

public class Datum<T> {
    private T isi;
    
    public Datum() {}
    
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