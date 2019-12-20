/**
*Clasa Persoana
 */

public class Person {

    String name; // attribute or instance variable

    // constructor implicit
    public Person () {
        System.out.println("Constructorul implicit a fost apelat");
        this.name= "no name";
    }

    // consructor explicit
    public Person(String name){
        System.out.println("Constructor explicit cu 1 parametru a fost apelat");
        this.name= name;
    }

    //metode
}
