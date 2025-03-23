public class MTitik {
    public static void main(String[] args) {
        System.out.println("==========Membuat Objek Titik==========");
        // Membuat titik T1
        System.out.println("Titik T1:");
        Titik T1 = new Titik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.geser(3, 4);
        T1.printTitik();
        System.out.println("Kuadran " + T1.getKuadran());

        // Membuat titik T2
        System.out.println("Titik T2:");
        Titik T2 = T1;
        T2.setAbsis(-10);
        T2.setOrdinat(10);
        T2.printTitik();
        System.out.println("Kuadran " + T2.getKuadran());

        // Membuat titik T3
        System.out.println("Titik T3:");
        Titik T3 = new Titik(-2, -2);
        T3.printTitik();
        System.out.println("Kuadran " + T3.getKuadran() + "\n");

        System.out.println("=======Merefleksikan Objek Titik=======");
        // Refleksi titik T1
        System.out.println("Refleksi Titik T1:");
        T1.refleksiX();
        T1.refleksiY();
        T1.printTitik();
        System.out.println("Kuadran " + T1.getKuadran() + "\n");

        // Refleksi titik T2
        System.out.println("Refleksi Titik T2:");
        T2.refleksiX();
        T2.refleksiY();
        T2.printTitik();
        System.out.println("Kuadran " + T2.getKuadran() + "\n");

        // Refleksi titik T3
        System.out.println("Refleksi Titik T3:");
        T3.refleksiX();
        T3.refleksiY();
        T3.printTitik();
        System.out.println("Kuadran " + T3.getKuadran() + "\n");

        System.out.println("==Menghitung Objek Titik Dengan Pusat==");
        System.out.println("Jarak T1 Dengan Pusat: " + T1.getJarakPusat());
        System.out.println("Jarak T2 dengan Pusat: " + T2.getJarakPusat());
        System.out.println("Jarak T3 dengan Pusat: " + T3.getJarakPusat() + "\n");      
        
        System.out.println("====Menghitung Jarak Objek Dua Titik===");
        System.out.println("Jarak T1 dengan T2: " + T1.getJarak(T2));
        System.out.println("Jarak T1 dengan T3: " + T1.getJarak(T3));
        System.out.println("Jarak T2 dengan T3: " + T2.getJarak(T3) + "\n");

        System.out.println("===========Total Titik Dibuat==========");
        System.out.println("Total titik: " + Titik.getCounterTitik());
    }
}
