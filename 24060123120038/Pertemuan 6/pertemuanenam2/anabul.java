package pertemuanenam2;
/*  Nama File   : anabul.java
 *  Deskripsi   : Program untuk menunjukkan kelas anabul
 *  Pembuat     : Nazla Azzahra Hermana / 24060123120038
 *  Tanggal     : 27 April 2025
*/

public class anabul {
    private String nama;
    
    public anabul(String nama) {
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