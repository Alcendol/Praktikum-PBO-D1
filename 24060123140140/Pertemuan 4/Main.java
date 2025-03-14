public class Main {
    public static void main(String[] args) {
        // Membuat objek DosenTetap
        DosenTetap dosenTetap = new DosenTetap(
            "9545647548", 
            "Dr. Sutrisno M.Si", 
            "05/05/1990", 
            "01/01/2015", 
            5000000, 
            "Fakultas Sains dan Matematika", 
            "78647324"
        );
        dosenTetap.printInfo();

        // Membuat objek DosenTamu
        DosenTamu dosenTamu = new DosenTamu(
            "1234567890", 
            "Srisri M.Mes", 
            "10/10/1985", 
            "01/01/2020", 
            4000000, 
            "Fakultas Teknik", 
            "98765432", 
            "31/12/2025"
        );
        dosenTamu.printInfo();

        // Membuat objek Tendik
        Tendik tendik = new Tendik(
            "0987654321", 
            "Pablo escekek M.Si", 
            "15/08/1980", 
            "01/01/2010", 
            3000000, 
            "Akademik"
        );
        tendik.printInfo();
    }
}