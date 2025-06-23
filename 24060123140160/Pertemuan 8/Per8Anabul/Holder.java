/*
 * File         : Holder.java
 * Deskripsi    : kelas generik penampung sebuah objek bertipe apa saja
 */
package per8;

public class Holder<T> {
    private T konten;

    public void simpan(T x)     { konten = x; }
    public T   ambil()          { return konten; }
}
