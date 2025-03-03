/* Nama File : MataKuliah.java
 * Deskripsi : Berisi program utama untuk menguji method dalam class Mahasiswa
 * Pembuat : Patricia Gabrielle Yudianto
 * Tanggal : 2 Maret 2025
 */
public class MMahasiswa {
    public static void main(String[] args) {
        // Membuat object MataKuliah
        MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 4);
        MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3);
        MataKuliah KMD = new MataKuliah("KMD", "Kimia Dasar", 3);
        MataKuliah FSD = new MataKuliah("FSD", "Fisika Dasar", 4);

        // Membuat object Mahasiswa
        Mahasiswa M1 = new Mahasiswa("123", "Childe", "Informatika");
        Mahasiswa M2 = new Mahasiswa("124", " Gil Somyung", "Kimia");

        // Membuat object Dosen
        Dosen D1 = new Dosen("234", "Zhongli", "Informatika");
        Dosen D2 = new Dosen("235", "Myung Somin", "Kimia");

        // Membuat object Kendaraan
        Kendaraan K1 = new Kendaraan("H1234AB", "motor");
        Kendaraan K2 = new Kendaraan("H29321KR", "mobil");

        // Mengeset dosenWali serta kendaraan pada object mahasiswa
        M1.setDosenWali(D1);
        M1.setKendaraan(K1);
        M2.setDosenWali(D2);
        M2.setKendaraan(K2);

        // Menambah mata kuliah pada object mahasiswa
        M1.addMatkul(PBO);
        M1.addMatkul(MBD);
        M2.addMatkul(KMD);
        M2.addMatkul(FSD);

        // Menampilkan detail mahasiswa
        M1.printDetailMhs();
        System.out.println("Jumlah Mata Kuliah : " + M1.getJumlahMatKul());
        System.out.println("Jumlah SKS : " + M1.getJumlahSKS());

        M2.printDetailMhs();
        System.out.println("Jumlah Mata Kuliah : " + M2.getJumlahMatKul());
        System.out.println("Jumlah SKS : " + M2.getJumlahSKS());
    }
}
