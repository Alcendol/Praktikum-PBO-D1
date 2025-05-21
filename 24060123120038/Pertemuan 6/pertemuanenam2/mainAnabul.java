package pertemuanenam2;
/*  Nama File   : mainAnabul.java
 *  Deskripsi   : program utama untuk menguji konsep polimorfisme pada kelas anabul dan turunannya
 *  Pembuat     : Nazla Azzahra Hermana / 24060123120038
 *  Tanggal     : 27 April 2025
*/

import java.util.ArrayList;

public class mainAnabul {
    public static void main(String[] args) {
        anabul kucing = new kucing("Nico");
        anabul anjing = new anjing("Nepa");
        anabul burung = new burung("Daffa");
        
        ArrayList<anabul> hewanPeliharaan = new ArrayList<>();
        hewanPeliharaan.add(kucing);
        hewanPeliharaan.add(anjing);
        hewanPeliharaan.add(burung);
        
        for (anabul hewan : hewanPeliharaan) {
            hewan.tampilkanInfo();
        }
    }
}