/**
 * File : MainDAO.java
 * Deskripsi : Main program untuk akses DAO
 * Pembuat      : Novanza Edgar Wibowo / 24060123130055
 * Tanggal      : 20 Mei 2025
 */
public class MainDAO {
    public static void main(String[] args) {
        // buat objek Person
        Person person = new Person("Indra");

        // siapkan manager dan DAO implementasi
        DAOManager m = new DAOManager();
        m.setPersonDAO(new MySQLPersonDAO());

        try {
            // simpan ke database
            m.getPersonDAO().savePerson(person);
            System.out.println("Data berhasil disimpan.");
        } catch (Exception e) {
            System.err.println("Gagal menyimpan data:");
            e.printStackTrace();
        }
    }
}
