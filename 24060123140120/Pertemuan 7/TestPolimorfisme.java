/* Nama File : TestPolimorfisme.java
*  Deskripsi : Main program TestPolimorfisme
*  Pembuat : Muhammad Shafwan Raihan S_24060123140120
*  Tanggal : 27 / 04 / 2025
*/

package Pertemuan7a;

import java.util.ArrayList;

public class TestPolimorfisme {
    public static void main(String[] args) {
        /*--------KAMUS--------*/
        Pegawai pegawai = new Programmer("Mira");
        Pegawai pegawai2 = new Manajer("Joko");
        Manajer pegawai3 = new Manajer("Argo");
        
        /*--------ALGORITMA--------*/
        ArrayList<Pegawai> emps = new ArrayList<>();
        emps.add(pegawai);
        emps.add(pegawai2);
        emps.add(pegawai3);

        for (Pegawai emp : emps) {
            emp.tampilData();
        }
    }  
}
