public class MainDAO{
    public static void main(String[] args) {
        Person person = new Person("Buntar");
        Person person2 = new Person("Nabil");
        DAOManajer m = new DAOManajer();
        DAOManajer m2 = new DAOManajer();

        m.setPersonDAO(new MySQLPersonDAO());
        m2.setPersonDAO(new MySQLPersonDAO());

        try {
            m.getPersonDAO().savePerson(person2);
            m2.getPersonDAO().deletePerson(person2);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}