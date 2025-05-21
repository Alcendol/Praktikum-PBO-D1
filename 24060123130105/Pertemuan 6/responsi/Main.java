public class Main {
    public static void main(String[] args) {
        // Test ruangKelas
        ruangKelas kelas1 = new ruangKelas("KLS01", 12, 10, 4, 40, 35, 5);
        kelas1.printRuang();
        System.out.println();

        // Test ruangDosen
        departemen dep1 = new departemen("Informatika", "Dr. Andi", 15000);
        ruangDosen dosen1 = new ruangDosen("DOS01", 8, 6, 3, 5, dep1, "Dr. Budi", 1, 1);
        dosen1.printRuang();
        System.out.println();

        // Test ruangDepartemen
        ruangDepartemen departemen1 = new ruangDepartemen("DEP01", 15, 12, 5, 20, dep1, 10, 5, 3);
        departemen1.printRuang();
        System.out.println();

        // Test labKomputer
        labKomputer labKom1 = new labKomputer("LABK01", 10, 8, 4, 25, "Lab Komputer", 700000, 20);
        labKom1.printRuang();
        System.out.println();

        // Test labNonKom
        String[] mataKuliah = {"Fisika Dasar", "Kimia Dasar"};
        labNonKom labNonKom1 = new labNonKom("LABNK01", 10, 8, 4, 20, "Lab Non-Komputer", 300000, mataKuliah);
        labNonKom1.printRuang();
        System.out.println();

        // counter
        System.out.println("Total ruang: " + ruang.getCounterRuang());
        System.out.println("Total ruang fakultas: " + ruangFakultas.getCounterRuangFakultas());
        System.out.println("Total ruang lab: " + ruangLab.getCounterRuangLab());
        System.out.println("Total ruang kelas: " + ruangKelas.getCounterRuangKelas());
        System.out.println("Total ruang dosen: " + ruangDosen.getCounterRuangDosen());
        System.out.println("Total ruang departemen: " + ruangDepartemen.getCounterRuangDepartemen());
        System.out.println("Total lab komputer: " + labKomputer.getCounterLabKomputer());
        System.out.println("Total lab non-komputer: " + labNonKom.getCounterLabNonKom());
    }
}
