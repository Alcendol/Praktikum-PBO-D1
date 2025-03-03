public class mMahasiswa {
    public static void main(String[] args) {
        // Membuat objek mata kuliah
        MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);
        MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3);

        // Membuat objek mahasiswa
        mahasiswa M1 = new mahasiswa("234", "Helmi", "Informatika");

        // Membuat objek dosen
        dosen D1 = new dosen("123", "Rakan", "Informatika");

        // Membuat objek kendaraan
        kendaraan K1 = new kendaraan("H1234AB", "Motor");

        // Menghubungkan mahasiswa dengan dosen dan kendaraan
        M1.setDosenwali(D1);
        M1.setKendaraan(K1);

        // Menambahkan mata kuliah ke mahasiswa
        M1.addMatkul(PBO);
        M1.addMatkul(MBD);

        // Menampilkan detail mahasiswa
        M1.printDetailMhs();

        // Menampilkan jumlah mata kuliah dan total SKS
        System.out.println("Jumlah Mata Kuliah = " + M1.getJumlahMatkul());
        System.out.println("Jumlah SKS Mata Kuliah = " + M1.getJumlahSKS());
    }
}
