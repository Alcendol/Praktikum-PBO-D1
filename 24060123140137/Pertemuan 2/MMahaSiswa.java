// Nama : Noval putra barliyanda
// NIM  : 24060123140137
// Lab : D1
// Nama File : MMahaSiswa.java

package pertemuan2;

public class MMahaSiswa {
    public static void main(String[] args) {
        // Membuat objek Dosen
        Dosen dosen1 = new Dosen("12345", "Bu Khadijah", "Informatika");

        // Membuat objek Mahasiswa
        MahaSiswa mahasiswa1 = new MahaSiswa("24060123140137", "Noval", "Informatika");
        mahasiswa1.setDosenWali(dosen1);

        // Membuat objek MataKuliah
        MataKuliah matkul1 = new MataKuliah("IF101", "Pemrograman Berbasis Objek", 3);
        MataKuliah matkul2 = new MataKuliah("IF102", "Rekayasa perangkat lunak", 3);

        // Menambahkan mata kuliah ke mahasiswa
        mahasiswa1.addMatKul(matkul1);
        mahasiswa1.addMatKul(matkul2);

        // Membuat objek Kendaraan
        Kendaraan kendaraan1 = new Kendaraan("AB1234CD", "Motor");
        mahasiswa1.setKendaraan(kendaraan1);

        // Menampilkan informasi mahasiswa
        System.out.println("Informasi Mahasiswa:");
        mahasiswa1.printDetailMhs();

        // Menampilkan jumlah mata kuliah dan SKS
        System.out.println("\nJumlah Mata Kuliah: " + mahasiswa1.getJumlahMatKul());
        System.out.println("Total SKS: " + mahasiswa1.getJumlahSKS());
    }
}
