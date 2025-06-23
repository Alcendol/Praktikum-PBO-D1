/*
 File         : Main.java
 Deskripsi    : Program utama untuk menguji polimorfisme pada berbagai subclass Pegawai.
 Pembuat      : Novanza Edgar Wibowo / 24060123130055
 Tanggal      : 27 April 2025
*/

public class Main {
    public static void main(String[] args) {
        Pegawai[] emps = {
            new Programmer("Mira"),
            new Manajer   ("Joko"),
            new Manajer   ("Argo")
        };

        for (Pegawai emp : emps) {
            emp.tampilData();
            System.out.println();
        }
    }
}
