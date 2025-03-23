/*Nama: Muhammad Helmi Abdulbaqi */
/*Nim: 24060123130076 */
/*Kelas-Lab: D-C1 */

public class Mtitik{
    public static void main(String[] args){
        //membuat objek titik
        titik T1= new titik();
        titik T2= new titik();
        titik Trefleksi = new titik();

        //set isi titik
        Trefleksi.setAbsis(0);
        Trefleksi.setOrdinat(0);
        T1. setAbsis(3);
        T1.setOrdinat(5);
        T2. setAbsis(3);
        T2.setOrdinat(9);

        
        // Memanggil semua metode dalam kelas titik
        System.out.println("kondisi awal T1 dan T2:");
        T1.printTitik();
        T2.printTitik();
        System.out.println("hasil setelah digeser" );
        T1. geser(2, 2);
        T1.printTitik();
        System.out.println("kuadran dari titik T1 adalah : "+ T1.getKuadran());
        System.out.println("jarak titik T1 dari titik pusat : "+ T1.getJarakPusat());
        System.out.println("jarak dari titik T1 ke T2 adalah : "+ T1.getJarak(T2));
        T1.refleksiX();
        T1.refleksiY();
        System.out.println("refleksi terhadap sumbu X dan Y dari T1:" );
        T1.printTitik();
        System.out.println("kembaliakn nilai dari refleksi T1 absis");
        Trefleksi =T1.getRefleksiX();
        Trefleksi.printTitik();
        System.out.println("kembaliakn nilai dari refleksi T1 ordinat");
        Trefleksi=T1.getRefleksiY();
        Trefleksi.printTitik();


     



    }
}