/*
 * Nama File : MainCal.java
 * Deskripsi : Contoh untuk Ad Hoc - Overloading (bagian main)
 * Pembuat : Patricia Gabrielle Yudianto
 * Tanggal : 27 April 2025
 */

public class MainCal {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(2, 3));
        System.out.println(calc.add(2, 3, 4));
        System.out.println(calc.add(3.0, 2.5));
    }
}
