/* Nama File : MTitik.java
 * Deskripsi : Aplikasi file java
 * Pembuat : Muhammad Firzi Ryadi/24060123140202
 * Tanggal : Jumat, 21 Februari 2025
 */

public class MTitik {
    public static void main(String[] args) {
       Titik T1 = new Titik(4,-6);
       Titik T2 = new Titik(3,5);
       
        System.out.println("Jarak antar T1 dan T2: " + T1.getJarak(T2));
        System.out.println("Ordinat T1 : " + T1.getOrdinat());
        System.out.println("T1 terletak pada kuadran : " + T1.getKuadran());
        System.out.println("Jarak Pusat T1 : " + T1.getJarakPusat());
        T2.refleksiX();
        T2.refleksiY();
        T2.printTitik();
        Titik reflexX = T1.getRefleksiX();
        reflexX.printTitik();
        Titik refelxY = T1.getRefleksiY();
        refelxY.printTitik();
       /*System.out.println("jumlah objek titik = " + Titik.getCounterTitik());*/
       System.out.println("jumlah objek titik = " + T2.getCounterTitik());
       /*T1 = new Titik();
       Titik T2 = T1;
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik();
        T1.geser(3,4);
        T2.printTitik();/
       /*T1.setAbsis(3);
       T1.setOrdinat(4);
       T1.printTitik();
       T1.geser(3,4);
       T1.printTitik();*/
    }
}
