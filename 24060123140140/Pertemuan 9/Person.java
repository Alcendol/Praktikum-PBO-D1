public class Person {
    /* Atribut */
    private int id;
    private String name;

    /* Methods */
    public Person (String n){
        name = n;
    }

    public Person (int i, String n){
        id = i;
        name = n;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }
    
}