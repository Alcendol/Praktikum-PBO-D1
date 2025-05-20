public class MMahasiswa {
    public static void main(String[] args) {
        // Membuat objek MataKuliah
        MataKuliah pbo = new MataKuliah("wj123", "Pemrograman Berbasis Objek", 4);
        MataKuliah mbd = new MataKuliah("wj125", "Manajemen Basis Data", 4);

        // Membuat objek Kendaraan
        Kendaraan kendaraan = new Kendaraan("B 12345 AOQ", "Motor");

        // Membuat objek Dosen
        Dosen dosenWali = new Dosen("12345678", "wielino", "Informatika");

        // Membuat objek Mahasiswa
        Mahasiswa mahasiswa = new Mahasiswa("Muhammad Raja Fadhil Habibi", "24060122140131", "Informatika");

        // Menetapkan relasi antar objek
        mahasiswa.setDosen(dosenWali);
        mahasiswa.setKendaraan(kendaraan);
        mahasiswa.addMatkul(mbd);
        mahasiswa.addMatkul(pbo);

        // Menampilkan detail mahasiswa
        mahasiswa.printDetailMhs();

        // Menampilkan jumlah mata kuliah dan SKS
        System.out.println("Jumlah mata kuliah: " + mahasiswa.getJumlahMatkul());
        System.out.println("Jumlah SKS: " + mahasiswa.getJumlahSks());
    }
}