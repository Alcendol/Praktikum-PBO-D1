package pertemuanenam;
/*  Nama File   : testPolimerfisme.java
 *  Deskripsi   : program utama untuk menguji konsep polimorfisme pada kelas pegawai dan turunannya, yaitu programmer dan manajer
 *  Pembuat     : Nazla Azzahra Hermana / 24060123120038
 *  Tanggal     : 27 April 2025
*/

import java.util.ArrayList;

public class testPolimorfisme {
    public static void main(String[] args) {
        System.out.println("Nama: Nazla Azzahra");
        System.out.println("NIM: 24060123120038");
        System.out.println(); 
        
        pegawai pegawai1 = new programmer("Nepa");
        pegawai pegawai2 = new manajer("Wahyu");
        manajer pegawai3 = new manajer("Daffa");

        ArrayList<pegawai> emps = new ArrayList<>();
        emps.add(pegawai1);
        emps.add(pegawai2);
        emps.add(pegawai3);

        for (pegawai emp : emps) {
            emp.tampilData();
        }
    }
}