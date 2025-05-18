/*
 * Nama File : Car.java
 * Deskripsi : Subclass untuk percobaan Inclusion
 * Pembuat : Patricia Gabrielle Yudianto  
 * Tanggal : 27 April 2025  
 */

public class Car extends Vehicle {
    void calRent(int jarak, float harga) {
        float fare = jarak * harga;
        fare = fare - 100.00f;
        System.out.println("harga sewa mobil = " + fare);
    }
}
