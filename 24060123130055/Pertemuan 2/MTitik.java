/* Nama File    : MTitik.java
 * Deskripsi    : berisi objek Titik dan memanggil method dalam class Titik
 * Pembuat      : Novanza Edgar Wibowo / 24060123130055
 * Tanggal      : 26 Februari 2025
 */

 public class MTitik {
    public static void main(String[] args){
        Titik T1 = new Titik(3,6);
        T1.setAbsis(3);
        T1.setOrdinat(5);
        T1.printTitik();       //PRINT T1 AFTER SET
        T1.geser(3, 4);
        T1.printTitik();       //PRINT T1 AFTER GESER

        Titik T2 = T1;
        T2.printTitik();       //PRINT T2 
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik();       //PRINT T2 AFTER SET

        

        Titik T3 = new Titik(1, 5);
        T3.printTitik();       //PRINT T3
        Titik T4 = new Titik(3, -5);
        T4.printTitik();       //PRINT T4

        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());
        // System.out.println("Jumlah Objek Titik = " + T3.getCounterTitik());
        
        int dran;
        dran = T4.getKuadran();
        System.out.println("Kuadran Titik T4 = " + dran);
        
        System.out.println("Jarak Pusat Titik T4 = " + T4.getJarakPusat());

        System.out.println("Jarak Titik T4 dan T3 = " + T4.getJarak(T3));

        T4.refleksiX();
        T4.printTitik();
        T4.refleksiY();
        T4.printTitik();
        System.out.println("Refleksi X T4 = " + T4.getRefleksiX());
        T4.printTitik();
        System.out.println("Refleksi Y T4 = " + T4.getRefleksiY());
        T4.printTitik();
    }
}