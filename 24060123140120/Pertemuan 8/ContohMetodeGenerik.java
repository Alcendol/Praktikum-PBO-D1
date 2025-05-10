/* Nama File : ContohMetodeGenerik.java
*  Deskripsi : Metode generik untuk mengendalikan class Datum
*  Pembuat : Muhammad Shafwan Raihan S_24060123140120
*  Tanggal : 07 / 05 / 2025
*/

public class ContohMetodeGenerik {
    public static <T extends Anabul> void tampilkanPerilaku(Datum<T> data)
    {
        data.getIsi().suara();
        data.getIsi().gerak();
    }
}