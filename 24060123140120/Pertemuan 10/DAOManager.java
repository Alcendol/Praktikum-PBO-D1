/* Nama File : DAOManager.java
*  Deskripsi : Pengelola DAO dalam program
*  Pembuat : Muhammad Shafwan Raihan S_24060123140120
*  Tanggal : 19 / 05 / 2025
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
