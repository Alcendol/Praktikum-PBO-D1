/**
 * File : DAOManager.java
 * Deskripsi : pengelola DAO dalam program
 * Pembuat      : Novanza Edgar Wibowo / 24060123130055
 * Tanggal      : 20 Mei 2025
 */
public class DAOManager {
    private PersonDAO personDAO;

    public void setPersonDAO(PersonDAO dao) {
        this.personDAO = dao;
    }

    public PersonDAO getPersonDAO() {
        return this.personDAO;
    }
}
