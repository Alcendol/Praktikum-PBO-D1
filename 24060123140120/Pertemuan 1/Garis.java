// Nama File : Garis.Java
// Deskripsi : Atribut dan method class Garis
// Pembuat : Muhammad Shafwan Raihan S_24060123140120
// Tanggal : 22/02/2025

public class Garis {
    Titik Tawal;
    Titik Takhir;
    static int countergaris = 0;


    Garis(){
        Tawal = new Titik(0,0);
        Takhir = new Titik(1,1);
        countergaris++;
    }

    Garis(Titik Tawal, Titik Takhir){
        this.Tawal = new Titik(Tawal.getabsis(), Tawal.getordinat());
        this.Takhir = new Titik(Takhir.getabsis(), Takhir.getordinat());
        countergaris++;
    }
    

    Titik getAwal(){
        return Tawal;
    }

    Titik getAkhir(){
        return Takhir;
    }

    void setTitikAwal(Titik Tawal) {
        this.Tawal = Tawal;
    }

    void setTitikAkhir(Titik Takhir) {
        this.Takhir = Takhir;
    }

    double getPanjang(){
        return Tawal.getjaraK(Takhir);
    }

    double getGradien(){
        double dx = Takhir.getabsis() - Tawal.getabsis();
        double dy = Takhir.getordinat() - Tawal.getordinat();
        return dy / dx;
    }

    static int getCounterGaris() {
        return countergaris;
    }

    Titik getTitikTengah(){
        return new Titik((Tawal.getabsis() + Takhir.getabsis()) / 2, 
                 (Tawal.getordinat() + Takhir.getordinat()) / 2);

    }

    boolean isSejajar(Garis G){
        return this.getGradien() == G.getGradien();
    }

    boolean isTegakLurus(Garis G){
        return this.getGradien() * G.getGradien() == -1;
    }

    void printgaris() {
        System.out.println("Garis dari (" + Tawal.getabsis() + ", " + Tawal.getordinat() + ") ke (" + 
                   Takhir.getabsis() + ", " + Takhir.getordinat() + ")");

    }

    String printPersamaan(){
        double m = getGradien();
        double c = Tawal.getordinat() - (m * Tawal.getabsis());
        return "y = " + m + "x + " + c;
    }
}

class Mgaris{
    public static void main(String[] args) {
        Titik t1 = new Titik(-2, 0);
        Titik t2 = new Titik(0, 4);
        Garis g1 = new Garis(t1, t2);

        Titik t3 = new Titik(1, 2);
        Titik t4 = new Titik(3, 6);
        Garis g2 = new Garis(t3, t4);

        System.out.println("Jumlah garis yang dibuat: " + Garis.getCounterGaris());

        g1.printgaris();
        g2.printgaris();

        System.out.println("Panjang Garis 1: " + g1.getPanjang());

        System.out.println("Gradien Garis 1: " + g1.getGradien());

        System.out.println("Titik Tengah Garis 1: (" + g1.getTitikTengah().getabsis() + ", " + g1.getTitikTengah().getordinat() + ")");

        System.out.println("Garis 1 dan Garis 2 sejajar? " + g1.isSejajar(g2));

        System.out.println("Garis 1 dan Garis 2 tegak lurus? " + g1.isTegakLurus(g2));

        System.out.println("Persamaan Garis 1: " + g1.printPersamaan());
        System.out.println("Persamaan Garis 2: " + g2.printPersamaan());
    }
}
