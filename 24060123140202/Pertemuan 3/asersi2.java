/*
 * Nama File    : Asersi2.java
 * Deskripsi    : Program untuk mencoba asersi
 * Pembuat      : Muhammad Firzi Ryadi / 24060123140202
 * Tanggal      : 5 Maret 2025
 */
//class lingkaran
class lingkaran{
    private double jarijari;

    public lingkaran(double jarijari){
        this.jarijari = jarijari;
        assert (jarijari > 0):"jari jari tidak boleh kurang dari sama dengan nol !!!";

    }

    public double hitungkeliling() {
        double keliling = 2 * Math.PI *jarijari;
        return keliling;
    }
}



public class asersi2 {
    public static void main(String[] args) {
        double jarijari = 0;
        lingkaran l = new lingkaran(jarijari);
        double kelilinglingkaran = l.hitungkeliling();

        System.out.println("keliling lingkaran = " + kelilinglingkaran);
    }
}

/*
 * Pertanyaan : secara konsep, ada yang kurang tepat pada program Asersi2 di atas.
                Jelaskan pada lembar laporan praktikum!
 * Jawaban : assert lebih baik melekat pada konstruktor, dan penulisan pesan
 *           */