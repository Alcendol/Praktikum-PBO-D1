public class Main {
    public static void main(String[] args) {
        String name = "ADit";
        String query = "INSERT INTO person(name) VAlUES ('" + name + "')";

        System.out.println(query);
    }
}
