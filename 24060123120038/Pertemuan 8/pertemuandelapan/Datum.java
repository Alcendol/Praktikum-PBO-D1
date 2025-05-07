package pertemuandelapan;

/*  Nama File   : Datum.java
 *  Deskripsi   : Program untuk menunjukkan kelas Datum yang merupakan kelas generik untuk menyimpan objek Anabul
 *  Pembuat     : Nazla Azzahra Hermana / 24060123120038
 *  Tanggal     : 07 Mei 2025
*/

public class Datum<T> {
    private T isi;

    // Konstruktor 
    public Datum(T isi) {this.isi = isi;
    }

    // Metode 
    public T getIsi() {return isi;
    }

    // Prosedur 
    public void setIsi(T isi) {this.isi = isi;
    }
}
