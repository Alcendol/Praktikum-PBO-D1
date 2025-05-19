/**
 * Nama     : Muhammad Firzi Ryadi
 * NIM      : 24060123140202
 * File     : DAOManager.java
 * Deskripsi: Pengelola DAO dalam program
 */

public class DAOManager {
    private PersonDAO personDAO;

    public void setPersonDAO(PersonDAO person) {
        personDAO = person;
    }

    public PersonDAO getPersonDAO() {
        return personDAO;
    }
}
