/* Nama File : Datum.java
*  Deskripsi : class generik Datum 
*  Pembuat : Muhammad Shafwan Raihan S_24060123140120
*  Tanggal : 07 / 05 / 2025
*/

public class Datum<T> {
    private T isi;

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