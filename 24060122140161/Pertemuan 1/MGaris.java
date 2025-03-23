public class MGaris {
    public static void main(String[] args) {
        // Membuat garis
        System.out.println("==========Membuat Objek Garis==========");
        // Membuat garis G1
        System.out.println("Garis 1:");
        Garis G1 = new Garis(new Titik(0,0), new Titik(4,4));
        G1.printGaris();
        System.out.print("\n");
        
        // Membuat garis G2
        System.out.println("Garis 2:");
        Garis G2 = new Garis();
        G2.setTitikAwal(new Titik(0,0));
        G2.setTitikAkhir(new Titik(4,-4));
        G2.printGaris();
        System.out.print("\n");
        
        // Menghitung panjang garis
        System.out.println("=======Menghitung Panjang Garis========");
        System.out.println("Panjang garis G1: " + G1.hitungPanjang());
        System.out.println("Panjang garis G2: " + G2.hitungPanjang());
        System.out.print("\n");
        
        // Menhgitung gradien garis
        System.out.println("=======Menghitung Gradien Garis========");
        System.out.println("Gradien garis G1: " + G1.hitungGradien());
        System.out.println("Gradien garis G2: " + G2.hitungGradien());
        System.out.print("\n");
        
        // Menentukan titik tengah garis
        System.out.println("=====Menghitung Titik Tengah Garis=====");
        System.out.println("Titik tengah G1: " + G1.getTitikTengah().getAbsis() + ", " + G1.getTitikTengah().getOrdinat());
        System.out.println("Titik tengah G2: " + G2.getTitikTengah().getAbsis() + ", " + G2.getTitikTengah().getOrdinat());
        System.out.print("\n");
        
        // Menentukan apakah dua garis sejajar
        System.out.println("======Menentukan Sejajar Tidaknya======");
        System.out.println("Garis 1 dan Garis 2 sejajar: " + G1.isSejajar(G2));
        System.out.print("\n");
        
        // Menentukan apakah dua garis tegak lurus
        System.out.println("====Menentukan Tegak Lurus Tidaknya====");
        System.out.println("Garis 1 dan Garis 2 tegak lurus: " + G1.isTegakLurus(G2));
        System.out.print("\n");
        
        // Menentukan persamaan garis
        System.out.println("=======Menentukan Persamaan Garis======");
        System.out.print("Persamaan garis 1: ");
        G1.printPersamaanGaris();
        System.out.print("Persamaan garis 2: ");
        G2.printPersamaanGaris();
        System.out.print("\n");

        // Menentukan total garis yang dibuat
        System.out.println("===========Total Garis Dibuat==========");
        System.out.println("Total garis: " + G1.getCounterGaris());
    }
}
