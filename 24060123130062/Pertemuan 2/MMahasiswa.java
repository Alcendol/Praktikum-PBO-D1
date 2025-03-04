package petemuan2.permahasiswaan;
// Nama : Muhammad Mahdi Buntarwatangan
// NIM  : 24060123130062
// Lab : D1
// Nama File : MMahasiswa.java
public class MMahasiswa {
    public static void main(String[] args) {
        Mahasiswa M1 = new Mahasiswa("24060123130062", "Muhammad Mahdi Buntarwatangan", "Informatika");
        MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berbasis Objek", 3);
        MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3);
        MataKuliah Statistika = new MataKuliah("STAT", "Statistika", 2);
        Dosen D1 = new Dosen("197902122008121002", "Indra Waspada", "Informatika");
        Kendaraan K1 = new Kendaraan("B1647ZRO", "Helikopter");
        M1.setDosenWali(D1);
        M1.setKendaraan(K1);
        M1.addMatkul(Statistika);
        M1.addMatkul(PBO);
        M1.addMatkul(MBD);
        M1.printDetailMhs();
    }
    
}
