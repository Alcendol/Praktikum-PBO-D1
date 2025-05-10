/* Nama File : MainAnabul.java
 * Deskripsi : Berisi Main Anabul
 * Pembuat   : Naifah Athika Swedy - 24060123140187
 * Tanggal   : Minggu, 27 April 2025
 */

package pertemuanEnam(2);


import java.util.ArrayList;

public class MainAnabul {
    public static void main(String[] args) {
        Anabul kucing = new Kucing("Sasa");
        Anabul anjing = new Anjing("Cimit");
        Anabul burung = new Burung("Kurr");
        
        ArrayList<Anabul> hewanPeliharaan = new ArrayList<>();
        hewanPeliharaan.add(kucing);
        hewanPeliharaan.add(anjing);
        hewanPeliharaan.add(burung);
        
        for (Anabul hewan : hewanPeliharaan) {
            hewan.tampilkanInfo();
        }
    }
}
