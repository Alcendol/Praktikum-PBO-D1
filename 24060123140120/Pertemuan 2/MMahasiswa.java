public class MMahasiswa {
    public static void main(String[] args) {
        // Instansiasi Objek
        MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);
        MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3);
        Mahasiswa M1 = new Mahasiswa("24060123140120", "Muhammad Shafwan Raihan S", "Informatika");
        Dosen D1 = new Dosen ("123", "Andi", "Informatika");
        Kendaraan K1 = new Kendaraan("H 3861 TK", "Motor");
        
        M1.setdosenwali(D1);
        M1.setkendaraan(K1);
        M1.addMatkul(PBO);
        M1.addMatkul(MBD);
        M1.printDetailMhs();

        System.out.println("Jumlah Mata Kuliah = " + M1.getjumlahMatkul());
        System.out.println("Jumlah SKS Mata Kuliah = " + M1.getJumlahSKS());
    }
}
