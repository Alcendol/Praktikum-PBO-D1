/* Nama File    : Lingkaran.java
 * Deskripsi    : berisi class Lingkaran
 * Pembuat      : Novanza Edgar Wibowo / 24060123130055
 * Tanggal      : 12 Maret 2025
 */

public class Lingkaran {
    protected double jariJari;

    public Lingkaran() {
        jariJari = 0;
    }

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public double getJari() {
        return jariJari;
    }

    public void setJari(double jariJari) {
        this.jariJari = jariJari;
    }

    public double getLuas() {
        return Math.PI * jariJari * jariJari;
    }

    public double getKeliling() {
        return 2 * Math.PI * jariJari;
    }

    public double getDiameter() {
        return 2 * jariJari;
    }
}
