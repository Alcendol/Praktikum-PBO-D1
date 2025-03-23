// Nama File : Mmahasiswa.java
// Nama : Rafi Deandra
// NIM : 240122140122

public class Mmahasiswa {
    public static void main(String[] args) {
        //mahasiswa tanpa parameeter  
        Mahasiswa mhs1 = new Mahasiswa();

        mhs1.setNim("24060122.140122");
        mhs1.setNama("Rafi Deandra");
        mhs1.setProdi("Teknik Informatika");


        //membuat mata kuliah tanpa menggunakan parameter
        Matakuliah MK1 = new Matakuliah();
        MK1.setNama("Pemrograman Berbasis Objek");
        MK1.setidMatkul("PBO2025");
        MK1.setSks(7);
        mhs1.addMatKul(MK1);
        
        Matakuliah MK2 = new Matakuliah();
        MK2.setNama("Analisis Strategi Algoritmik");
        MK2.setidMatkul("ASA2025");
        MK2.setSks(7);
        mhs1.addMatKul(MK2);  

        //objek dosenWali tanpa menggunakan parameter 
        Dosen DW1 = new Dosen("0011", "Sumanto", "Sastra Mesin");
        DW1.getnama();
        Dosen DW2 = new Dosen("0001", "Hendarto", "Teknik Informatika");
        DW2.getnama();

        mhs1.setDosenWali(DW1);

        //objek kendaraan tanpa parameter
        Kendaraan Kendaraan = new Kendaraan();
        Kendaraan.setjenis("Motor");
        mhs1.setKendaraan(Kendaraan);
        
        //menampilkan detail mahasiswa 
        mhs1.printDetailMhs();
        //menampilkan jumlah sks yang di ambil 
        System.out.println("Jumlah Sks : " + mhs1.getJumlahSKS());
        //menampilkan jumlah matkul yang di ambil 
        System.out.println("Jumlah Matkul : " + mhs1.getJumlahMatKul());
        System.out.println("\n");

        Mahasiswa mhs2 = new Mahasiswa("24060122140103","Syair Jangkarbumi","Teknik Ancaman" );
        DW2.setnip("0001");
        DW2.setnama("Hendarto");
        DW2.setprodi("Sastra");
        mhs2.setDosenWali(DW2);
        mhs2.setKendaraan(Kendaraan);

       Matakuliah MK3 = new Matakuliah("RPL2025", "Rekayasa Perangkat Lunak", 3);
       Matakuliah MK4 = new Matakuliah("MBD2025", "Manajemen Basis Data", 3);
        mhs2.addMatKul(MK3);
        mhs2.addMatKul(MK4);
        System.out.println("Jumlah Sks yang di ambil : " + mhs2.getJumlahSKS());
        System.out.println("Jumlah Matkul yang di ambil : " + mhs2.getJumlahMatKul());
        mhs2.printDetailMhs();



    }
}