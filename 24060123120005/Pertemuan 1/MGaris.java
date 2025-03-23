/*  Nama File   : MGaris.java
 *  Deskripsi   : Berisi program utama untuk menguji method dalam class Garis
 *  Pembuat     : Patricia Gabrielle Yudianto
 *  Tanggal     : 23 Februari 2025 
*/

public class MGaris {
    public static void main(String[] args){
        //Membuat object titik
        Titik T1 = new Titik(1,5);
        Titik T2 = new Titik(5,4);
        Titik T3 = new Titik(3,2);
        Titik T4 = new Titik(3,4);
        Titik T5 = new Titik(2, 3);
        Titik T6 = new Titik(5, 7);
        Titik T7 = new Titik(4, 5);
        Titik T8 = new Titik(7, 9);
        Titik T9 = new Titik(5, 9);
        
        //Membuat object garis
        Garis G1 = new Garis(T1, T2); 
        Garis G2 = new Garis(T3, T4);   
        Garis G3 = new Garis(T1, T1);
        Garis G4 = new Garis(T5, T6); // Gradien = (7-3) / (5-2) = 4/3
        Garis G5 = new Garis(T7, T8); // Gradien = (9-5) / (7-4) = 4/3
        Garis G6 = new Garis(T2, T4);
        Garis G7 = new Garis(T7, T9); // Gradien = 4/1 = 4
        Garis G8 = new Garis(T1, T2); // Gradien = -1/4


        //Menampilkan info garis
        System.out.print("Garis 1 : ");
        G1.printGaris();
        
        //Mengeset dan menampilkan info garis setelah diset
        G1.setTitikAwal(T4);
        System.out.print("Garis 1 setelah diset : ");
        G1.printGaris();

        //Menghitung dan menampilkan panjang garis
        System.out.println("Panjang garis G1 : " + G1.getPanjangGaris());

        //Menghitung dan menampilkan gradien graris
        System.out.print("Garis 2 : ");
        G2.printGaris();

        if (G2.titikawal.absis == G2.titikakhir.absis){
            System.out.println("Gradien G2 : Tidak terdefinisi (garis vertikal)");
        }
        else {
            System.out.println("Gradien G2 : " + G2.getGradien());
        }
        

        System.out.print("Garis 3 : ");
        G3.printGaris();

        if (G3.titikawal.absis == G3.titikakhir.absis){
            System.out.println("Gradien G3 : Tidak terdefinisi (garis vertikal)");
        }
        else {
            System.out.println("Gradien G3 : " + G3.getGradien());
        }

        //Menghitung dan menampilkan titik tengah 
        System.out.print("Titik tengah G1 : ");
        G1.getTitikTengah().printTitik(); //Pakai cara ini untuk print supaya gaperlu toString(), karena di Java kalo kita return object outputnya alamat memorinya


        //Mengecek dan menampilkan apabila suatu garis sejajar dengan garis lain
        System.out.println("G1 sejajar G2 : " + G1.IsSejajar(G2));
        System.out.println("G1 sejajar G2 : " + G4.IsSejajar(G5));

        //Mengecek dan menampilkan apabila suatu garis tegak lurus dengan garis lain
        System.out.println("G1 tegak lurus G5 : " + G1.IsTegakLurus(G5));
        System.out.println("G2 tegak lurus G6 : " + G2.IsTegakLurus(G6));
        System.out.println("G8 tegak lurus G7 : " + G8.IsTegakLurus(G7));

        //Menampilkan persamaan garis dalam string
        System.out.println("Persamaan garis G1 : " + G1.getPersamaanGaris());
        System.out.println("Persamaan garis G4 : " + G4.getPersamaanGaris());
        System.out.println("Persamaan garis G7 : " + G7.getPersamaanGaris());


        //Menampilkan total garis
        System.out.println("Total garis : " + Garis.getCounterGaris());
    }
}
