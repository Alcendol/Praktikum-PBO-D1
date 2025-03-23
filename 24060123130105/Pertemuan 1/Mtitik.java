
/* Nama File    : Mtitik.java
 * Deskripsi    : Berisi atribut dan method dalam class Titik
 * Pembuat      : Nadzif Silakhudin
 * Tanggal      : 2/19/2025
 */

public class Mtitik {
    public static void main(String[] args) {
        
        Titik T1, T2;
        T1 = new Titik(0,5);
        T1.printTitik();
        T1.geser(-1, 1.5);
        System.out.println("Geser Titik dengan x = -1 dan y = 1.5");
        T1.printTitik();
        System.out.println("kuadran : " + T1.getKuadran());
        System.out.println("jarak : " + T1.getJarak());

        System.out.println("membuat titik baru : ");
        T2 = new Titik(1,5);
        System.out.println("jarak kedua titik : " + T1.getJarak(T2));

        Titik T3;

        T3 = T1.getRefleksiX();
        System.out.println("Membuat titik baru dengan koordinat yang berupa refleksi sumbu X dari  " );
        T1.printTitik();
        System.out.println("Titik baru :");
        T3.printTitik();
        
        System.out.println("Counter Titik : " + Titik.getCounterTitik());
        
    }
}
