public class MainApp {
    public static void main(String[] args) {
        Person person = new Person("Jaka");

        DAOController daoController = new DAOController();
        daoController.setPersonDAO(new MySQLPersonDAO());

        try {
            daoController.getPersonDAO().save(person);
        } catch (Exception e) {
            System.err.println("Error saving person: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
