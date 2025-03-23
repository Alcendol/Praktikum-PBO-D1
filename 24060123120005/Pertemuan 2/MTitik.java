/*  Nama File   : MTitik.java
 *  Deskripsi   : Berisi program utama untuk menguji method dalam class Titik
 *  Pembuat     : Patricia Gabrielle Yudianto
 *  Tanggal     : 23 Februari 2025 
*/

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik();

        T1.printTitik();
        T1.setAbsis(2.0);
        T1.printTitik();

        T1.setOrdinat(5.0);
        T1.printTitik();
        
        double a;

        a = T1.getAbsis();

        System.out.println(a);

        System.out.println(T1.getOrdinat());

        T1.geser(1.0, 2.5);
        T1.printTitik();

        Titik T2;

        T2 = T1;

        T2.printTitik();
        T1.setAbsis(10.0);
        T1.setOrdinat(10.0);

        T2.printTitik();

        Titik T3;
        T3 = new Titik();

        T3.printTitik();

        Titik T4;
        T4 = new Titik(-5.0, -3.0);
        T4.printTitik();

        System.err.println(Titik.getCounterTitik());

        //Mendapatkan hasil kuadran dari sebuah titik
        System.out.println("Kuadran: " + T1.getKuadran());
        System.out.println("Kuadran: " + T2.getKuadran());
        System.out.println("Kuadran: " + T3.getKuadran());
        System.out.println("Kuadran: " + T4.getKuadran());

        //Menghitung jarak sebuah titik ke titik pusat
        System.out.println("JarakKePusat: " + T1.getJarakPusat());
        System.out.println("JarakKePusat: " + T2.getJarakPusat());
        System.out.println("JarakKePusat: " + T3.getJarakPusat());
        System.out.println("JarakKePusat: " + T4.getJarakPusat());

        //Menghitung jarak antara dua titik
        System.out.println("Jarak antara T1 dan T2: " + T1.getJarak(T2));
        System.out.println("Jarak antara T2 dan T3: " + T2.getJarak(T3));
        System.out.println("Jarak antara T3 dan T4: " + T3.getJarak(T4));
        System.out.println("Jarak antara T1 dan T4: " + T1.getJarak(T4));


        //Buat titik baru hasil refleksi x tanpa mengubah T1
        System.out.print("T1 sebelum refleksi X : ");
        T1.printTitik();
        
        Titik T5;
        T5 = T1.getRefleksiX();
        System.out.print("Titik baru hasil refleksi X dari T1 : ");
        T5.printTitik();

        //Buat titik baru hasil refleksi y tanpa mengubah T1
        System.out.print("T1 sebelum refleksi Y : ");
        T1.printTitik();
        
        Titik T6;
        T6 = T1.getRefleksiY();
        System.out.print("Titik baru hasil refleksi Y dari T1 : ");
        T6.printTitik();

        //Refleksi langsung terhadap sumbu x
        System.out.print("T4 sebelum refleksi x : ");
        T4.printTitik();
        T4.refleksiX();
        System.out.print("T4 setelah refleksi x : ");
        T4.printTitik();

         //Refleksi langsung terhadap sumbu y
         System.out.print("T4 sebelum refleksi y : ");
         T4.printTitik();
         T4.refleksiY();
         System.out.print("T4 setelah refleksi y : ");
         T4.printTitik();
    }
}

