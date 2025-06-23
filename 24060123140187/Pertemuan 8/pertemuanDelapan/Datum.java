/* Nama File : Datum.java
 * Deskripsi : Berisi atribut dan method dalam class Datum
 * Pembuat   : Naifah Athika Swedy / 24060123140142
 * Tanggal   : Rabu, 7 Mei 2025
 * */

package pertemuanDelapan;

public class Datum<T> {
    private T isi;

    //Konstruktor 
    public Datum(T isi) {this.isi = isi;
    }

    //Metode 
    public T getIsi() {return isi;
    }

    //Prosedur 
    public void setIsi(T isi) {this.isi = isi;
    }
}

