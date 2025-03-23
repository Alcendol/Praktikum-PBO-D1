// Nama : Noval putra barliyanda
// NIM  : 24060123140137
// Lab : D1
// Nama File : MTitik.java

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik();
        Titik T2 = new Titik(3, 4);
        T1.setAbsis(3);
        T1.setOrdinat(-5);
        T1.printTitik();
        T2.printTitik();
        System.out.println("Jumlah Object Titik = " + Titik.getCounterTitik());
        System.out.println("Jarak ke titik pusat = " + T1.getJarakPusat());
        System.out.println("Jarak antara T1 dan T2 = " + T1.getJarak(T2));
        T1.refleksiX();
        System.out.println("Koordinat setelah refleksi thd sumbu X = ");
        T1.printTitik();        
    }
}