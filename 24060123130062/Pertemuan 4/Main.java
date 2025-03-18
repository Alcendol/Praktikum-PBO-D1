package employee;
/*
 * Nama File    : main.java
 * Deskripsi    : Program untuk main
 * Pembuat      : Muhammad Mahdi Buntarwatangan / 24060123130062
 * Tanggal      : 12 Maret 2025
 */

public class Main {
    public static void main(String[] args) {
       DosenTetap D1 = new DosenTetap(
        "197108111997021004", 
        "24060123130062", 
        "Aris Sugiharto", 
        "24-01-1971", 
        "7-08-2005", 
        8000000, 
        "Fakultas Sains dan Matematika");
        
        Tendik T1 = new Tendik("987654321", "Siti", "15-7-1980", "1-3-2010", 3000000, "Kemahasiswaan");
        
        DosenTamu dosenTamu = new DosenTamu("200517869282", "87654321", "Muhammad Mahdi Buntarwatangan", "24-01-2025", "1-1-2020", 20000000, "Fakultas Teknik", "10-10-2026");

        System.out.println("==================================================================\n");
        D1.printInfo();
        System.out.println("==================================================================\n");
        T1.printInfo();
        System.out.println("==================================================================\n");
        dosenTamu.printInfo();
    }
}
