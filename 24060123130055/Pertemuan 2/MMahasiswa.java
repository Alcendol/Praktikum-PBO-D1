/* Nama File    : MMahasiswa.java
 * Deskripsi    : berisi objek Mahasiswa dan memanggil method dalam class Mahasiswa
 * Pembuat      : Novanza Edgar Wibowo / 24060123130055
 * Tanggal      : 4 Maret 2025
 */

public class MMahasiswa {
    public static void main(String[] args) {
            MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);
            MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3);
            Mahasiswa M1 = new Mahasiswa("354", "Ed", "Informatika");
            Dosen D1 = new Dosen("666", "Yono", "Informatika");
            Kendaraan K1 = new Kendaraan("AD354TI", "Motor");


            MataKuliah ASA = new MataKuliah("ASA", "Analisis dan Strategi ALgoritma", 3);
            MataKuliah SISCER = new MataKuliah("SISCER", "Sistem Cerdas", 3);
            Mahasiswa M2 = new Mahasiswa("444", "Gar", "Informatika");
            Dosen D2 = new Dosen("999", "Jono", "Informatika");
            Kendaraan K2 = new Kendaraan("L444H", "Mobil");
    
            M1.setDosenWali(D1);
            M1.setKendaraan(K1);
            M1.addMatKul(PBO);
            M1.addMatKul(MBD);


            M1.printDetailMhs();
            System.out.println("Jumlah Mata Kuliah = " + M1.getJumlahMatKul());
            System.out.println("Jumlah SKS Mata Kuliah = " + M1.getJumlahSKS());

            System.out.println();

            M2.setDosenWali(D2);
            M2.setKendaraan(K2);
            M2.addMatKul(SISCER);
            M2.addMatKul(ASA);

            M2.printDetailMhs();
            System.out.println("Jumlah Mata Kuliah = " + M2.getJumlahMatKul());
            System.out.println("Jumlah SKS Mata Kuliah = " + M2.getJumlahSKS());
        
    }
}