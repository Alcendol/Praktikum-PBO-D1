/*Nama: Muhammad Helmi Abdulbaqi 
 *NIM: 2406012313076
*/

public class mainAnabul {
    public static void main(String[] args) {
        anabul kucing = new kucing("khooceng");
        anabul anjing = new anjing("rawr");
        anabul burung = new burung("kakatua");
        kucing.gerak();
        kucing.bersuara();
        System.out.println("\n");
        anjing.gerak();
        anjing.bersuara();
        System.out.println("\n");
        burung.gerak();
        burung.bersuara();




        System.out.println("\n=== Simulasi dengan Datum & ContohMetodeGenerik ===");
        Datum<kucing> dataKucing = new Datum<>(new kucing("Mimi"));
        Datum<anjing> dataAnjing = new Datum<>(new anjing("Doggo"));
        Datum<burung> dataBurung = new Datum<>(new burung("Beo"));

        ContohMetodeGenerik.tampilkanPerilaku(dataKucing);
        System.out.println();
        ContohMetodeGenerik.tampilkanPerilaku(dataAnjing);
        System.out.println();
        ContohMetodeGenerik.tampilkanPerilaku(dataBurung);

    }
}