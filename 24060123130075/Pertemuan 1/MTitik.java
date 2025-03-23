/* Nama File    : MTitik.java
 * Deskripsi    : Berisi main dari class Titik
 * Pembuat      : Muhammad Irsyad Rabbani 24060123130075
 * Tanggal      : 19/2/2025
 */ 

public class MTitik {
    public static void main(String[] args) {
        //T1
        Titik T1 = new Titik();
        T1.setAbsis(2.2);
        T1.setOrdinat(5.3);
        T1.geser(5.7, 2.1);

        System.out.println("Absis : "  + T1.getAbsis());
        System.out.println("Ordinat : "  + T1.getOrdinat());
        T1.printTitik();

        System.out.println("=====================");

        //T2
        Titik T2 = new Titik();
        T2.setAbsis(5.0);
        T2.setOrdinat(6.0);

        System.out.println("Absis : "  + T2.getAbsis());
        System.out.println("Ordinat : "  + T2.getOrdinat());        
        T2.printTitik();

        System.out.println("=====================");    
        
        //T3 (overloading constructor)
        Titik T3 = new Titik(-5.0, 4.4);
        T3.printTitik();

        //kuadran
        System.out.println("Kuadran : " + T3.getKuadran());

        //jarak sebuah titik ke pusat
        System.out.println("Jarak Titik ke Pusat : " + T3.getJarakPusat());

        //jarak antara dua titik
        System.out.println("Jarak T2 ke T3 : " + T2.getJarak(T3));

        //refleksi
        T3.refleksiX();
        T3.refleksiY();
        T3.printTitik();

        //getRefleksi
        System.out.println("RefleksiX : (" + T3.getRefleksiX().absis + "," + T3.getRefleksiX().ordinat + ")");
        System.out.println("RefleksiY : (" + T3.getRefleksiY().absis + "," + T3.getRefleksiY().ordinat + ")");

        System.out.println("=====================");    

        System.out.println("Counter : "  + Titik.getCounterTitik());        
    }
}