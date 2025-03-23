/* Pembuat : Nasywa Alya Kamila/24060123140163
 * Nama File : Titik.java
 * Deskripsi : Berisi atribut dan method dalam class Titik
 * Tanggal : Jumat, 21 Februari 2025
 */

 public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik(); //Membuat objek titik T1 (0,0)
        T1.setAbsis(3); //Mengubah absis T1 dengan nilai 3
        T1.setOrdinat(4); //Mengubah ordinat T1 dengan nilai 4
        T1.printTitik(); //Mengecek koordinat T1 ke layar
        T1.geser(3,4); //Mengecek T1 sejauh (3,4)
        T1.printTitik(); //Menampilkan koordinat T1 setelah digeser

        Titik T2 = T1;
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik();

        Titik T3 = new Titik(); //Membuat objek titik T1 (0,0)
        Titik T4 = new Titik(3,5); //Membuat objek titik T2 (3,5)
        T4.printTitik();
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