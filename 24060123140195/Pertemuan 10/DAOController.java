public class DAOController {
    private PersonDAO personDAO;

    public void setPersonDAO(PersonDAO dao) {
        this.personDAO = dao;
    }

    public PersonDAO getPersonDAO() {
        return personDAO;
    }
}
