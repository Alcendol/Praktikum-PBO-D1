public class MainDAO {
    public static void main(String[] args) {
        DAOManager manager = new DAOManager();
        Person p = new Person();
        p.setName("Nama Contoh");
        manager.getPersonDAO().insertPerson(p);

        for (Person person : manager.getPersonDAO().getAllPersons()) {
            System.out.println(person.getId() + ": " + person.getName());
        }
    }
}
