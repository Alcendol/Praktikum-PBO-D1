public class MainDAO {
    public static void main(String[] args) {
        Person person1 = new Person("Indra");
        Person person2 = new Person("Ashley");
        DAOManager m = new DAOManager();

        m.setPersonDAO(new MySQLPersonDAO());

        try {
            m.getPersonDAO().savePerson(person1);
            m.getPersonDAO().savePerson(person2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
