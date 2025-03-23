/* Nama File : Mtitik.java
 * Deskripsi : Berisi atribut dan method dalam class Titik
 * Pembuat   : Naifah Athika Swedy / 24060123140142
 * Tanggal   : Rabu, 26 Februari 2025
 * */

package pertemuanDua;

public class Mtitik {
    public static void main(String[] args){
        Titik T1;

        T1 = new Titik();
        T1.printTitik();

        T1.setAbsis(2.0);
        T1.printTitik();

        T1.setOrdinat(5.0);
        T1.printTitik();

        //ditampung-disimpan di variabel
        double a;
        a = T1.getAbsis();
        System.out.println(a);

        //langsung cetak
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
        T4 = new Titik(1.0,1.0);
        T4.printTitik();

        System.err.println(Titik.getCounterTitik());

        System.out.println("Jumlah objek Titik =" + Titik.getCounterTitik());
        System.out.println("Titik T3 ada di kuadran : " + T3.getKuadran());
        System.out.println("Jarak T1 terhadap pusat: " + T1.getJarakPusat());
        System.out.println("Jarak T1 dengan Titik lain : " + T1.getJarak(T3));

        T3.refleksiX();
        T3.printTitik();
        Titik T5 = T3.getRefleksiX();
        T5.printTitik();
        
        Titik T6 = T3.getRefleksiY();
        T6.printTitik();

        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());
    }
}
