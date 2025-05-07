/* Nama File : TestSenjata.java
 * Deskripsi : Berisi atribut dan method dalam class Test senjata
 * Pembuat   : Naifah Athika Swedy / 24060123140142
 * Tanggal   : Rabu, 7 Mei 2025
 * */

package pertemuanDelapan2;

public class TestSenjata {
        public static void main(String[] args) {
            Senjata ak47 = new Senjata("TASS");
            Senjata m16 = new Senjata("DRET");
            KontrolSenjata kontrolAK47 = new KontrolSenjata(ak47);
            KontrolSenjata kontrolM16  = new KontrolSenjata(m16);
    
            // Uji AK47
            kontrolAK47.menembak(3);
            kontrolAK47.isiPeluru(3);
            kontrolAK47.menembak(6);
    
            System.out.println("==========================");
    
            // Uji M16
            kontrolM16.menembak(2);
            kontrolM16.isiPeluru(4);
            kontrolM16.menembak(1);
        }
    }
