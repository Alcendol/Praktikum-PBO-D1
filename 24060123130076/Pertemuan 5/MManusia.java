/**  
* File         : MManusia.java   
* Deskripsi    : Main class untuk menjalankan dan menguji implementasi
*                dari semua class
* Pembuat      : Muhammad Helmi Abdulbaqi
* NIM          : 24060123130076
* Tanggal      : 22 Maret 2025  
*/

import java.util.ArrayList;

public class MManusia {
    public static void main(String[] args) {
        // Membuat objek Pengusaha
        Pengusaha pengusaha1 = new Pengusaha("Andi", "15-03-2010", "Jakarta", 50000000, "123456789");
        Pengusaha pengusaha2 = new Pengusaha("Budi", "20-07-2015", 70000000, "987654321");
        
        // Membuat objek Petani
        Petani petani1 = new Petani("Slamet", "10-06-2012", "Banyuwangi", 20000000, "Malang");
        Petani petani2 = new Petani("Joko", "05-09-2018", 25000000, "Solo");
        
        // Membuat objek PNS
        PNS pns1 = new PNS("Rina", "01-01-2005", "Bandung", 60000000, "1122334455");
        PNS pns2 = new PNS("Dewi", "15-05-2013", 55000000, "9988776655");
        
        // Menyimpan semua objek dalam ArrayList
        ArrayList<Manusia> daftarOrang = new ArrayList<>();
        daftarOrang.add(pengusaha1);
        daftarOrang.add(pengusaha2);
        daftarOrang.add(petani1);
        daftarOrang.add(petani2);
        daftarOrang.add(pns1);
        daftarOrang.add(pns2);
        
        // Menampilkan informasi semua objek
        for (Manusia orang : daftarOrang) {
            orang.cetakInfo();
            System.out.println("-----------------------------");
        }
        
        // Menampilkan jumlah masing-masing objek
        System.out.println("Total Pengusaha: " + Pengusaha.getCounterPengusaha());
        System.out.println("Total Petani: " + Petani.getCounterPetani());
        System.out.println("Total PNS: " + PNS.getCounterPNS());
        System.out.println("Total Manusia: " + Manusia.getCounterMns());
    }
}
