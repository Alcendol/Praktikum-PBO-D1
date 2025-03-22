package pemetaanPajak;

public class Main {
    public static void main(String[] args) {
        PNS PNS1 = new PNS("2005132405", "Muhammad Mahdi Buntarwatangan", "25-01-2023", "Semarang", 10000000);
        Pengusaha Pengusaha1 = new Pengusaha(
            "246755614",
            "Bintang Rifqi Maulana DS", 
            "01-02-2022",
            "Kota Demak", 
            100000000
        );
        Manusia Petani1 = new Petani("Kota Kebumen", 
        "Sodik Gholibi", 
        "13-07-1978", 
        "Jl. Tegalsari Kel. Adikarso", 
        3000000)
        ;
        

        PNS1.setAlamat("Jl. Genuk Perbalan No.11 Kota Semarang");

        System.out.println("Jumlah Manusia = " + Manusia.getCounterMns());
        System.out.println("Jumlah PNS = " + PNS.getCounterPNS());
        System.out.println("Jumlah Pengusaha = " + Pengusaha.getCounterPengusaha());
        System.out.println("Jumlah Petani = " + Petani.getCounterPetani());

        System.out.println("==============================================================");
        System.out.println("Pajak PNS PNS1 = " + String.format("Rp %,.2f", PNS1.hitungPajak()).replace(',', 'X').replace('.', ',').replace('X', '.'));
        System.out.println("Pajak Pengusaha Pengusaha1 = " + String.format("Rp %,.2f", Pengusaha1.hitungPajak()).replace(',', 'X').replace('.', ',').replace('X', '.'));
        System.out.println("==============================================================");

        System.out.println("Masa kerja PNS1 : " + PNS1.hitungMasaKerja() + " + (2)" + " bulan");
        System.out.println("Masa kerja Pengusaha1: " + Pengusaha1.hitungMasaKerja() + " + (6)" + " bulan");
        System.out.println("Masa kerja Petani1: " + Petani1.hitungMasaKerja() + " + (0)" + " bulan");
        System.out.println("==============================================================");

        System.out.println("PNS");
        PNS1.printInfo();
        System.out.println("==============================================================");
        System.out.println("Pengusaha");
        Pengusaha1.printInfo();
        System.out.println("==============================================================");
        System.out.println("Petani");
        Petani1.printInfo();
        System.out.println("==============================================================");


    }    
}
