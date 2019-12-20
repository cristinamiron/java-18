public class PersonTest {
    public static void main(String[] args) {
        Person persoana1= new Person();// obiect de tip persoana
        System.out.println(persoana1.name);
        persoana1.name="Ana";// dam valoare persoanei1, adica numele Ana
        System.out.print("Noul nume al obiectului persoana1 este:" +persoana1.name);

        Person persoana2= new Person ("Bogdan");
        System.out.println(persoana2.name);
        persoana2.name="Alex";//schimbam numele persoanei2
        System.out.println("Noul nume persoana2 este:" +persoana2);



    }
}
