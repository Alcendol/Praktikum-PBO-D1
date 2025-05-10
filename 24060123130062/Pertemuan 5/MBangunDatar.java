package pertemuan5;

public class MBangunDatar {
    public static void main(String[] args) {
        Persegi P1 = new Persegi(4, "Merah", "solid");
        Lingkaran L1 = new Lingkaran(14, "hijau", "solid");
        System.out.println("Info Persegi : " );
        P1.printInfo();
        System.out.println("=====================================================");
        System.out.println("Info Lingkaran : ");
        L1.printInfo();
        System.out.println("=====================================================");
        System.out.println("Apakah luas P1 sama dengan L1 : " + P1.isEqual(L1));
        System.out.println("=====================================================");
        P1.zoom(50);
        L1.zoom(50);
        System.out.println("Zoom persegi 50%");
        System.out.println("Zoom lingkaran 50%");
        
        
        
    }
}
