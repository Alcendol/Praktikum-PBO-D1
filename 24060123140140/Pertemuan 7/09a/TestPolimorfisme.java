import java.util.ArrayList;

public class TestPolimorfisme {
    
    public static void main(String[] args) {
        // Inisialisasi objek pegawai
        Pegawai pegawai1 = new Programmer("Mira");
        Pegawai pegawai2 = new Manajer("Joko");
        Manajer pegawai3 = new Manajer("Argo");
        
        // Membuat ArrayList untuk menampung objek pegawai
        ArrayList<Pegawai> emps = new ArrayList<>();
        emps.add(pegawai1);
        emps.add(pegawai2);
        emps.add(pegawai3);
        
        // Menampilkan daftar pegawai
        System.out.println("Output - Polimorfisme Pure");
        System.out.println();
        
        // Iterasi melalui ArrayList dan memanggil method tampilData()
        for (Pegawai emp : emps) {
            emp.tampilData();
        }
    }
}