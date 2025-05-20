/*
 File         : Anabul.java 
 Deskripsi    : Kelas induk abstrak untuk hewan peliharaan
 Pembuat      : Novanza Edgar Wibowo / 24060123130055
 Tanggal      : 6 Mei 2025 
*/
public abstract class Anabul {
    protected String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public abstract void Gerak();

    public abstract void Bersuara();
}