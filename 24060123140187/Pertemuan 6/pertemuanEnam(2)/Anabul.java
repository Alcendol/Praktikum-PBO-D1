/* Nama File : Anabul.java
 * Deskripsi : Berisi class Anabul
 * Pembuat   : Naifah Athika Swedy - 24060123140187
 * Tanggal   : Minggu, 27 April 2025
 */

package pertemuanEnam(2);

public class Anabul {
    private String nama;
    
    public Anabul(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void bersuara() {
        System.out.println("Hewan bersuara");
    }
    
    public void bergerak() {
        System.out.println("Hewan bergerak");
    }
    
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.print("Suara: ");
        bersuara();
        System.out.print("Gerakan: ");
        bergerak();
        System.out.println();
    }
}
}
