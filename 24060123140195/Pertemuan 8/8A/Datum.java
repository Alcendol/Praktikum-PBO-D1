/*
 * Nama File    : Datum.java
 * Deskripsi    : Kelas untuk menyimpan data hewan dengan tipe generik.
 * Pembuat      : Nayaka Fauzan Prasetyo / 24060123140195
 * Tanggal      : 5 Mei 2025
 */
class Datum<T> {
    private T isi;

    public T getIsi() {
        return isi;
    }

    public void setIsi(T isi) {
        this.isi = isi;
    }
}
