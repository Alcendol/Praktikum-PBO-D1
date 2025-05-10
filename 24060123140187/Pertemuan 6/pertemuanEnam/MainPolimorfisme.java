/* Nama File : MainPolimerfisme.java
 * Deskripsi : Berisi Main Polimerfisme
 * Pembuat   : Naifah Athika Swedy - 24060123140187
 * Tanggal   : Minggu, 27 April 2025
 */

package pertemuanEnam;

import java.util.ArrayList;

public class MainPolimorfisme {
    public static void main(String[] args) {
        System.out.println("Nama: Naifah Athika Swedy");
        System.out.println("NIM: 24060123140187");
        System.out.println(); 
        
        Pegawai pegawai1 = new Programmer("Bojin");
        Pegawai pegawai2 = new Manajer("Wahyu");
        Manajer pegawai3 = new Manajer("EYOOO");

        ArrayList<Pegawai> emps = new ArrayList<>();
        emps.add(pegawai1);
        emps.add(pegawai2);
        emps.add(pegawai3);

        for (Pegawai emp : emps) {
            emp.tampilData();
        }
    }
}
