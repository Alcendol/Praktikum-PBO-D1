package Pertemuan4;


public class MainBDatar {
    public static void main(String[] args) {
        Persegi p1 = new Persegi(5, "merah", "solid");
        Lingkaran l1 = new Lingkaran(3, "Putih", "tebal" );


        System.out.println(p1.getLuas());
        System.out.println(p1.getDiagonal());
        p1.setWarna("HYTAM");
        System.out.println(p1.getWarna());
        p1.printInfo(); 

        System.out.println(l1.getLuas());
        System.out.println(l1.getKeliling());
        System.out.println(l1.getJari());


        
        
    }
    
}
