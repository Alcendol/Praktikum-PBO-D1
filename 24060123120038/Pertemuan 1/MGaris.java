package pertemuansatu;
//Nama: Nazla Azzahra Hermana
//NIM: 24060123120038
//Lab: PBO D1

public class MGaris {
    public static void main(String[] args) {
        Titik titikSatu = new Titik(2, 2);
        Titik titikDua = new Titik(7, 2);
        Garis garisSatu = new Garis(titikSatu, titikDua);
        
        Titik titikTiga = new Titik(5, 6);
        Titik titikEmpat = new Titik(8, 9);
        Garis garisDua = new Garis(titikTiga, titikEmpat);
        
        // Menampilkan panjang sebuh garis
        System.out.println("Panjang garis 1: " + garisSatu.getPanjang());
        System.out.println("Panjang garis 2: " + garisDua.getPanjang());
        
        // Menampilkan gradien sebuah garis
        System.out.println("Gradien garis 1: " + garisSatu.getGradien());
        System.out.println("Gradien garis 2: " + garisDua.getGradien());
        
        // Menampilkan titik tengah
        Titik titikTengah = garisSatu.getTitikTengah();
        System.out.println("Titik tengah garis 1: (" + titikTengah.absis + ", " + titikTengah.ordinat + ")");
        
        // Mengecek apakah kedua garis sejajar
        System.out.println("Apakah garis 1 dan 2 sejajar? " + garisSatu.isSejajar(garisDua));
        
        // Menampilkan persamaan garis
        garisSatu.printPersamaanGaris();
        
        // Menampilkan jumlah objek garis
        System.out.println("Jumlah garis yang dibuat: " + Garis.getCounterGaris());
    }
}

