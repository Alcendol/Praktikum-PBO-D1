/*  Nama File   : MMahasiswa.java 
    Deskripsi   : berisi atribut dan method dalam class Mahasiswa
    Pembuat     : Muhammad Paruda Pradayan / 24060123140124
    Tanggal     : 01 - Maret - 2025
*/

public class MMahasiswa {
    public static void main(String[] args) {
        MataKuliah ALIN = new MataKuliah("ALIN", "Aljabar Linier", 3);
        MataKuliah BASDAT = new MataKuliah("BASDAT", "Basis Data", 4);
        MataKuliah STRUKDAT = new MataKuliah("STRUKDAT", "Struktur Data", 4);
        MataKuliah MEP = new MataKuliah("MEP", "Manajemen Etika dan Profesi", 3);
        
        Mahasiswa M1 = new Mahasiswa("124", "Muhammad Paruda Pradayan", "Informatika");
        Dosen D1 = new Dosen("2001", "Rismiyati B.Eng, MCs", "Informatika");
        Kendaraan K1 = new Kendaraan("B5636", "Sepeda Montor");
        
        M1.setDosenWali(D1);
        M1.setKendaraan(K1);
        M1.tambahMatkul(ALIN);
        M1.tambahMatkul(BASDAT);
        M1.tambahMatkul(STRUKDAT);
        M1.tambahMatkul(MEP);
        
        M1.printDetailMhs();
        System.out.println("Jumlah Mata Kuliah: " + M1.getJumlahMatKul());
        System.out.println("Jumlah SKS: " + M1.getJumlahSKS());
    }
}