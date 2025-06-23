/**
 * Nama     : Muhammad Firzi Ryadi
 * NIM      : 24060123140202
 * File     : MainDAO.java
 * Deskripsi: Main program untuk akses DAO
 */

public class MainDAO {
    public static void main(String args[]) {
        Person person1 = new Person("Indra");
        Person person2 = new Person("Adit");
        Person person3 = new Person("DONTOL");
        DAOManager m = new DAOManager();
        m.setPersonDAO(new MySQLPersonDAO());

        try {
            m.getPersonDAO().savePerson(person1);
            m.getPersonDAO().savePerson(person2);
            m.getPersonDAO().savePerson(person3);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("person1: " + person1.getName());
        System.out.println("person2: " + person2.getName());
        System.out.println("person3: " + person3.getName());



    }
}

