/*
 File         : Anabul.java
 Deskripsi    : Kelas abstrak untuk semua hewan peliharaan, mendefinisikan atribut nama serta perilaku gerak dan bersuara.
 Pembuat      : Novanza Edgar Wibowo / 24060123130055
 Tanggal      : 27 April 2025
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





