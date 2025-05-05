/*
 * Nama : Nadzif Silakhudin
 * NIM : 24060123130105
 * Nama File : Test Polimorfisme.java
 * Tanggal : 27 April 2025
 */
import java.util.ArrayList;

public class TestPolimorfisme {
    public static void main(String[] args) {
        Pegawai pegawai1 = new Programmer("Mira");
        Pegawai pegawai2 = new Manajer("Joko");
        Manajer pegawai3 = new Manajer("Argo");

        ArrayList<Pegawai> emp = new ArrayList<>();
        emp.add(pegawai1);
        emp.add(pegawai2);
        emp.add(pegawai3);

        for (Pegawai empData : emp) {
            empData.tampilData();
            System.out.println();
        }
    }
}
