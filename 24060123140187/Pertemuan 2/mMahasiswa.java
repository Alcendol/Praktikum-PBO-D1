/* Nama File : mMain.java
 * Deskripsi : Berisi 
 * Pembuat   : Naifah Athika Swedy / 24060123140142
 * Tanggal   : Rabu, 26 Februari 2025
 * */

package pertemuanDua;

public class mMahasiswa {
        public static void main(String[] args) {
            MataKuliah MK1 = new MataKuliah();
    
            //tanpa parameter 
            MK1.setidMatKul("12345");
            MK1.setnama("PBO");
            MK1.setsks(3);
    
            System.out.println("Id Matkul : " + MK1.getidMatKul());
            System.out.println("Nama : " + MK1.getnama());
            System.out.println("SKS : " + MK1.getsks());
    
            //Menggunakan parameter 
            MataKuliah MK2 = new MataKuliah("54321", "ASA", 3);
    
            System.out.println("\nId Matkul :" + MK2.getidMatKul());
            System.out.println("nama :" + MK2.getnama());
            System.out.println("SKS :" + MK2.getsks());
    
        }
    }
    

