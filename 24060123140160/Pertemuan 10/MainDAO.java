/*
 * Nama File : MainDAO.java
 * Deskripsi : Demo penggunaan DAOManager untuk menyimpan data Person
 * Pembuat   : Pieter Mikha Pangondian Partogi Sihombing / 24060123140160
 * Tanggal   : 20 Mei 2025
 */
public class MainDAO {
    public static void main(String[] args) {

        Person orang = new Person("Ondi");


        DAOManager manager = new DAOManager();
        manager.setPersonDAO(new MySQLPersonDAO());

        try {
            manager.getPersonDAO().savePerson(orang);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}