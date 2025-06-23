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
    }
}